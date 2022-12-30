package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Goldsoru2 extends AppCompatActivity {
    EditText txtMul1, txtMul2, txtSayi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goldsoru2);

        txtSayi = findViewById(R.id.txtNum3);
        txtMul1 = findViewById(R.id.txtMul1);
        txtMul2 = findViewById(R.id.txtMul2);

    }

    public void btnhesapla(View view) {
        int uzunluk = Integer.parseInt(txtSayi.getText().toString());
        int cifttop=0, tektop=0;

        txtMul1.setText("");
        for (int i = 0; i <= uzunluk; i++) {
            if (i % 2 != 0 ) {

                txtMul1.setText(txtMul1.getText().toString() + "\n" + (tektop+=i));
                tektop+=i;


            }
        }

        txtMul2.setText("");
        for (int i = 0; i <= uzunluk; i++) {
            if (i % 2 == 0) {
                txtMul2.setText(txtMul2.getText() + "\n"+(cifttop+=i));
                cifttop+=i;
            }

        }
    }
}




