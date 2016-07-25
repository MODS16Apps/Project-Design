package com.example.modsexplorer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


public class MyBroadcastReceiver extends BroadcastReceiver {
    public MyBroadcastReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.w("myApp", "onReceive");
        if (intent.getAction().equals("org.app.mods.ecoscapes")) { //place package in green.
            Intent i = new Intent(context, MODSExplorerMap.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
            Log.w("myApp", "org.app.mods.ecoscapes");
        }
    }

}