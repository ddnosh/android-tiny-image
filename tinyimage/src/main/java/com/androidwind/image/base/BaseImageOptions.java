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

    public void setResId(int resId) {
        this.resId = resId;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public void setPlaceholder(int placeholder) {
        this.placeholder = placeholder;
    }

    public void setErrorImage(int errorImage) {
        this.errorImage = errorImage;
    }
}
