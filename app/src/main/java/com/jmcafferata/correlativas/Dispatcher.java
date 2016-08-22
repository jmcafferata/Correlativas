package com.jmcafferata.correlativas;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Dispatcher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Class<?> activityClass;

        try {
            SharedPreferences prefs = getSharedPreferences("X", MODE_PRIVATE);
            activityClass = Class.forName(
                    prefs.getString("lastActivity", MainActivity.class.getName()));
        } catch(ClassNotFoundException ex) {
            activityClass = MainActivity.class;
        }

        Intent intent = new Intent(this,activityClass);
        intent.putExtra("isIt",false);
        intent.putExtra("c","goBack");
        startActivity(intent);
        finish();
    }
}