package com.example.zingme.a5050wordgame;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PrimaryActivity extends AppCompatActivity {
    FragmentManager fm;
    FragmentTransaction ft;
    SharedPreferences sPref;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary);
        fm=getSupportFragmentManager();
        ft=fm.beginTransaction();
        sPref=getSharedPreferences(getPackageName(), Context.MODE_PRIVATE);
        editor=sPref.edit();


        if(sPref.getBoolean("first", true)){
            // get playername


        }else {
            // proceed with game
        }


    }
}
