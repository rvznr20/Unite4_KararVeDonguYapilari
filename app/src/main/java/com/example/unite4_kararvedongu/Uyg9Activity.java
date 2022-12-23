package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Uyg9Activity extends AppCompatActivity {
    EditText txtSayi, txtGetSayi;
    Button btnTek,btnCift,btnTum;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg9_activity);

        txtGetSayi = findViewById(R.id.editTextNumber);
        txtSayi=findViewById(R.id.editTextTextMultiLine);
        btnTek =findViewById(R.id.btnTek);
        btnCift =findViewById(R.id.btnCift);
        btnTum =findViewById(R.id.btnTum);
    }
    public void setBtnTek(View view){
        int uzunluk = Integer.parseInt(txtGetSayi.getText().toString());

        txtSayi.setText("");
        for (int i=0;i<=uzunluk;i++){
            if (i%2!=0){
                txtSayi.setText(txtSayi.getText()+"\n"+i);
            }
        }
    }
    public void setBtnCift(View view){
        int uzunluk = Integer.parseInt(txtGetSayi.getText().toString());
        txtSayi.setText("");
        for (int i=0;i<=uzunluk;i++){
            if (i%2==0){
                txtSayi.setText(txtSayi.getText()+"\n"+i);
            }
        }
    }
   public void  setBtnTum(View view){
       int uzunluk = Integer.parseInt(txtGetSayi.getText().toString());
       txtSayi.setText("");
        for (int i=0;i<=uzunluk;i++){
            txtSayi.setText(txtSayi.getText()+"\n"+i);
           }
        }
}
