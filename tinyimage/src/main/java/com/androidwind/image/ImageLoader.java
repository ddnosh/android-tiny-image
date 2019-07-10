package com.androidwind.image;

import android.content.Context;

import com.androidwind.image.base.BaseImageOptions;
import com.androidwind.image.base.BaseStrategy;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class ImageLoader {
    private static volatile ImageLoader sInstance = null;

    private BaseStrategy strategy;

    public void setStrategy(BaseStrategy strategy) {
        this.strategy = strategy;
    }

    private ImageLoader() {

    }

    public static ImageLoader getInstance() {
        if (sInstance == null) {
            synchronized (ImageLoader.class) {
                if (sInstance == null) {
                    sInstance = new ImageLoader();
                }
            }
        }
        return sInstance;
    }

    public void loadImage(Context context, BaseImageOptions options) {
        if (context != null && options != null && strategy != null) {
            strategy.displayImage(context, options);
        }
    }
}
