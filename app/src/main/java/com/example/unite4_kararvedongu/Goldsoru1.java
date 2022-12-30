package com.example.unite4_kararvedongu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Goldsoru1 extends AppCompatActivity {
    EditText txtSayi,MultiSayi;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goldsoru1);


        txtSayi=findViewById(R.id.editTextNumber2);
        MultiSayi = findViewById(R.id.Multisayi);
    }

    public void setBtnHesapla(View view) {
        int sayi = Integer.parseInt(txtSayi.getText().toString());
        int sonuc = 1;
        for (int i = 1; i <= 10; i++) {
            sonuc = sayi * i;
            MultiSayi.setText(MultiSayi.getText().toString() + sayi + " x " + i + " = " + sonuc);
            MultiSayi.setText(MultiSayi.getText() + "\n");
        }
    }


}

