package com.coolweather.app.util;

/**
 * Created by WJ on 2016/1/18.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onErroe(Exception e);
}
