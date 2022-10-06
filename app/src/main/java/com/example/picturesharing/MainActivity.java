package com.example.picturesharing;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean bPwdSwitch = false;
    private EditText etPwd;
    private Button button;
    private TextView forgetPassword;
    private TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 隐藏应用标题
        ActionBar bar = getSupportActionBar();
        bar.hide();

        // 将状态栏颜色设为透明
        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        // 设置背景图片透明度
        setContentView(R.layout.activity_main);
        View view = findViewById(R.id.logIn);
        view.getBackground().setAlpha(120);


        final ImageView ivPwdSwitch = findViewById(R.id.iv_pwd_switch);
        etPwd = findViewById(R.id.etPwd);

        ivPwdSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bPwdSwitch = !bPwdSwitch;

                if (bPwdSwitch) {
                    ivPwdSwitch.setImageResource(
                            R.drawable.ic_baseline_visibility_24
                    );
                    etPwd.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
                } else {
                    ivPwdSwitch.setImageResource(
                            R.drawable.ic_baseline_visibility_off_24
                    );
                    // 将 InputType 的值设置为 129，隐藏密码
                    etPwd.setInputType(
                            InputType.TYPE_TEXT_VARIATION_PASSWORD |
                                    InputType.TYPE_CLASS_TEXT
                    );
                    etPwd.setTypeface(Typeface.DEFAULT);
                }
            }
        });

        button = findViewById(R.id.signIn);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // 在此处添加使用登录接口的代码
            }
        });

        // 添加文字下划线
        forgetPassword = findViewById(R.id.forgetPassword);
        forgetPassword.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        forgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
//                startActivity();
            }
        });

        register = findViewById(R.id.register);
    }
}