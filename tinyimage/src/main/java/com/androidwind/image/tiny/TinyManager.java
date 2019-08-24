package com.androidwind.image.tiny;

import android.content.Context;
import android.graphics.Bitmap;

import com.androidwind.http.HttpUtil;
import com.androidwind.http.TinyHttp;
import com.androidwind.http.callback.BitmapHttpCallBack;
import com.androidwind.http.callback.ImageHttpCallBack;
import com.androidwind.image.util.BitmapUtil;
import com.androidwind.image.util.StringUtil;
import com.androidwind.task.Task;
import com.androidwind.task.TinyTaskExecutor;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class TinyManager {
    private static volatile TinyManager sInstance = null;

    private TinyManager() {

    }

    public static TinyManager getInstance() {
        if (sInstance == null) {
            synchronized (TinyManager.class) {
                if (sInstance == null) {
                    sInstance = new TinyManager();
                }
            }
        }
        return sInstance;
    }

    public void display(Context context, final TinyOptions options) {
        if (context != null && options != null) {
            //placeholder
            if (options.getPlaceholder() > 0 && options.getImageView() != null) {
                options.getImageView().setImageResource(options.getPlaceholder());
            }
            //url
            if (!StringUtil.isEmpty(options.getUrl())) {
                TinyHttp.get()
                        .url(options.getUrl())
                        .callback(new BitmapHttpCallBack() {
                            @Override
                            public void OnMainSuccess(final Bitmap bitmap) {
                                TinyTaskExecutor.execute(new Task<Bitmap>() {
                                    @Override
                                    public Bitmap doInBackground() {
                                        return handleBitmap(bitmap, options);
                                    }

                                    @Override
                                    public void onSuccess(Bitmap bitmap) {
                                        options.getImageView().setImageBitmap(bitmap);
                                    }

                                    @Override
                                    public void onFail(Throwable throwable) {

                                    }
                                });
                            }

                            @Override
                            public void OnMainFail(String errorMessage) {

                            }
                        }.outputDir(HttpUtil.getLogDir(context))).execute();
            } else {

            }
        }
    }

    private Bitmap handleBitmap(Bitmap bitmap, TinyOptions options) {
        //width && height
        if (options.getWidth() > 0 || options.getHeight() > 0) {
            return BitmapUtil.scaleImageTo(bitmap, options.getWidth(), options.getHeight());
        }
        return bitmap;
    }
}
