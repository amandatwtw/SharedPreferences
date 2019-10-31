package com.example.responsi_0288;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityLogin extends AppCompatActivity {

    Button mbtn_login;
    EditText et_username;
    EditText et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);
        mbtn_login = findViewById(R.id.btn_login);

        mbtn_login.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    String usernameKey = et_username.getText().toString();
                    String passwordKey = et_password.getText().toString();

                    if (usernameKey.equals("admin") && passwordKey.equals("admin123")){
                        //jika berhasil
                        Toast.makeText(getApplicationContext(), "Ayeayyy Login Berhasil",
                                Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(ActivityLogin.this,ActivityHome.class);
                        ActivityLogin.this.startActivity(intent);
                        finish();
                    }
                    else {
                        //jika gagal
                        AlertDialog.Builder builder = new AlertDialog.Builder(ActivityLogin.this);
                        builder.setMessage("Username atau Password anda SALAH !")
                                .setNegativeButton("Retry",null).create().show();
                    }
                }
            });
    }
}
