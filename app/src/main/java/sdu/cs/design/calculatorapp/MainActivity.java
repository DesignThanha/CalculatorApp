package sdu.cs.design.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import sdu.cs.design.calculatorapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ผูกตัวแปรJava กับ อิลิเมนต์บน XML
        final EditText numberEditText1 =findViewById(R.id.edt_number1);
        final EditText numberEditText2 = findViewById(R.id.edt_number2);
        Button addButton = findViewById(R.id.btn_add);
        Button minusButton = findViewById(R.id.btn_minus);
        Button multiplyButton = findViewById(R.id.btn_multiply);
        Button devideButton = findViewById(R.id.btn_devide);
        final TextView resultTextView = findViewById(R.id.tv_result);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1,num2,result;
                num1 = Integer.parseInt(numberEditText1.getText().toString());
                num2 =Integer.parseInt(numberEditText2.getText().toString());
                result = num1 + num2;
                resultTextView.setText(result+"");
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1,num2,result;
                num1 = Integer.parseInt(numberEditText1.getText().toString());
                num2 = Integer.parseInt(numberEditText2.getText().toString());
                result = num1-num2;
                resultTextView.setText(result+"");
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1,num2,result;
                num1 = Integer.parseInt(numberEditText1.getText().toString());
                num2 = Integer.parseInt(numberEditText2.getText().toString());
                result = num1*num2;
                resultTextView.setText(result+"");

            }
        });

        devideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1,num2,result;
                num1 = Integer.parseInt(numberEditText1.getText().toString());
                num2 = Integer.parseInt(numberEditText2.getText().toString());
                result = num1/num2;
                resultTextView.setText(result+"");
            }
        });
    }//end onCreate() Method
}//end class
