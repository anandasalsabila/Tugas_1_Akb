package com.example.tugas1_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    String nme;
    private String keynm = "Nama";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void Selanjutnya(View view) {
        EditText masukan_nama = findViewById(R.id.nm);
        nme = masukan_nama.getText().toString();
        try{
            if (nme != null && nme != ""){
            Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
            intent.putExtra(keynm, nme);
            startActivity(intent);

            } else{
                Toast.makeText(getApplication(),
                "Nama dan Umur Wajib di isi", Toast.LENGTH_SHORT);
            }
        } catch (Exception e){
            e.printStackTrace();
            Toast.makeText(getApplication(), "ERROR, TRY AGAIN !", Toast.LENGTH_SHORT);
        }
    }
}
