package com.yoma.user.happybirthday;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by USER on 5/25/2018.
 */

public class CardPage extends AppCompatActivity {

     TextView NameofCelebrant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardpage);

        NameofCelebrant = (EditText) findViewById(R.id.celebrantsName);

        Intent intent = getIntent();
        String first = intent.getStringExtra("celebrant");





    }
}
