package com.example.kietsa137;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText number;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        number=findViewById(R.id.editTextNumber_AY);
        button=findViewById(R.id.onayla);
        textView=findViewById(R.id.textView);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void onayla(View view){
        int sayiAy=Integer.parseInt(number.getText().toString());
        String ay="";
        number.setText("");
        switch(sayiAy){
            case 1:
                ay="Ocak";
                break;
            case 2:
                ay="Şubat";
                break;
            case 3:
                ay="Mart";
                break;
            case 4:
                ay="Nisan";
                break;
            case 5:
                ay="Mayıs";
                break;
            case 6:
                ay="Haziran";
                break;
            case 7:
                ay="Temmuz";
                break;
            case 8:
                ay="Ağustos";
                break;
            case 9:
                ay="Eylül";
                break;
            case 10:
                ay="Ekim";
                break;
            case 11:
                ay="Kasım";
                break;
            case 12:
                ay="Aralık";
                break;
            default:
                ay="Yanlış Bilgi";
                break;
        }
        textView.setText(ay);
    }
}