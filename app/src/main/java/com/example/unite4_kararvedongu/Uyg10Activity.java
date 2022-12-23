package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Uyg10Activity extends AppCompatActivity {
Button btnOnayla;
EditText txtSayi;
TextView textView;
   @Override
   protected void  onCreate(Bundle savedInsTanceState){
      super.onCreate(savedInsTanceState);
      setContentView(R.layout.uyg10_activity);
      txtSayi =findViewById(R.id.txtSayi);
      btnOnayla =findViewById(R.id.btnOnayla);
      textView =findViewById(R.id.textView);
   }
  public void btnOnayla(View view){
      int sayi = Integer.parseInt(txtSayi.getText().toString());
      int sayac=1;
      long sonuc=1;
      while (sayac<=sayi){
          sonuc=sonuc*sayac;
          sayac++;
      }
      textView.setText("Sonuç: "+sonuc);
  }
}
