package pl.dom3k.simplebroadcaster;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageButton;

import java.net.URL;

public class CatTask extends AsyncTask<Void, Void, Bitmap> {

    private static final String ADDRESS = "http://thecatapi.com/api/images/get?format=src&type=png";

    private final ImageButton imageButton;

    public CatTask(ImageButton imageButton) {
        this.imageButton = imageButton;
    }

    @Override
    protected Bitmap doInBackground(Void... voids) {
        Bitmap bitmap = null;
        try {
            URL url = new URL(ADDRESS);
            bitmap = BitmapFactory.decodeStream(url.openConnection().getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        imageButton.setImageBitmap(bitmap);
    }
}
