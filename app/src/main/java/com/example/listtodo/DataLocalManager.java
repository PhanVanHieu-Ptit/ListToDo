package com.example.listtodo;

import android.content.Context;

import java.util.Set;

public class DataLocalManager {
    private static final String Pref_First_Intall = "Pref_First_Intall";
    private static final String Pref_Name_User = "Pref_Name_User";
    private static DataLocalManager instance;
    private MySharePreferences mySharePreferences;

    public static void init(Context context){
        instance = new DataLocalManager();
        instance.mySharePreferences = new MySharePreferences(context);
    }

    public static DataLocalManager getInstance(){
        if (instance== null){
            instance = new DataLocalManager();
        }
        return instance;
    }

    public static void setFirstIntalled(boolean isFirst){
        DataLocalManager.getInstance().mySharePreferences.putBooleanValue(Pref_First_Intall, isFirst);
    }
    public static boolean getFirstIntalled(){
       return DataLocalManager.getInstance().mySharePreferences.getBooleanValue(Pref_First_Intall);
    }
    public static void setNameUsers(Set<String> nameUsers){
        DataLocalManager.getInstance().mySharePreferences.putStringSetValue(Pref_Name_User, nameUsers);
    }
    public static Set<String> getNameUsers(){
        return DataLocalManager.getInstance().mySharePreferences.getStringSetValue(Pref_Name_User);
    }
}
