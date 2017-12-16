package amri.k.top5highestmountain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Number4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number4);

        Toast.makeText(this, "Number 4th", Toast.LENGTH_SHORT).show();
    }
    public void showOnMap (View view) {
        Utils.showOnMap(this, "mahameru");
    }

    public void showVideo (View view) {
        Utils.showVideo(this, "y-_azPBMd9g");
    }

    public void Goto3(View view) {
        Intent pindah3 = new Intent(Number4Activity.this, Number3Activity.class);
        startActivity(pindah3);
    }

    public void BackTo5(View view) {
        Intent pindah5 = new Intent(Number4Activity.this, Number5Activity.class);
        startActivity(pindah5);
    }
}
