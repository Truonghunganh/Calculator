package com.example.nguyenhoang.problem_3;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView sign_up=(TextView)findViewById(R.id.sign_up);
        sign_up.setPaintFlags(sign_up.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
    }
}
