package com.androidwind.image.tiny;

import android.content.Context;

import com.androidwind.image.base.BaseStrategy;
import com.androidwind.image.glide.GlideManager;
import com.androidwind.image.glide.GlideOptions;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class TinyStrategy implements BaseStrategy<TinyOptions> {
    @Override
    public void displayImage(Context context, TinyOptions options) {
        TinyManager.getInstance().display(context, options);
    }

}
