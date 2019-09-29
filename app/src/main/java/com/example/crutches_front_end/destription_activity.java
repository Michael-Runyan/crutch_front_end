package com.example.crutches_front_end;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import org.json.JSONObject;

import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class destription_activity extends AppCompatActivity {

    //Variables to import from web service
    private static float i_rate;
    private static float o_rate;
    private static String place_name;

    private static RatingBar i_rate_bar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destription);

        //Varaibles to change
        i_rate = 4.0f;
        o_rate = 3.0f;
        place_name = "Title_Place_Holder";

        String test_string = (String) "Tester String";
        TextView textElement;
        TextView newtext = (TextView) findViewById(R.id.title_test);
        newtext.setText(place_name);
//        String test_des;
//        JSONObject json_temp = new JSONObject();
//        json_temp
        RatingBar i_rate_bar = (RatingBar) findViewById(R.id.i_rate_bar_id);
        RatingBar o_rate_bar = (RatingBar) findViewById(R.id.o_rate_bar_id);



        i_rate_bar.setRating(i_rate);
        o_rate_bar.setRating(o_rate);
    }
    public void Move_To_Review_Activity(View v){
        Intent i = new Intent(this,review_activity.class);
        startActivity(i);

    }
    public void Move_To_Maps(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
