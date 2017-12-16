package amri.k.top5highestmountain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Number1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number1);

        Toast.makeText(this, "1st Place, The Highest Mountain", Toast.LENGTH_SHORT).show();
    }

    public void showOnMap (View view) {
        Utils.showOnMap(this, "Puncak Jaya");
    }

    public void showVideo (View view) {
        Utils.showVideo(this, "xKKjVGfzLr8");
    }



    public void BackTo2(View view) {
        Intent pindah2 = new Intent(Number1Activity.this, Number2Activity.class);
        startActivity(pindah2);
    }
}
