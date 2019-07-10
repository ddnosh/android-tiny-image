package com.androidwind.image.base;

import android.content.Context;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public interface BaseStrategy<T> {

    void displayImage(Context context, T options);
}
