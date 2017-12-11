package pl.dom3k.simplebroadcaster;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.net.ConnectivityManager.CONNECTIVITY_ACTION;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TODO - we could register some events in here, for instance.
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

//        TODO – we should always remember about unregistering events!
    }
}
