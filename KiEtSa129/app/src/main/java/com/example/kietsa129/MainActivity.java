package com.example.kietsa129;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch sw1_Ks,sw2_KbA,sw3_KsA;
    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        sw1_Ks=findViewById(R.id.sw_Ks);
        sw2_KbA=findViewById(R.id.sw_KbA);
        sw3_KsA=findViewById(R.id.sw_KbA);
        if(sw1_Ks.isChecked()){
            sw3_KsA.setVisibility(View.VISIBLE);
            sw2_KbA.setVisibility(View.VISIBLE);
        }
        else{
            sw2_KbA.setVisibility(View.GONE);
            sw3_KsA.setVisibility(View.GONE);
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        sw1_Ks.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (sw1_Ks.isChecked()){
                    sw2_KbA.setVisibility(View.VISIBLE);
                    sw3_KsA.setVisibility(View.VISIBLE);
                }
                else {
                    sw2_KbA.setVisibility(View.GONE);
                    sw3_KsA.setVisibility(View.GONE);
                }
            }
        });
    }
    private void onayla(View view){
        if (!sw1_Ks.isChecked()){
            Toast.makeText(this, "Konum Servisleri Kapalı",Toast.LENGTH_LONG).show();
        }
        else{
            if (sw2_KbA.isChecked()==true&&sw3_KsA.isChecked()==true){
                Toast.makeText(this,"Konum AL Ve konum gönder açık",Toast.LENGTH_LONG).show();
            }
            if (sw2_KbA.isChecked()==true&&sw3_KsA.isChecked()==false){
                Toast.makeText(this,"Konum al açık konum gönder kapalı",Toast.LENGTH_LONG).show();
            }
            if (sw2_KbA.isChecked()==false&&sw3_KsA.isChecked()==true){
                Toast.makeText(this,"Konum al kapalı konum gönder açık",Toast.LENGTH_LONG).show();
            }
            if (sw2_KbA.isChecked()==false&&sw3_KsA.isChecked()==false){
                Toast.makeText(this,"Konum al ve konum gönder kapalı",Toast.LENGTH_LONG).show();
            }
        }
    }
}
