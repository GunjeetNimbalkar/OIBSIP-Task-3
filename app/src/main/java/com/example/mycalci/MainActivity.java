package com.example.mycalci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button bt0, bt1, bt2, bt3, bt4, bt5, bt6,btsq,btcube,
            bt7, bt8, bt9, btAdd, btSub, btDiv,
            btMulti, buttondot, buttonClear, buttonEqual , btsqrt,btfact;
    EditText et1;

    float mValueOne, mValueTwo;

    boolean Addition, Subtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt0 = (Button) findViewById(R.id.button0);
        bt1 = (Button) findViewById(R.id.button1);
        bt2 = (Button) findViewById(R.id.button2);
        bt3 = (Button) findViewById(R.id.button3);
        bt4 = (Button) findViewById(R.id.button4);
        bt5 = (Button) findViewById(R.id.button5);
        bt6 = (Button) findViewById(R.id.button6);
        bt7 = (Button) findViewById(R.id.button7);
        bt8 = (Button) findViewById(R.id.button8);
        bt9 = (Button) findViewById(R.id.button9);
        buttondot = (Button) findViewById(R.id.buttondot);
        btAdd = (Button) findViewById(R.id.buttonadd);
        btSub = (Button) findViewById(R.id.buttonsub);
        btMulti = (Button) findViewById(R.id.buttonmul);
        btDiv= (Button) findViewById(R.id.buttondiv);
        buttonClear = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        btsqrt=(Button) findViewById(R.id.btsqrt);
        btfact=(Button) findViewById(R.id.btfact);
        btcube=findViewById(R.id.btcube);
        btsq=findViewById(R.id.btsq);

        et1= (EditText) findViewById(R.id.edt1);

        bt0.setOnClickListener(v -> et1.setText(et1.getText() + "0"));

        bt1.setOnClickListener(v -> et1.setText(et1.getText() + "1"));

        bt2.setOnClickListener(v -> et1.setText(et1.getText() + "2"));

        bt3.setOnClickListener(v -> et1.setText(et1.getText() + "3"));

        bt4.setOnClickListener(v -> et1.setText(et1.getText() + "4"));

        bt5.setOnClickListener(v -> et1.setText(et1.getText() + "5"));

        bt6.setOnClickListener(v -> et1.setText(et1.getText() + "6"));

        bt7.setOnClickListener(v -> et1.setText(et1.getText() + "7"));

        bt8.setOnClickListener(v -> et1.setText(et1.getText() + "8"));

        bt9.setOnClickListener(v -> et1.setText(et1.getText() + "9"));
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (et1 == null) {
                    et1.setText("");
                } else {
                    mValueOne = Float.parseFloat(et1.getText() + "");
                    Addition = true;
                    et1.setText(null);
                }
            }
        });

        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(et1.getText() + "");
                Subtract = true;
                et1.setText(null);
            }
        });

        btMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(et1.getText() + "");
                Multiplication = true;
                et1.setText(null);
            }
        });

        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(et1.getText() + "");
                Division = true;
                et1.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(et1.getText() + "");

                if (Addition == true) {
                    et1.setText(mValueOne + mValueTwo + "");
                    Addition = false;
                }

                if (Subtract == true) {
                    et1.setText(mValueOne - mValueTwo + "");
                    Subtract = false;
                }

                if (Multiplication == true) {
                    et1.setText(mValueOne * mValueTwo + "");
                    Multiplication = false;
                }

                if (Division == true) {
                    et1.setText(mValueOne / mValueTwo + "");
                    Division = false;
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("");
            }
        });

        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + ".");
            }
        });
        btfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String f= et1.getText().toString();
                int j=Integer.parseInt(f);
                int ft=1;
                for(int i=1;i<=j;i++){
                    ft=ft*i;
                }
                String factorial=String.valueOf(ft);
                et1.setText(factorial);

            }
        });
        btsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=et1.getText().toString();
                int c=Integer.parseInt(s);
                double t=Math.sqrt(c);
                String sqrt=String.valueOf(t);
                et1.setText(sqrt+".");

            }
        });
        btcube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String k = et1.getText().toString();
                int n = Integer.parseInt(k);
                n = n * n * n;
                String cb = String.valueOf(n);
                et1.setText(cb);
            }
        });
        btsq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=et1.getText().toString();
                int x=Integer.parseInt(s);
                x=x*x;
                String sq=String.valueOf(x);
                et1.setText(sq);
            }
        });
    }
}
