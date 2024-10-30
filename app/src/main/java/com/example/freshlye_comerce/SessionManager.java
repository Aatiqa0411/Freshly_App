package com.example.freshlye_comerce;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager {
    private final SharedPreferences sharedPreferences;
    private final SharedPreferences.Editor editor;

    public SessionManager(Context context) {
        sharedPreferences = context.getSharedPreferences("FreshlyPrefs", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void saveLogin(int userId, String userType) {
        editor.putInt("user_id", userId);
        editor.putString("user_type", userType);
        editor.apply();
    }

    public int getUserId() {
        return sharedPreferences.getInt("user_id", -1);
    }

    public String getUserType() {
        return sharedPreferences.getString("user_type", null);
    }

    public void clearSession() {
        editor.clear();
        editor.apply();
    }
}
