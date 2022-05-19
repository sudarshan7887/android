package com.example.loginprojectslip2q2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText L1,L2;
    TextView T1,T2;
    Button B1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button B1=(Button)findViewById(R.id.button);
        EditText E1=(EditText)findViewById(R.id.editTextTextEmailAddress);
        EditText E2=(EditText)findViewById(R.id.editTextTextPassword);
        TextView T2=(TextView)findViewById(R.id.textView2);

        String id1,pass;
        id1="Naresh";
        pass="Naresh@123";
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1,s2;
                s1=E1.getText().toString();
                s2=E2.getText().toString();
                boolean b1,b2;
                b1=id1.equals(s1);
                b2=pass.equals(s2);
                if((b1) && (b2))
                    Toast.makeText(MainActivity.this, "lOGIN iS VALID", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "LOGIN IS INVALID", Toast.LENGTH_SHORT).show();
            }
        });
   /*    T2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t1=new Intent(getApplicationContext(),MainActivity2.class);
                t1.putExtra("msql","Register YourSelf Here");
                startActivity(t1);
                Toast.makeText(MainActivity.this, "Please Make Register", Toast.LENGTH_SHORT).show();
            }
        });*/




    }
}