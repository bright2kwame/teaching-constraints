package mobile.bright.mest_ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        MaterialButton buttonStart = findViewById(R.id.buttonStart);
        buttonStart.setOnClickListener(view -> {
            Intent loginIntent = new Intent(SplashScreen.this, Login.class);
            loginIntent.putExtra("productId", "2");
            startActivity(loginIntent);
            finish();
        });


        SharedPreferences sharedPreferences = getSharedPreferences("test_pref", MODE_PRIVATE);
        boolean isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false);
        if (isLoggedIn) {
            startActivity(new Intent(SplashScreen.this, Home.class));
            finish();
        }
    }
}