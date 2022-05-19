package com.example.sumandaveragebylist;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {
    EditText l1,l3;
    RadioGroup rg;
    RadioButton r1,r2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<Integer> fl= new ArrayList<Integer>();

        ArrayList<Integer> tl= new ArrayList<Integer>();


        l1=(EditText) findViewById(R.id.editTextTextPersonName);
        l3=(EditText) findViewById(R.id.editTextTextPersonName3);
        rg = (RadioGroup) findViewById((R.id.RG));
        fl.add(1);
        fl.add(2);
        fl.add(2);
        fl.add(1);
        fl.add(1);

        l1.setText(fl.toString());


        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int selected=rg.getCheckedRadioButtonId();
                r1=(RadioButton) findViewById(selected);
                if(r1.getText().toString().equals("SUM")){
                    //Iterator i=fl.iterator();

                    int sum=0;
                    for (int j=0;j<fl.size();j++)
                        sum+=fl.get(j);




                    l3.setText(sum+"");
                    Toast.makeText(MainActivity.this,sum+"", Toast.LENGTH_SHORT).show();
                }
                //r2=(RadioButton) findViewById(selected);
                else if(r1.getText().toString().equals("AVERAGE"))
                {
                    float sum = 0;
                    float avg=0;
                    for(float d : fl)
                        sum += d;

                    avg=sum/fl.size();
                    l3.setText(avg+"");

                    Toast.makeText(MainActivity.this,avg+"", Toast.LENGTH_SHORT).show();
                }
                }


        });
    }

}