package amri.k.top5highestmountain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartApp(View view) {
        Intent pindah5 = new Intent(MainActivity.this, Number5Activity.class);
        startActivity(pindah5);
    }
}
