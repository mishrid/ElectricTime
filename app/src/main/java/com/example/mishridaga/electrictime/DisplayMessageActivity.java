package com.example.mishridaga.electrictime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class DisplayMessageActivity extends AppCompatActivity {

    public static final Map<String,Double> speeds;
    static {
        speeds = new HashMap<>();
        speeds.put("Walking",3.1);
        speeds.put("Boosted Mini S Board",18.0);
        speeds.put("Evolve Skateboard",26.0);
        speeds.put("OneWheel",19.0);
        speeds.put("MotoTec Skateboard",22.0);
        speeds.put("Segway Ninebot One S1",12.5);
        speeds.put("Segway i2 SE",12.5);
        speeds.put("Razor Scooter",10.0);
        speeds.put("GeoBlade 500",15.0);
        speeds.put("Hovertrax Hoverboard",8.0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String distance = intent.getStringExtra(MainActivity.EXTRA_DISTANCE);
        String transportation_device = intent.getStringExtra(MainActivity.EXTRA_TRANSPORTATION);
        Double time = speeds.get(transportation_device) * Integer.parseInt(distance);
        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView2);
        textView.setText(time.toString() + " mins");
        TextView textView1 = findViewById((R.id.textView4));
        textView1.setText(transportation_device);
    }
}
