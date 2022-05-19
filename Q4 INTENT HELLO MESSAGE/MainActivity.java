package com.example.slip1q3printinghellotonextactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.slip1q3printinghellotonextactivity.MainActivity2;

public class MainActivity extends AppCompatActivity {
    Button B;

//TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //tv=(TextView) findViewById(R.id.textView);


        B=(Button)findViewById(R.id.button);
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I=new Intent(getApplicationContext(), MainActivity2.class);
                I.putExtra( "msql" ,"Hello Naresh");
                startActivity(I);
                Toast.makeText(MainActivity.this,"Hello Naresh in 2nd Activity",Toast.LENGTH_SHORT).show();
            }
        });
    }
}