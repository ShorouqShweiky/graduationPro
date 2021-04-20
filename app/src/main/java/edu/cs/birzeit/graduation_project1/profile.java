package edu.cs.birzeit.graduation_project1;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class profile extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //initialized and assign variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        //set home selected
        bottomNavigationView.setSelectedItemId(R.id.anProfile);
        //perform itemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.anHome:
                        startActivity(new Intent(getApplicationContext()
                                , MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.anProfile:
                        return true;
                    case R.id.anNotification:
                        startActivity(new Intent(getApplicationContext()
                                , notification.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.anSearch:
                        startActivity(new Intent(getApplicationContext()
                                , Search.class));
                        overridePendingTransition(0, 0);
                        return true;

                }

                return false;
            }
        });
        textView = (TextView) findViewById(R.id.privacy);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profile.this, privacy.class);
                startActivity(intent);
            }
        });
        textView = (TextView) findViewById(R.id.connected);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profile.this, connectedDevice.class);
                startActivity(intent);
            }

        });

        textView = (TextView) findViewById(R.id.report);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profile.this, Report.class);
                startActivity(intent);
            }
        });

    }



    public void Privacy(View view) {
    }

    public void ConnectedD(View view) {
    }

    public void Reports(View view) {
    }
}