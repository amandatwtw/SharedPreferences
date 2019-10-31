package com.example.responsi_0288.SharedPreferences;

import android.content.ContentProvider;
import android.content.Context;
import android.content.SharedPreferences;

public class SharedPref {

    private static SharedPref INSTANCE;
    private SharedPreferences sharedPreference;

    private SharedPref (Context context) {
        sharedPreference = context
                .getApplicationContext()
                .getSharedPreferences("com.example.responsi_0292", Context.MODE_PRIVATE);
    }

    public static SharedPref getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new SharedPref(context);
        }
        return INSTANCE;
    }
    public SharedPreferences Pref () { return sharedPreference;}
    public Boolean isLogin ( ) {return sharedPreference.getBoolean("isLogin", false);}

    public void setLogin (boolean isCall) {
        sharedPreference.edit ().putBoolean("isLogin", isCall).apply();
    }

    public void  setName (String isName) {
        sharedPreference.edit().putString("isName", isName).apply();
    }


}

