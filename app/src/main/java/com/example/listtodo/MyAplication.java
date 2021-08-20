package com.example.listtodo;

import android.app.Application;

public class MyAplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DataLocalManager.init(getApplicationContext());
    }
}
