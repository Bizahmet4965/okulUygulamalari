package com.example.ketsa123;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumber2;
    EditText editTextNumber;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void kontrol(View view) {
        int sayi1 = Integer.parseInt(editTextNumber.getText().toString());
        int sayi2 = Integer.parseInt(editTextNumber2.getText().toString());
        if (sayi1>sayi2){
            Toast.makeText(MainActivity.this, "1.sayi daha buyuktur",Toast.LENGTH_LONG).show();
        }
        if (sayi1<sayi2){
            Toast.makeText(MainActivity.this, "2.sayi daha buyuktur",Toast.LENGTH_LONG).show();
        }
        if (sayi1==sayi2){
            Toast.makeText(MainActivity.this, "1.sayi da 2.sayida esittir",Toast.LENGTH_LONG).show();
        }
    }
}