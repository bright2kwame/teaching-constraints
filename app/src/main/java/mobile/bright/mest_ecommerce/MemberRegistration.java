package mobile.bright.mest_ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class MemberRegistration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_registration);


        TextInputEditText textInputEditTextName = findViewById(R.id.editTextName);
        String name = Objects.requireNonNull(textInputEditTextName.getText()).toString();
        if (name.isEmpty()){

        }
    }
}