package amri.k.top5highestmountain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Number3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number3);

        Toast.makeText(this, "Number 3rd", Toast.LENGTH_SHORT).show();
    }
    public void showOnMap (View view) {
        Utils.showOnMap(this, "rinjani");
    }

    public void showVideo (View view) {
        Utils.showVideo(this, "Won4nfQRBDg");
    }

    public void Goto2(View view) {
        Intent pindah2 = new Intent(Number3Activity.this, Number2Activity.class);
        startActivity(pindah2);
    }

    public void BackTo4(View view) {
        Intent pindah4 = new Intent(Number3Activity.this, Number4Activity.class);
        startActivity(pindah4);
    }
}
