package amri.k.top5highestmountain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FeedbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
    }


    public void sendEmail(View view) {
        EditText from = findViewById(R.id.editTextFrom);
        String fromText = from.getText().toString();
        EditText subject = findViewById(R.id.editTextSubject);
        String subjectText = subject.getText().toString();
        EditText message = findViewById(R.id.editTextMessage);
        String bodyMessage = "This Message sent from: " + fromText;
        bodyMessage += "\n input for this app: " + message.getText().toString();
        Utils.composeEmail(this, subjectText, bodyMessage);
        finish();
    }
}
