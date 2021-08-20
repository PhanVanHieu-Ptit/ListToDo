package com.example.listtodo;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashSet;
import java.util.Set;

public class MySharePreferences {
    private static final String My_Share_Inferences = "My_Share_Inferences";
    private Context mContext;

    public MySharePreferences(Context mContext){
        this.mContext = mContext;
    }

    public void putBooleanValue(String key, Boolean value){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(My_Share_Inferences, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putBoolean(key,value);
        editor.apply();
    }
    public boolean getBooleanValue(String key){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(My_Share_Inferences, Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(key,false);
    }
    public void putStringValue(String key, String value){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(My_Share_Inferences, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putString(key,value);
        editor.apply();
    }
    public String getStringValue(String key){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(My_Share_Inferences, Context.MODE_PRIVATE);
        return sharedPreferences.getString(key,"");
    }
    public void putStringSetValue(String key, Set<String> values){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(My_Share_Inferences, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putStringSet(key,values);
        editor.apply();
    }
    public Set<String> getStringSetValue(String key){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(My_Share_Inferences, Context.MODE_PRIVATE);
        Set<String> valueDefault= new HashSet<>();
        return sharedPreferences.getStringSet(key,valueDefault);
    }
}
