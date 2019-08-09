package com.androidwind.image.tiny;

import android.graphics.Bitmap;

import com.androidwind.image.base.BaseImageOptions;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class TinyOptions extends BaseImageOptions {
    private int width;
    private int height;
    private TinyImageCallback callback;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public TinyImageCallback getCallback() {
        return callback;
    }

    public void setCallback(TinyImageCallback callback) {
        this.callback = callback;
    }

    public interface TinyImageCallback {
        void OnSuccess(Bitmap bitmap);

        void OnFail();
    }
}