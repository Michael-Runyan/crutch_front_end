package com.example.crutches_front_end;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.ParseException;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.util.EntityUtils;
import org.codehaus.httpcache4j.uri.URIBuilder;


public class places_activity extends AppCompatActivity {

    private static TextView place_id_text_View;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        String base_url = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?";
        String api_key = "AIzaSyDK5ytGvPYFF40GpI8f_xfl8suq7ujQ49I";
        String loc = "35.946496,-83.921306";
        String rad = "4000";
        String key = "touristattractions";

        String final_string = base_url + "key=" + api_key + "&location=" + loc + "&radius="
                + rad + "&keyword=" + key;

        String response = "";


        try {
            URL url = new URL(final_string);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            response = this.generateResponse(conn);
        } catch(Exception e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();


//        JsonObject jsonObject = new JsonParser().parse(response).getAsJsonObject();
//
//        //System.out.print(jsonObject);
//        JsonArray array = jsonObject.getAsJsonArray("results");
//        String place_temp = "";
//        for (Object o : array) {
//            JsonObject temp = (JsonObject) o;
//            JsonElement temp_place = temp.get("place_id");
//            place_temp = temp_place.getAsString();
//            break;
//        }
     //   place_id_text_View = findViewById(R.id.test_text_id);
      //  place_id_text_View.setText(place_temp);
        }
    private String generateResponse(HttpURLConnection conn) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        return response.toString();
    }




}
