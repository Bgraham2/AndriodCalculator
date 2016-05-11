package com.example.bpuadmin.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView scr;
    TextView scr1;
    static boolean isEmpty = true;
    static float num = 0;
    static String operand = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scr = (TextView) findViewById(R.id.tvScreen);
        scr1 = (TextView) findViewById(R.id.tvScreen1);
        scr1.setText("");
    }

    public void intClicked(View sender){
        Button btn = (Button)sender;
        if (isEmpty){
            scr.setText(btn.getText());
            isEmpty = false;
        }
        else {
            scr.append(btn.getText());
        }
    }
    public void ClearClick(View sender){
        Button btn = (Button)sender;
        scr.setText("0");
        isEmpty = true;
        scr1.setText("");
        num = 0;
        operand = "";
    }
    public void AddClick(View sender){
        Button btn = (Button)sender;
        if (operand == ""){
            num = Integer.parseInt(scr.getText().toString());
            scr1.append(scr.getText() + " " + btn.getText());
            operand = btn.getText().toString();
            isEmpty = true;
        }
        else{
            switch (operand){
                case "/":
                    num /= Integer.parseInt(scr.getText().toString());
                    scr1.append(scr.getText() + " " + btn.getText());
                    operand = btn.getText().toString();
                    scr.setText(String.valueOf(num));
                    isEmpty = true;
                    break;
                case "*":
                    num *= Integer.parseInt(scr.getText().toString());
                    scr1.append(scr.getText() + " " + btn.getText());
                    operand = btn.getText().toString();
                    scr.setText(String.valueOf(num));
                    isEmpty = true;
                    break;
                case "-":
                    num -= Integer.parseInt(scr.getText().toString());
                    scr1.append(scr.getText() + " " + btn.getText());
                    operand = btn.getText().toString();
                    scr.setText(String.valueOf(num));
                    isEmpty = true;
                    break;
                case "+":
                    num += Integer.parseInt(scr.getText().toString());
                    scr1.append(scr.getText() + " " + btn.getText());
                    operand = btn.getText().toString();
                    scr.setText(String.valueOf(num));
                    isEmpty = true;
                    break;
            }
        }
    }

    public void SubClick(View sender){
        Button btn = (Button)sender;
        if (operand == ""){
            num = Integer.parseInt(scr.getText().toString());
            scr1.append(scr.getText() + " " + btn.getText());
            operand = btn.getText().toString();
            isEmpty = true;
        }
        else{
            switch (operand){
                case "/":
                    num /= Integer.parseInt(scr.getText().toString());
                    scr1.append(scr.getText() + " " + btn.getText());
                    operand = btn.getText().toString();
                    scr.setText(String.valueOf(num));
                    isEmpty = true;
                    break;
                case "*":
                    num *= Integer.parseInt(scr.getText().toString());
                    scr1.append(scr.getText() + " " + btn.getText());
                    operand = btn.getText().toString();
                    scr.setText(String.valueOf(num));
                    isEmpty = true;
                    break;
                case "-":
                    num -= Integer.parseInt(scr.getText().toString());
                    scr1.append(scr.getText() + " " + btn.getText());
                    operand = btn.getText().toString();
                    scr.setText(String.valueOf(num));
                    isEmpty = true;
                    break;
                case "+":
                    num += Integer.parseInt(scr.getText().toString());
                    scr1.append(scr.getText() + " " + btn.getText());
                    operand = btn.getText().toString();
                    scr.setText(String.valueOf(num));
                    isEmpty = true;
                    break;
            }
        }
    }
    public void DivClick(View sender){
        Button btn = (Button)sender;
        if (operand == ""){
            num = Integer.parseInt(scr.getText().toString());
            scr1.append(scr.getText() + " " + btn.getText());
            operand = btn.getText().toString();
            isEmpty = true;
        }
        else{
            switch (operand){
                case "/":
                    num /= Integer.parseInt(scr.getText().toString());
                    scr1.append(scr.getText() + " " + btn.getText());
                    operand = btn.getText().toString();
                    scr.setText(String.valueOf(num));
                    isEmpty = true;
                    break;
                case "*":
                    num *= Integer.parseInt(scr.getText().toString());
                    scr1.append(scr.getText() + " " + btn.getText());
                    operand = btn.getText().toString();
                    scr.setText(String.valueOf(num));
                    isEmpty = true;
                    break;
                case "-":
                    num -= Integer.parseInt(scr.getText().toString());
                    scr1.append(scr.getText() + " " + btn.getText());
                    operand = btn.getText().toString();
                    scr.setText(String.valueOf(num));
                    isEmpty = true;
                    break;
                case "+":
                    num += Integer.parseInt(scr.getText().toString());
                    scr1.append(scr.getText() + " " + btn.getText());
                    operand = btn.getText().toString();
                    scr.setText(String.valueOf(num));
                    isEmpty = true;
                    break;
            }
        }
    }
    public void MulClick(View sender){
        Button btn = (Button)sender;
        if (operand == ""){
            num = Integer.parseInt(scr.getText().toString());
            scr1.append(scr.getText() + " " + btn.getText());
            operand = btn.getText().toString();
            isEmpty = true;
        }
        else{
            switch (operand){
                case "/":
                    num /= Integer.parseInt(scr.getText().toString());
                    scr1.append(scr.getText() + " " + btn.getText());
                    operand = btn.getText().toString();
                    scr.setText(String.valueOf(num));
                    isEmpty = true;
                    break;
                case "*":
                    num *= Integer.parseInt(scr.getText().toString());
                    scr1.append(scr.getText() + " " + btn.getText());
                    operand = btn.getText().toString();
                    scr.setText(String.valueOf(num));
                    isEmpty = true;
                    break;
                case "-":
                    num -= Integer.parseInt(scr.getText().toString());
                    scr1.append(scr.getText() + " " + btn.getText());
                    operand = btn.getText().toString();
                    scr.setText(String.valueOf(num));
                    isEmpty = true;
                    break;
                case "+":
                    num += Integer.parseInt(scr.getText().toString());
                    scr1.append(scr.getText() + " " + btn.getText());
                    operand = btn.getText().toString();
                    scr.setText(String.valueOf(num));
                    isEmpty = true;
                    break;
            }
        }
    }
    public void EqualClick(View sender){
        Button btn = (Button)sender;
            switch (operand){
                case "/":
                    num /= Integer.parseInt(scr.getText().toString());
                    scr1.setText("");
                    operand = "";
                    scr.setText(String.valueOf(num));
                    isEmpty = true;
                    break;
                case "*":
                    num *= Integer.parseInt(scr.getText().toString());
                    scr1.setText("");
                    operand = "";
                    scr.setText(String.valueOf(num));
                    isEmpty = true;
                    break;
                case "-":
                    num -= Integer.parseInt(scr.getText().toString());
                    scr1.setText("");
                    operand = "";
                    scr.setText(String.valueOf(num));
                    isEmpty = true;
                    break;
                case "+":
                    num += Integer.parseInt(scr.getText().toString());
                    scr1.setText("");
                    operand = "";
                    scr.setText(String.valueOf(num));
                    isEmpty = true;
                    break;
            }
        num = 0;
    }
}
