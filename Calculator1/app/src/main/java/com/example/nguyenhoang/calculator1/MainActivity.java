package com.example.nguyenhoang.calculator1;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public  class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        setOnClick();


    }



    private EditText edt_Number;
    private TextView tv_Result;
    private Button btn_Number0;
    private Button btn_Number1;
    private Button btn_Number2;
    private Button btn_Number3;
    private Button btn_Number4;
    private Button btn_Number5;
    private Button btn_Number6;
    private Button btn_Number7;
    private Button btn_Number8;
    private Button btn_Number9;
    private Button btn_Add;
    private Button btn_Sub;
    private Button btn_Mul;
    private Button btn_Div;
    private Button btn_Clear;
    private Button btn_AC;
    private Button btn_Equal;
    private Button btn_Dot;



    public void initWidget() {

        edt_Number = (EditText) findViewById(R.id.edt_Number);
        tv_Result = (TextView) findViewById(R.id.tv_Result);

        btn_Number0 = (Button) findViewById(R.id.btn_Number0);
        btn_Number1 = (Button) findViewById(R.id.btn_Number1);
        btn_Number2 = (Button) findViewById(R.id.btn_Number2);
        btn_Number3 = (Button) findViewById(R.id.btn_Number3);
        btn_Number4 = (Button) findViewById(R.id.btn_Number4);
        btn_Number5 = (Button) findViewById(R.id.btn_Number5);
        btn_Number6 = (Button) findViewById(R.id.btn_Number6);
        btn_Number7 = (Button) findViewById(R.id.btn_Number7);
        btn_Number8 = (Button) findViewById(R.id.btn_Number8);
        btn_Number9 = (Button) findViewById(R.id.btn_Number9);
        btn_Add = (Button) findViewById(R.id.btn_Add);
        btn_Sub = (Button) findViewById(R.id.btn_Sub);
        btn_Mul = (Button) findViewById(R.id.btn_Mul);
        btn_Div = (Button) findViewById(R.id.btn_Div);
        btn_Clear = (Button) findViewById(R.id.btn_Clear);
        btn_AC = (Button) findViewById(R.id.btn_AC);
        btn_Equal = (Button) findViewById(R.id.btn_Equal);
        btn_Dot = (Button) findViewById(R.id.btn_Dot);
    }
    public void setOnClick() {
        btn_Number0.setOnClickListener(this);
        btn_Number1.setOnClickListener(this);
        btn_Number2.setOnClickListener(this);
        btn_Number3.setOnClickListener(this);
        btn_Number4.setOnClickListener(this);
        btn_Number5.setOnClickListener(this);
        btn_Number6.setOnClickListener(this);
        btn_Number7.setOnClickListener(this);
        btn_Number8.setOnClickListener(this);
        btn_Number9.setOnClickListener(this);

        btn_Add.setOnClickListener(this);
        btn_Sub.setOnClickListener(this);
        btn_Mul.setOnClickListener(this);
        btn_Div.setOnClickListener(this);
        btn_Clear.setOnClickListener(this);
        btn_AC.setOnClickListener(this);
        btn_Equal.setOnClickListener(this);
        btn_Dot.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_Number0:
                edt_Number.append("0");
                break;
            case R.id.btn_Number1:
                edt_Number.append("1");
                break;
            case R.id.btn_Number2:
                edt_Number.append("2");
                break;
            case R.id.btn_Number3:
                edt_Number.append("3");
                break;
            case R.id.btn_Number4:
                edt_Number.append("4");
                break;
            case R.id.btn_Number5:
                edt_Number.append("5");
                break;
            case R.id.btn_Number6:
                edt_Number.append("6");
                break;
            case R.id.btn_Number7:
                edt_Number.append("7");
                break;
            case R.id.btn_Number8:
                edt_Number.append("8");
                break;
            case R.id.btn_Number9:
                edt_Number.append("9");
                break;
            case R.id.btn_Add:
                edt_Number.append("+");
                break;
            case R.id.btn_Sub:
                edt_Number.append("-");
                break;
            case R.id.btn_Mul:
                edt_Number.append("*");
                break;
            case R.id.btn_Div:
                edt_Number.append("/");
                break;
            case R.id.btn_Clear:
                BaseInputConnection textFieldInputConnection= new BaseInputConnection(edt_Number,true);
                textFieldInputConnection.sendKeyEvent(new KeyEvent( KeyEvent.ACTION_DOWN ,KeyEvent.KEYCODE_DEL) );
                break;
            case R.id.btn_AC:
                edt_Number.setText("");
                break;
            case R.id.btn_Equal:

                break;
            case R.id.btn_Dot:
                edt_Number.append(".");
                break;


        }

    }
    public ArrayList<String> arrOperation;
    public ArrayList<Double> arrNumber;

    public int addOperation(String input){
        arrOperation= new ArrayList<>();
        char[] cArray=input.toCharArray();
        for(int i=0; i<cArray.length; i++){
            switch (cArray[i]){
                case '+':
                    arrOperation.add(cArray[i]+"");
                    break;
                case '-':
                    arrOperation.add(cArray[i]+"");
                    break;
                case '8':
                    arrOperation.add(cArray[i]+"");
                    break;
                case '/':
                    arrOperation.add(cArray[i]+"");
                    break;
                default:
                    break;
            }


        }
    }



}


