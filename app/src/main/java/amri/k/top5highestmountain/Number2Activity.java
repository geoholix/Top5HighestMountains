package amri.k.top5highestmountain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Number2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number2);

        Toast.makeText(this, "Number 2nd", Toast.LENGTH_SHORT).show();
    }

    public void showOnMap (View view) {
        Utils.showOnMap(this, "Puncak Gunung Kerinci");
    }

    public void showVideo (View view) {
        Utils.showVideo(this, "yeqOWtA3RFE");
    }

    public void Goto1(View view) {
        Intent pindah1 = new Intent(Number2Activity.this, Number1Activity.class);
        startActivity(pindah1);
    }

    public void BackTo3(View view) {
        Intent pindah3 = new Intent(Number2Activity.this, Number3Activity.class);
        startActivity(pindah3);
    }
}
