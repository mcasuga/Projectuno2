package training.mccasugadev.com.project_uno_2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button secondActivityButton = (Button) findViewById(R.id.secondActivityButton);
        Button googleButton = (Button) findViewById(R.id.googleButton);

        // Launch an activity within our application
        secondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Intent to start the second activity
                Intent startSecondActivity = new Intent(getApplicationContext(), SecondActivity.class);

                // Add extra information. get this by getIntent.hasExtra()
                startSecondActivity.putExtra("training.mccasugadev.com.project_uno_2.EXTRA", "Spenz pogi");
                startActivity(startSecondActivity);
            }
        });

        googleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String googleURL = "http://www.google.com";
                Uri googleWebAddress = Uri.parse(googleURL);

                Intent launchGoogle = new Intent(Intent.ACTION_VIEW, googleWebAddress);
                if (launchGoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(launchGoogle);
                } else {
                    System.err.println("ERROR: Cannot find an app");
                }
            }
        });
    }
}
