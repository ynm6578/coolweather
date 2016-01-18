package com.coolweather.app.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.coolweather.app.service.AutoUpdateService;

/**
 * Created by WJ on 2016/1/18.
 */
public class AutoUpdateReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i=new Intent(context, AutoUpdateService.class);
        Toast.makeText(context,"自动更新了天气",Toast.LENGTH_SHORT).show();
        context.startService(i);
    }
}
