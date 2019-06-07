package com.example.aditiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2,res;
    Button add,sub,mul,div,mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        res=(EditText)findViewById(R.id.res);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        mod=(Button)findViewById(R.id.mod);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=num1.getText().toString();
                String number2=num2.getText().toString();
                int n1 = Integer.parseInt(number1);
                int n2 = Integer.parseInt(number2);
                int c = n1+n2;
                res.setText(""+c);
            }

        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=num1.getText().toString();
                String number2=num2.getText().toString();
                int n1 = Integer.parseInt(number1);
                int n2 = Integer.parseInt(number2);
                int d = n1-n2;
                res.setText(""+d);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=num1.getText().toString();
                String number2=num2.getText().toString();
                int n1 = Integer.parseInt(number1);
                int n2 = Integer.parseInt(number2);
                int e = n1*n2;
                res.setText(""+e);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=num1.getText().toString();
                String number2=num2.getText().toString();
                int n1 = Integer.parseInt(number1);
                int n2 = Integer.parseInt(number2);
                int f = n1/n2;
                res.setText(""+f);
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=num1.getText().toString();
                String number2=num2.getText().toString();
                int n1 = Integer.parseInt(number1);
                int n2 = Integer.parseInt(number2);
                int g = n1%n2;
                res.setText(""+g);
            }
        });




    }
}
