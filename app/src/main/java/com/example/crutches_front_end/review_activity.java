package com.example.crutches_front_end;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class review_activity extends AppCompatActivity {

    private static SeekBar seek_bar;
    private static TextView text_view;
    public static int rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        //seek_bar();
        RatingBar g_rate_bar = (RatingBar) findViewById(R.id.p_rate_bar_id);

        //Use this command to get the rating
        int rating = (int)g_rate_bar.getRating();
    }
    public void Move_To_Maps(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}
