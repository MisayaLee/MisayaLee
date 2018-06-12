package com.example.misaya.rikao_day6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView tv_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        tv_id.setText("欢迎来到登录页面");
    }

    private void initView() {
        tv_id = (TextView) findViewById(R.id.tv_id);
    }
}
