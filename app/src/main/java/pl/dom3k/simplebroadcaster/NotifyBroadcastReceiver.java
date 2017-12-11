package pl.dom3k.simplebroadcaster;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by domek on 11.12.2017.
 */

public class NotifyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String data = intent.getStringExtra("data");
        Log.i("work", "Fetching between apps");
        Toast.makeText(context, "I noticed you: " + data, Toast.LENGTH_LONG).show();
    }
}
