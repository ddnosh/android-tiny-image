package com.androidwind.image.glide;

import android.content.Context;

import com.androidwind.image.base.BaseStrategy;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class GlideStrategy implements BaseStrategy<GlideOptions> {
    @Override
    public void displayImage(Context context, GlideOptions options) {
        GlideManager.getInstance().display(context, options);
    }

}
