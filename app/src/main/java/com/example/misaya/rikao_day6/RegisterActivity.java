package com.example.misaya.rikao_day6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    private TextView tv_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
        tv_register.setText("欢迎来到注册页面");
    }

    private void initView() {
        tv_register = (TextView) findViewById(R.id.tv_register);
    }
}
