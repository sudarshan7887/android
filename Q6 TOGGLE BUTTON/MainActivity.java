package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton T1,T2;
    Button B1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T1=(ToggleButton) findViewById(R.id.toggleButton);
        T2=(ToggleButton) findViewById(R.id.toggleButton2);
        B1=(Button) findViewById(R.id.button);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuffer result=new StringBuffer();
                result.append("").append(T1.getText());
                result.append("").append(T2.getText());
                Toast.makeText(MainActivity.this,result.toString(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}