package com.example.powerandaverage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button B;
EditText E1,E2;
//TextView E3;
RadioGroup RG;
RadioButton R1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
B=(Button)findViewById(R.id.button);
//B2=(Button)findViewById(R.id.button2);
E1=(EditText)findViewById(R.id.editTextTextPersonName);
E2=(EditText)findViewById(R.id.editTextTextPersonName2);
//E3=(TextView) findViewById(R.id.textView) ;
//R1=(RadioButton)findViewById(R.id.radioButton);
//R2=(RadioButton) findViewById(R.id.radioButton2);
RG=(RadioGroup)findViewById(R.id.radioGroup);

B.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
int selectedId=RG.getCheckedRadioButtonId();
R1=findViewById(selectedId);
String choice=R1.getText().toString();
int n2,ans1,ans2;
        int n1;

       // n1 = Integer.parseInt(E1.getText().toString());
      //  n2= Integer.parseInt(E2.getText().toString());
        Intent I=new Intent(getApplicationContext(),MainActivity2.class);
        I.putExtra("msql", "Hello" );
        startActivity(I);
        String s1,s2;
        s1=E1.getText().toString();
        s2=E2.getText().toString();

       int s11=Integer.valueOf(s1);
       int s22=Integer.valueOf(s2);
        ans1=((s11+s22)/2);
        ans2=pow(s11,s22);
switch(choice)
{
    case "Average"://E3.setText(String.valueOf(ans1));
       // Toast.makeText(MainActivity.this,ans1, Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this,String.valueOf(ans1),Toast.LENGTH_SHORT).show();
        break;
    case "Power":// E3.setText(String.valueOf(ans2));
       // Toast.makeText(MainActivity.this,ans2, Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this,String.valueOf(ans2),Toast.LENGTH_SHORT).show();

    break;
    default: Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
        break;
}


    }
});

    }
    public int pow(int x, int y) {
        int result = x;
       for (int i = 1; i <y; i++)
        {
            result = result * x;
        }
        return result;
    }




}