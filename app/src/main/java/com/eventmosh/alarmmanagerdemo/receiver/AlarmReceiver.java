package com.eventmosh.alarmmanagerdemo.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.eventmosh.alarmmanagerdemo.service.RuningService;

public class AlarmReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, RuningService.class);
        context.startService(i);
        Toast.makeText(context,"AlarmReceiver",Toast.LENGTH_SHORT).show();
    }


}
