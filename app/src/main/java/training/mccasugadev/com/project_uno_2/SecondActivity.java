package training.mccasugadev.com.project_uno_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Check if there is an extra attached to the intent
        if (getIntent().hasExtra("training.mccasugadev.com.project_uno_2.EXTRA")) {
            TextView secondActivtyTextView = findViewById(R.id.secondActivtyTextView);
            String theText = getIntent().getExtras().getString("training.mccasugadev.com.project_uno_2.EXTRA");
            secondActivtyTextView.setText(theText);
        }
    }
}
