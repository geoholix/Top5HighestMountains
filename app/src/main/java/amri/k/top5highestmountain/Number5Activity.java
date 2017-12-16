package amri.k.top5highestmountain;

import android.content.Intent;
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
        Utils.showOnMap(this, "gunung sanggar");
    }

    public void showVideo (View view) {
        Utils.showVideo(this, "j0nxpbAUTTI");
    }

    public void GoTo4(View view) {
        Intent pindah4 = new Intent(Number5Activity.this, Number4Activity.class);
        startActivity(pindah4);
    }

    public void BackToHome(View view) {
        Intent pindahHome = new Intent(Number5Activity.this, MainActivity.class);
        startActivity(pindahHome);
    }
}
