package com.example.stringoperationslip2q1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
Button B1;
RadioButton SELECTEDRADIOBUTTON;
EditText IP,OP;
RadioGroup RG;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1=(Button)findViewById(R.id.button);
        IP=(EditText)findViewById(R.id.editTextTextPersonName);
        OP=(EditText)findViewById(R.id.editTextTextPersonName2);
        RG=(RadioGroup)findViewById(R.id.radioGroup);

        B1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                int selectedId= RG.getCheckedRadioButtonId();
                SELECTEDRADIOBUTTON=findViewById(selectedId);
                String Selecttext=SELECTEDRADIOBUTTON.getText().toString();
                String userIp=IP.getText().toString();
                switch(Selecttext)
                {

                    case "UPPERCASE" :OP.setText(userIp.toUpperCase());break;
                    case "LOWERCASE" :OP.setText(userIp.toLowerCase());break;
                    case "RIGHT5CHAR":OP.setText(userIp.substring(0,5));break;
                    case "LEFT5CHAR" :String userIp1=userIp.substring(userIp.length()-5);
                        OP.setText(userIp1);break;
                    default: Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                        break;


                }


            }
       });



    }
}
