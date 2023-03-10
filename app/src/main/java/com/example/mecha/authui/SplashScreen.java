package com.example.mecha.authui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mecha.R;
import com.example.mecha.mecha.MechaMenuActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class SplashScreen extends AppCompatActivity {
//FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        mAuth = FirebaseAuth.getInstance();
        //menghilangkan ActionBar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
//                mAuth.signOut();
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
//                startActivity(new Intent(getApplicationContext(), MechaMenuActivity.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }
}