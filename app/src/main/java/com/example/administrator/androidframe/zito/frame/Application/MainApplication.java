package com.example.administrator.androidframe.zito.frame.Application;

import android.app.Application;

import org.xutils.x;

/**
 * Created by Administrator on 2016/5/27.
 */
public class MainApplication  extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);//xUtils3初始化
    }
}
