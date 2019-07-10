package com.androidwind.image.base;

import android.widget.ImageView;

import com.bumptech.glide.load.engine.DiskCacheStrategy;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class BaseImageOptions { //图片基本属性
    protected int resId;
    protected String url;
    protected ImageView imageView;
    protected int placeholder;
    protected int errorImage;

    public int getResId() {
        return resId;
    }

    public String getUrl() {
        return url;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public int getPlaceholder() {
        return placeholder;
    }

    public int getErrorImage() {
        return errorImage;
    }
}
