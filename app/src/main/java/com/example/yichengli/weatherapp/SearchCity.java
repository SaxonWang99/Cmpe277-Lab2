package com.example.yichengli.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SearchCity extends AppCompatActivity {
    EditText cityInput;
    Button btn;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_city);

       cityInput = (EditText) findViewById(R.id.city_input);
       btn = (Button) findViewById(R.id.btn1);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String str = cityInput.getText().toString();
               Toast msg = Toast.makeText(getBaseContext(),str,Toast.LENGTH_LONG);
               msg.show();
           }
       });
    }
}
