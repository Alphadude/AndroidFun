package com.yoma.user.happybirthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nameOfCelebrant;

    Button proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameOfCelebrant = (EditText) findViewById(R.id.name);

        proceed = (Button) findViewById(R.id.proceed);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Open();
            }
        });


    }
    public void Open(){
        Intent opennewPage = new Intent(MainActivity.this,CardPage.class);
        opennewPage.putExtra("celebrant", nameOfCelebrant.getText().toString());
        startActivity(opennewPage);
    }
}
