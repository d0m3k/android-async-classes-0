package pl.dom3k.simplebroadcaster;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import static android.net.ConnectivityManager.CONNECTIVITY_ACTION;

public class MainActivity extends AppCompatActivity {
    private Cursor cursor;

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
                if (cursor != null){
                    cursor.close();
                }
                cursor = initCursor();
                if (cursor.getCount() < 1){
                    textToAdd.setText(R.string.nothing_to_show);
                    return;
                }
                textToAdd.setText(R.string.something_found);
            }
        });

        findViewById(R.id.next_cursor).setOnClickListener(new View.OnClickListener() {
            TextView textToAdd = findViewById(R.id.content_provider_text);

            @Override
            public void onClick(View view) {
                if (cursor == null) {
                    textToAdd.setText(R.string.no_fetched);
                    return;
                }
                if (cursor.isAfterLast() || cursor.isLast()) {
                    textToAdd.setText(R.string.cursor_end);
                    return;
                }
                cursor.moveToNext();
                textToAdd.setText(cursor.getString(0));
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

    private Cursor initCursor() {
        String[] projection = {"message"};
        Uri uri = Uri.parse("content://pl.dom3k.broadcaster2.MyContentProvider/tableName");
        return getContentResolver().query(uri, projection, null, null, null);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (cursor != null){
            cursor.close();
        }
//        TODO – we should always remember about unregistering events!
    }
}
