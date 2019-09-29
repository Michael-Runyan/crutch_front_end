package com.example.crutches_front_end;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import com.google.gson.Gson;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public static String choice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner crutch_select = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.menu_options));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        crutch_select.setAdapter(myAdapter);
        crutch_select.setOnItemSelectedListener(this);

    }

    public void nextActivity(View v){
        Intent i = new Intent(this,destription_activity.class);
        startActivity(i);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        String choice = adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    public void Move_to_Places(View v){
        Intent i = new Intent(this,places_activity.class);
        startActivity(i);

    }

}
