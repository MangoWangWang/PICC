package com.piccjm.picc.aty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.piccjm.picc.R;

// 偷偷加个注释
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toast.makeText(this, "haha", Toast.LENGTH_SHORT).show();
    }
}
