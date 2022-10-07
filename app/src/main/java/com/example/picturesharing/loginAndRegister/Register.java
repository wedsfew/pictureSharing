package com.example.picturesharing.loginAndRegister;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.picturesharing.R;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        //
        Button register = findViewById(R.id.registerBtn);
        Button logIn = findViewById(R.id.logInBtn);

        // 隐藏应用标题
        ActionBar bar = getSupportActionBar();
        assert bar != null;
        bar.hide();

        // 将状态栏颜色设为透明
        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        // 注册按钮响应事件


        // 登录按钮点击事件
        logIn.setOnClickListener(v -> {
            // 登录功能，读取 EditText 控件中的内容以及 用户 id 之后封装成 User 对象
        });
    }
}
