package com.example.user.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton r1,r2;
    RadioGroup rg1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg1 = (RadioGroup)findViewById(R.id.rg1);
        addListenerRadioButton();
        b1 = (Button)findViewById(R.id.bt1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected=rg1.getCheckedRadioButtonId();
                r1=(RadioButton)findViewById(selected);
                Toast.makeText(MainActivity.this,
                        r1.getText(),Toast.LENGTH_LONG).show();

            }
        });
    }

    private void addListenerRadioButton() {
    }


}

