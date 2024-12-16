package com.example.ketsa139ss;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView text;
    Button kontrol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextNumber);
        text = findViewById(R.id.textView);
        kontrol = findViewById(R.id.button);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        kontrol.setOnClickListener(this::kontrol);
    }

    public void kontrol(View view) {
        int yas = Integer.parseInt(editText.getText().toString());
        String Tyas="";
        if (yas >= 18) {
            Toast.makeText(this, "Ehliyet Alabilirsin", Toast.LENGTH_LONG).show();
            Tyas="Ehliyet Alablirsin";
        } else {
            Toast.makeText(this, "Ehliyet ALamazsın", Toast.LENGTH_LONG).show();
            Tyas="Ehliyet Alamazsın";
        }
        text.setText(Tyas);
    }
}