package com.example.mishridaga.electrictime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_DISTANCE = "com.example.myfirstapp.DISTANCE";
    public static final String EXTRA_TRANSPORTATION = "com.example.myfirstapp.TRANSPORTATION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        //do something in response to submit button
        System.out.println("starting");
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = findViewById(R.id.editText4);
        String distance = editText.getText().toString();
        intent.putExtra(EXTRA_DISTANCE,distance);
        Spinner spinner = findViewById((R.id.spinner));
        String modeOfTransportation = spinner.getSelectedItem().toString();
        intent.putExtra(EXTRA_TRANSPORTATION, modeOfTransportation);
        startActivity(intent);
    }

}
