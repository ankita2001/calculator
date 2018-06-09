package com.example.ankita.cal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button one , two , three ,four, five, six, seven, eight, nine, equals , add , multi, subs, clear, dot, zero, div;
    TextView result;
    String val1="", val2="";
    String operator="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=(TextView)findViewById(R.id.calculation);
        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        subs=(Button)findViewById(R.id.subs);
        equals=(Button)findViewById(R.id.equals);
        add=(Button)findViewById(R.id.add);
        multi=(Button)findViewById(R.id.multi);
        clear=(Button)findViewById(R.id.clear);
        dot=(Button)findViewById(R.id.dot);
        zero=(Button)findViewById(R.id.zero);
        div=(Button)findViewById(R.id.div);

    one.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            val1 = val1 + 1;
            result.setText(val1);
        }
    });
    two.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            val1 += 2;
            result.setText(val1);
        }
    });
    three.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            val1 += 3;
            result.setText(val1);
        }
    });
    add.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            result.setText(" ");
            operator = "+";
            val2 = val1;
            val1 = " ";
        }
    });
    four.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            val1 += 4;
            result.setText(val1);
        }
    });
    five.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            val1 += 5;
            result.setText(val1);
        }
    });
    six.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            val1 += 6;
            result.setText(val1);
        }
    });
    multi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            result.setText(" ");
            operator = "*";
            val2 = val1;
            val1 = " ";
        }
    });
    seven.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            val1 += 7;
            result.setText(val1);
        }
    });
    eight.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            val1 += 8;
            result.setText(val1);
        }
    });
    nine.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            val1 += 9;
            result.setText(val1);
        }
    });
    subs.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            result.setText(" ");
            operator = "-";
            val2 = val1;
            val1 = " ";
        }
    });
    clear.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            result.setText(" ");
            operator = "AC";
            val2 = val1;
            val1 = " ";
        }
    });
    dot.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            val1 += ".";
            result.setText(val1);
        }
    });
    zero.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            val1 += 0;
            result.setText(val1);
        }
    });
    div.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            result.setText(" ");
            operator = "/";
            val2 = val1;
            val1 = " ";
        }
    });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1 = Double.valueOf(val1);
                Double num2 = Double.valueOf(val2);
                if (operator.charAt(0) == '+') {
                    Double ans = num1 + num2;
                    result.setText(ans + " ");
                } else if (operator.charAt(0) == '*') {
                    Double ans = num1 * num2;
                    result.setText(ans + " ");
                } else if (operator.charAt(0) == '-') {
                    Double ans = num2 - num1;
                    result.setText(ans + " ");
                } else if (operator.charAt(0) == '/'){
                    Double ans = num2 / num1;
                    result.setText(ans + " ");
                }
            }
        });

        }
    }

