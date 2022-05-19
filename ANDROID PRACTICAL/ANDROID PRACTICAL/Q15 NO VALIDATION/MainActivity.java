package com.example.slip1q5numbervalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button B;
EditText E1,E2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B=findViewById(R.id.button);
        E1=findViewById(R.id.editTextTextPersonName);
        E2=findViewById(R.id.editTextTextPersonName2);
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2;
                n1=Integer.parseInt(E1.getText().toString());
                n2=Integer.parseInt(E2.getText().toString());
                if(n1>10 && n2>10) {
                    Toast.makeText(MainActivity.this,n1 + "\tis not valid \n" +n2+ "\tis not valid \n10re enter Nos\n", Toast.LENGTH_SHORT).show();
                    E1.getText().clear();
                E1.setText("Reenter no 1");
                //E1.getText().clear();
                    E2.getText().clear();
                    E2.setText("Reenter no 2");
              //  E2.getText().clear();
                }
                else if(n1>10 && n2<=10) {
                  Toast.makeText(MainActivity.this, n1+ " \tis not valid\n " + n2 + " \tis  valid  \nre enter No1\n", Toast.LENGTH_SHORT).show();
                    E1.getText().clear();
                    E1.setText("Reenter no 1");
                  //  E1.getText().clear();
                   // E2.getText().clear();
                }
                else if( n1<=10 && n2>10) {
                   Toast.makeText(MainActivity.this,n1 + "\tis valid \n" + n2 + "\tis not valid\n re enter No2\n", Toast.LENGTH_SHORT).show();
                  //  E1.getText().clear();
                    E2.getText().clear();

                    E2.setText("Reenter no 2");

                   // E2.getText().clear();

                }
                else
                {
                  Toast.makeText(MainActivity.this,  n1 + "\tis  valid\n " +n2+ "\tis valid\n" , Toast.LENGTH_SHORT).show();
                    //E1.getText().clear();
                    //E2.getText().clear();

                }
            }
        });
    }
}