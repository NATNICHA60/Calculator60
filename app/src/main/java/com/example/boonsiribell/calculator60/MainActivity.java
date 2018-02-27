package com.example.boonsiribell.calculator60;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView output, output2;
    private Button  B12, B13, B14, B15,B16;
    private Button B1, B2, B3, B4, B5, B6, B7, B8, B9, B0, B10, B11;
    float input1, input2;
    boolean sumAdd, sumSub, sumMultiply, sumDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.TV1);
        output2 = findViewById(R.id.TV2);
        B12 = (Button) findViewById(R.id.B12);
        B13 = (Button) findViewById(R.id.B13);
        B14 = (Button) findViewById(R.id.B14);
        B15 = (Button) findViewById(R.id.B15);
        B10 = (Button)findViewById(R.id.B10) ;
        B11 = (Button)findViewById(R.id.B11) ;
        B16 = (Button) findViewById(R.id.B16);
        B1 = (Button) findViewById(R.id.B1);
        B2 = (Button) findViewById(R.id.B2);
        B3 = (Button) findViewById(R.id.B3);
        B4 = (Button) findViewById(R.id.B4);
        B5 = (Button) findViewById(R.id.B5);
        B6 = (Button) findViewById(R.id.B6);
        B7 = (Button) findViewById(R.id.B7);
        B8 = (Button) findViewById(R.id.B8);
        B9 = (Button) findViewById(R.id.B9);
        B0 = (Button) findViewById(R.id.B0);

        output.setVisibility(View.INVISIBLE);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + "1");
                output2.setText(output2.getText() + "1");
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + "2");
                output2.setText(output2.getText() + "2");
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + "3");
                output2.setText(output2.getText() + "3");
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + "4");
                output2.setText(output2.getText() + "4");
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + "5");
                output2.setText(output2.getText() + "5");
            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + "6");
                output2.setText(output2.getText() + "6");
            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + "7");
                output2.setText(output2.getText() + "7");
            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + "8");
                output2.setText(output2.getText() + "8");
            }
        });
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + "9");
                output2.setText(output2.getText() + "9");
            }
        });
        B0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + "0");
                output2.setText(output2.getText() + "0");
            }
        });
        B12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output2.setText(output2.getText() + "+");
                if (output == null)
                {
                    output.setText("");
                }
                else {
                    input1 = Float.parseFloat(output.getText() + "");
                    sumAdd = true;
                    output.setText(null);
                }
            }
        });
        B13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output2.setText(output2.getText() + "-");
                input1 = Float.parseFloat(output.getText() + "");
                sumSub = true;
                output.setText(null);            }
        });
        B14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output2.setText(output2.getText() + "x");
                input1 = Float.parseFloat(output.getText() + "");
                sumMultiply = true;
                output.setText(null);
            }
        });
        B15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output2.setText(output2.getText() + "/");
                input1 = Float.parseFloat(output.getText() + "");
                sumDivide = true;
                output.setText(null);
            }
        });
        B10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input2 = Float.parseFloat(output.getText() + "");
                output.setVisibility(View.VISIBLE);
                if (sumAdd == true)
                {
                    output.setText(input1 + input2 + "");
                    sumAdd = false;
                }
                if (sumSub == true)
                {
                    output.setText(input1 - input2 + "");
                    sumSub = false;
                }
                if (sumMultiply == true)
                {
                    output.setText(input1 * input2 + "");
                    sumMultiply = false;
                }
                if (sumDivide == true)
                {
                    output.setText(input1 / input2 + "");
                    sumDivide = false;
                }
            }
        });
        B16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText("");
                output2.setText("");
            }
        });
        B11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText()+".");
                output2.setText(output2.getText() + ".");

            }
        });
    }

}