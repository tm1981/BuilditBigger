package il.co.techmobile.jockactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jock);

        Intent intent = getIntent();
        String jock = intent.getStringExtra("jock");
        TextView textView = findViewById(R.id.jock);
        textView.setText(jock);
    }
}
