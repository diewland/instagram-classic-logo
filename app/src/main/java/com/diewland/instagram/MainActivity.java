package com.diewland.instagram;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage("com.instagram.android");
        intent.setFlags(0x10000000);
        intent.setComponent(new ComponentName("com.instagram.android",
                                              "com.instagram.android.activity.MainTabActivity"));
        startActivityForResult(intent, 0);

        finish();
    }
}
