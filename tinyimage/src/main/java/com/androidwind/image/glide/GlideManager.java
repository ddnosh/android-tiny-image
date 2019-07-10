package com.androidwind.image.glide;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import com.bumptech.glide.DrawableTypeRequest;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class GlideManager {

    private static volatile GlideManager sInstance = null;

    private GlideManager() {

    }

    public static GlideManager getInstance() {
        if (sInstance == null) {
            synchronized (GlideManager.class) {
                if (sInstance == null) {
                    sInstance = new GlideManager();
                }
            }
        }
        return sInstance;
    }

    public void display(Context context, GlideOptions options) {
        if (context != null && options != null) {
            RequestManager requestManager = Glide.with(context);
            DrawableTypeRequest request = getDrawableTypeRequest(options, requestManager);

            // 设定图片长宽
            if (options.getWidth() != 0 && options.getHeight() != 0) {
                request.override(options.getWidth(), options.getHeight());
            }
            // 磁盘存储
            if (options.getCacheStrategy() != null) {
                request.diskCacheStrategy(options.getCacheStrategy());
            }
            // gif动画
            if (options.isGif()) {
                request.asGif();
            }
            // imageView控件
            if (options.getImageView() != null) {
                request.into(options.getImageView());
            }
        }
    }

    private DrawableTypeRequest getDrawableTypeRequest(GlideOptions options, RequestManager requestManager) {
        DrawableTypeRequest request = null;
        if (!TextUtils.isEmpty(options.getUrl())) { // 网络加载
            request = requestManager.load(options.getUrl());
            Log.e("TAG", "getUrl : " + options.getUrl());
        } else if (options.getResId() > 0) { // 本地加载
            request = requestManager.load(options.getResId());
            Log.e("TAG", "getResId : " + options.getResId());
        }
        return request;
    }
}
