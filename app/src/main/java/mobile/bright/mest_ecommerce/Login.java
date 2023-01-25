package mobile.bright.mest_ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class Login extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Intent intent = getIntent();
        String productId = intent.getStringExtra("productId");


        MaterialButton materialButtonLogin = findViewById(R.id.buttonLogin);
        TextInputEditText textInputEditTextEmailAddress = findViewById(R.id.textInputEditTextEmailAddress);
        TextInputEditText textInputEditTextPassword = findViewById(R.id.textInputEditTextPassword);
        TextView textViewRegister = findViewById(R.id.textViewRegister);

        materialButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = textInputEditTextEmailAddress.getText().toString().trim();
                String password = textInputEditTextPassword.getText().toString();

                if (email.isEmpty()){
                    textInputEditTextEmailAddress.setError("Enter email address");
                    return;
                }

                if (password.isEmpty()){
                    Toast.makeText(Login.this,"Enter password",Toast.LENGTH_SHORT).show();
                    return;
                }

                SharedPreferences sharedPreferences = getSharedPreferences("test_pref",MODE_PRIVATE);
                sharedPreferences.edit().putBoolean("isLoggedIn", true).apply();

            }
        });

        textViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.setClass(Login.this, MemberRegistration.class);
                startActivity(intent);
                finish();
            }
        });


    }
}