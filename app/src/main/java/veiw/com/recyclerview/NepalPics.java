package veiw.com.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NepalPics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nepal_pics);

        Intent intent = getIntent();
         String activity = intent.getStringExtra("Extra");
        TextView textView = findViewById(R.id.textView2);
        textView.setText(activity);
    }
}
