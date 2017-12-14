package amri.k.top5highestmountain;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

/**
 * Created by amri on 12/6/2017.
 */

public class Utils {

    public static void showOnMap (Context context, String address){

        Uri gmapUri = Uri.parse("geo:0,0?z=18&q=" + Uri.encode(address));
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmapUri);
        mapIntent.setPackage("com.google.android.apps.maps");

        if (mapIntent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(mapIntent);
        }else {
            Toast.makeText(context.getApplicationContext(), "No Application to open map", Toast.LENGTH_SHORT).show();
        }

    }

    public static void showVideo (Context context, String videoId) {

        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + videoId));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=" + videoId));
        try {
            context.startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            context.startActivity(webIntent);
        }

    }
}
