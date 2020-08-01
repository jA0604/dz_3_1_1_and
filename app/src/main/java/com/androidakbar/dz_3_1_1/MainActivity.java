package com.androidakbar.dz_3_1_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Toolbar appToolbar;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnDot;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {
        appToolbar = findViewById(R.id.app_toolbar);
        appToolbar.setTitle(R.string.name_dz);
        appToolbar.setTitleTextColor(getResources().getColor(R.color.colorPrimaryText));

        btn0 = findViewById(R.id.btn_0);
        btn0.setText(R.string.str_btn_0);
        btn1 = findViewById(R.id.btn_1);
        btn1.setText(R.string.str_btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn2.setText(R.string.str_btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn3.setText(R.string.str_btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn4.setText(R.string.str_btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn5.setText(R.string.str_btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn6.setText(R.string.str_btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn7.setText(R.string.str_btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn8.setText(R.string.str_btn_8);
        btn9 = findViewById(R.id.btn_9);
        btn9.setText(R.string.str_btn_9);
        btnDot = findViewById(R.id.btn_dot);
        btnDot.setText(R.string.str_btn_dot);

        txtResult = findViewById(R.id.txt_result);

    }

    public void clickBtn(View view) {
        Button btn = (Button) view;
        txtResult.setText(btn.getText().toString());
    }
}