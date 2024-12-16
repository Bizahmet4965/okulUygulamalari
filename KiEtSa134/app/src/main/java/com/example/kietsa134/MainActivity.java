package com.example.kietsa134;

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
    EditText editTextNot1,editTextNot2,editTextNot3;
    Button buttonOnayla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editTextNot1=findViewById(R.id.editTextNumber_Not1);
        editTextNot2=findViewById(R.id.editTextNumber_Not2);
        editTextNot3=findViewById(R.id.editTextNumber_Not3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onayla(View view) {
        int not1 = Integer.parseInt(editTextNot1.getText().toString());
        int not2 = Integer.parseInt(editTextNot2.getText().toString());
        int not3 = Integer.parseInt(editTextNot3.getText().toString());
        float ort = (not1 + not2 + not3) /3.0f;
        if (ort >= 0 && ort <= 25) {
            Toast.makeText(this, "0 ile kaldınız", Toast.LENGTH_LONG).show();
        } else if (ort > 25 && ort <= 50) {
            Toast.makeText(this, "1 ile kaldınız", Toast.LENGTH_LONG).show();
        } else if (ort > 50 && ort <= 60) {
            Toast.makeText(this, "2 ile geçtiniz", Toast.LENGTH_LONG).show();
        } else if (ort > 60 && ort <= 70) {
            Toast.makeText(this, "3 ile geçtiniz", Toast.LENGTH_LONG).show();
        } else if (ort > 70 && ort <= 85) {
            Toast.makeText(this, "4 ile geçtiniz", Toast.LENGTH_LONG).show();
        } else if (ort > 85 && ort <= 100) {
            Toast.makeText(this, "5 ile geçtiniz, Tebrikler!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Girilen not hatalıdır", Toast.LENGTH_LONG).show();
        }
    }
}

