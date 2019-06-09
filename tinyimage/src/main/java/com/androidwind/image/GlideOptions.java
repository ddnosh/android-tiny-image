package com.androidwind.image;

import android.widget.ImageView;

import com.bumptech.glide.load.engine.DiskCacheStrategy;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class GlideOptions extends BaseImageOptions {

    private DiskCacheStrategy diskCacheStrategy;
    private int width;
    private int height;
    private boolean isGif;

    private GlideOptions(Builder builder) {
        this.resId = builder.resId;
        this.url = builder.url;
        this.imageView = builder.imageView;
        this.placeholder = builder.placeholder;
        this.errorImage = builder.errorImage;
        this.diskCacheStrategy = builder.cache;
        this.width = builder.width;
        this.height = builder.height;
        this.isGif = builder.isGif;
    }

    public DiskCacheStrategy getCacheStrategy() {
        return diskCacheStrategy;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isGif() {
        return isGif;
    }

    public static Builder builder() {
        return new Builder();
    }

    // Builder模式
    public static final class Builder {
        private int resId;
        private String url;
        private ImageView imageView;
        private int placeholder;
        private int errorImage;
        private DiskCacheStrategy cache;
        private int width;
        private int height;
        private boolean isGif;

        private Builder() {
        }

        public Builder resId(int resId) {
            this.resId = resId;
            return this;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder imageView(ImageView imageView) {
            this.imageView = imageView;
            return this;
        }

        public Builder placeholder(int placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        public Builder errorImage(int errorImage) {
            this.errorImage = errorImage;
            return this;
        }

        public Builder cache(DiskCacheStrategy cache) {
            this.cache = cache;
            return this;
        }

        public Builder width(int width) {
            this.width = width;
            return this;
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Builder gif(boolean isGif) {
            this.isGif = isGif;
            return this;
        }

        public GlideOptions build() {
            return new GlideOptions(this);
        }
    }
}
