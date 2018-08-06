package com.cof.stdio_hue.demo_layout_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUser, edtPass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Loading();


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = edtUser.getText().toString();
                String pass = edtPass.getText().toString();

                if(user.equals("admin") && pass.equals("123")){
                    Toast.makeText(MainActivity.this, "Đăng Nhập Thành Công.", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Sai Thông Tin Đăng Nhập. \nĐăng Nhập Thất Bại.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void Loading(){
        edtUser = (EditText) findViewById(R.id.editTextUser);
        edtPass = (EditText) findViewById(R.id.editTextPass);
        btnLogin = (Button) findViewById(R.id.buttonLogin);
    }


}
