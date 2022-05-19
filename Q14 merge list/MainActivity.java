package com.example.mergerlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;


public class MainActivity extends AppCompatActivity {
EditText l1,l2,l3;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<String> fl= new ArrayList<String>();
        final ArrayList<String> sl= new ArrayList<String>();
        ArrayList<String> tl= new ArrayList<String>();

        l1=(EditText) findViewById(R.id.editTextTextPersonName);
        l2=(EditText) findViewById(R.id.editTextTextPersonName2);
        l3=(EditText) findViewById(R.id.editTextTextPersonName4);
        b=(Button)findViewById(R.id.button);
        fl.add("a");
        fl.add("b");
        fl.add("c");
        fl.add("d");
        sl.add("p");
        sl.add("q");
        sl.add("r");
        sl.add("s");
        l1.setText(fl.toString());
        l2.setText(sl.toString());

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HashSet<String> inter = new HashSet<String>(fl);
                inter.addAll(sl);
                l3.setText(inter.toString());
                Toast.makeText(MainActivity.this, inter.toString(), Toast.LENGTH_SHORT).show();
                  }

        });

    }
}