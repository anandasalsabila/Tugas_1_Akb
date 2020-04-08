package com.example.tugas1_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    String keynm = "Nama";
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Bundle extra = getIntent().getExtras();

        String nme = extra.getString(keynm);
        text = findViewById(R.id.brs);
        text.setText("Beres! Sekarang " +nme+ " udah bisa ngecek penggunaan HP " +nme+ "tiap hari buat bantu "+nme+" ngatur waktu:)");
    }

    public void Oke(View view){
        Intent intent = new Intent(Main4Activity.this, MainActivity.class);
        startActivity(intent);
    }
}
