package com.example.kietsa112_ss;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Etiket"; // Log etiketi

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Kenar boşluklarını ayarla (Edge-to-Edge UI için)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Log.d(TAG, "debug (hata ayıklama)");
    }

    public void islemYap(View view) {
        Log.i(TAG, "Düğmeye tıklandı");
        EditText editText = findViewById(R.id.editText);
        String s1 = editText.getText().toString();
        Log.i(TAG, "EditText içindeki yazı alındı");
        try {
            int sayi = Integer.parseInt(s1);
            Log.i(TAG, "Yazı sayıya çevrildi");
            sayi = sayi + 2;
            Log.i(TAG, "Sayıya 2 eklendi");
            Toast.makeText(this, "Sonuç: " + sayi, Toast.LENGTH_SHORT).show();
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Geçersiz bir sayı girdiniz!", Toast.LENGTH_SHORT).show();
            Log.e(TAG, "Geçersiz sayı: " + s1);
        }
    }
}