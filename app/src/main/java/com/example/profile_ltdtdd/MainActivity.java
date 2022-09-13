package com.example.profile_ltdtdd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText eUser,ePassword;
    Button bDangnhap,bDangKy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        bDangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (eUser.getText().length() != 0 && ePassword.getText().length() !=0){
                    if (eUser.getText().toString().equals("Trung") && ePassword.getText().toString().equals("12345")){
                        Toast.makeText(MainActivity.this,"Dang Nhap Thanh Cong",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this,MainActivity3.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(MainActivity.this,"Sai Mat Khau",Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this,"Vui Long Nhap Day Du Thong Tin",Toast.LENGTH_SHORT).show();
                }
            }
        });
        bDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent2);
            }
        });

    }
    private void Anhxa(){
        eUser = (EditText) findViewById(R.id.edittextUser);
        ePassword = (EditText) findViewById(R.id.edittextPassword);
        bDangnhap = (Button) findViewById(R.id.buttonDangNhap);
        bDangKy =(Button) findViewById(R.id.buttonDangKy);
    }
}