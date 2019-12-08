package com.example.sharedpreferencesanddatabinding;

import android.content.Context;
import android.content.SharedPreferences;

public class UserAuthPreference {
    private SharedPreferences sharedPreferences;
    private UserAuthPreference authPreference;
    private SharedPreferences.Editor editor;
    Context context;


    public UserAuthPreference(Context context) {
       sharedPreferences= context.getSharedPreferences("Auth preferences",Context.MODE_PRIVATE);
       editor=sharedPreferences.edit();
       editor.commit();
    }
}
