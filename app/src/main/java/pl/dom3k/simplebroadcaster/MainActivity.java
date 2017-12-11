package pl.dom3k.simplebroadcaster;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import static android.net.ConnectivityManager.CONNECTIVITY_ACTION;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TODO - we could register some events in here, for instance.



//        TODO – do some actions regarding showing data from Content Provider:
        findViewById(R.id.fetch_cursor).setOnClickListener(new View.OnClickListener() {
            TextView textToAdd = findViewById(R.id.content_provider_text);

            @Override
            public void onClick(View view) {
//                TODO – do something to get the cursor, and (possibly) its first element
            }
        });

        findViewById(R.id.next_cursor).setOnClickListener(new View.OnClickListener() {
            TextView textToAdd = findViewById(R.id.content_provider_text);

            @Override
            public void onClick(View view) {
//                TODO – fetch next element in cursor or inform about its end, when comes.
            }
        });

        findViewById(R.id.cat_button).setOnClickListener(new View.OnClickListener() {
            ImageButton imageButton = findViewById(R.id.cat_button);

            @Override
            public void onClick(View view) {
//                TODO – Download cat image from internet and put as image.
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

//        TODO – we should always remember about unregistering events!
    }
}
