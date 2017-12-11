package pl.dom3k.simplebroadcaster;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.net.ConnectivityManager.CONNECTIVITY_ACTION;

public class MainActivity extends AppCompatActivity {

    BroadcastReceiver br = new MyBroadcastReceiver();
    BroadcastReceiver br2 = new NotifyBroadcastReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter filter = new IntentFilter(CONNECTIVITY_ACTION);
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        this.registerReceiver(br, filter);

        IntentFilter filter2 = new IntentFilter("pl.dom3k.broadcaster2.broadcast.MY_NOTIFICATION");
        this.registerReceiver(br2, filter2);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        unregisterReceiver(br);
        unregisterReceiver(br2);
    }
}
