package pl.dom3k.simplebroadcaster;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by domek on 11.12.2017.
 */

class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Woo! I received something!", Toast.LENGTH_LONG).show();
    }
}
