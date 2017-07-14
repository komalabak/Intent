package com.example.pandadesktop4.intent;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1 = (Button) findViewById(R.id.button6);
        b1.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v)
            {
                Intent i= new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://wwww.gmail.com"));
                ;
                startActivity(i);
            }
        });





    }
}


