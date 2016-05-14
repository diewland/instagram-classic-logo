package com.diewland.instagram;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {

            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setPackage("com.instagram.android");
            intent.setFlags(0x10000000);
            intent.setComponent(new ComponentName("com.instagram.android",
                                                  "com.instagram.android.activity.MainTabActivity"));
            startActivityForResult(intent, 0);
        }
        catch(Exception e){
            Toast.makeText(this,
                           "Please install official instagram first",
                           Toast.LENGTH_LONG).show();
            // go to play store
            /*
            String appPackageName = "com.instagram.android";
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
            } catch (android.content.ActivityNotFoundException anfe) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
            }
            */
        }

        finish();
    }
}
