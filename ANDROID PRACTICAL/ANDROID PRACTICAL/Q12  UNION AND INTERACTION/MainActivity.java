package com.example.unoinandinteraction;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;

public class MainActivity extends AppCompatActivity {
    EditText l1,l2,l3;
    RadioGroup rg;
    RadioButton r1,r2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<String> fl= new ArrayList<String>();
        final ArrayList<String> sl= new ArrayList<String>();
        ArrayList<String> tl= new ArrayList<String>();


        l1=(EditText) findViewById(R.id.editTextTextPersonName);
        l2=(EditText) findViewById(R.id.editTextTextPersonName2);
        l3=(EditText) findViewById(R.id.editTextTextPersonName3);
        rg = (RadioGroup) findViewById((R.id.RG));

        fl.add("a");
        fl.add("b");
        fl.add("c");
        fl.add("d");
        sl.add("p");
        sl.add("b");
        sl.add("r");
        sl.add("s");

        l1.setText(fl.toString());
        l2.setText(sl.toString());

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int selected=rg.getCheckedRadioButtonId();
                r1=(RadioButton) findViewById(selected);
                if(r1.getText().toString().equals("Intersection")){
                    HashSet<String> inter = new HashSet<String>(fl);
                    inter.retainAll(sl);
                    l3.setText(inter.toString());
                    Toast.makeText(MainActivity.this, inter.toString(), Toast.LENGTH_SHORT).show();
                }
                // r2=(RadioButton) findViewById(selected);
                else if(r1.getText().toString().equals("Union"))
                {
                    HashSet<String> union = new HashSet<String>(fl);
                    union.addAll(sl);
                    l3.setText(union.toString());
                    Toast.makeText(MainActivity.this, union.toString(), Toast.LENGTH_SHORT).show();
                }}

        });
    }

}