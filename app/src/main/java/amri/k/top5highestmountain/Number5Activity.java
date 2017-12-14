package amri.k.top5highestmountain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Number5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number5);

        Toast.makeText(this, "Number 5th", Toast.LENGTH_SHORT).show();
    }
    public void showOnMap (View view) {
        Utils.showOnMap(this, getString(R.string.mtSanggar));
    }
    public void showVideo (View view) {
        Utils.showVideo(this, getString(R.string.id05));
    }

}
