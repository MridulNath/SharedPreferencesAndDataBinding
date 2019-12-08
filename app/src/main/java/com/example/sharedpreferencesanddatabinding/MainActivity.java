package com.example.sharedpreferencesanddatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sharedpreferencesanddatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=binding.nameET.getText().toString();
                String pass=binding.passET.getText().toString();

                Intent intent=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });

    }

  /*  public void logInUser(View view) {

        String name=binding.nameET.getText().toString();
        String pass=binding.passET.getText().toString();

        Intent intent=new Intent(MainActivity.this,HomeActivity.class);
        startActivity(intent);
    }*/
}
