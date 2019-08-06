package com.androidwind.image.tiny;

import android.graphics.Bitmap;

import com.androidwind.image.base.BaseImageOptions;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class TinyOptions extends BaseImageOptions {
    private TinyImageCallback callback;

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