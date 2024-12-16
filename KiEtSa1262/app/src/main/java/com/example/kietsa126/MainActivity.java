package com.example.kietsa126;

import android.annotation.SuppressLint;
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
    EditText editTextText2, editTextText3;
    Button button;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editTextText2=findViewById(R.id.editTextText2);
        editTextText3=findViewById(R.id.editTextText3);
        button=findViewById(R.id.button);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    final String kullaniciAdi = "Ahmedo";
    final String Sifre = "1234";
    private void onayla(View view){
        String kAdiGiris=editTextText2.getText() .toString();
        String sGiris=editTextText3.getText() .toString();
        if (kullaniciAdi.equals(kAdiGiris)&&Sifre.equals(sGiris)){
            Toast.makeText(this, "Kullanici Girisi Basarili", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,"Kullanici Girisi Basarisiz",Toast.LENGTH_SHORT).show();
        }
    }
}