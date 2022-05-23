package com.example.intentsapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button.findViewById(R.id.gitLink);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url= new String ("https://github.com/Acid-0/mobile_computing.git");
                Uri webpage = Uri.parse(url);
                Intent intent;
                intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
            }
        });

    }
}