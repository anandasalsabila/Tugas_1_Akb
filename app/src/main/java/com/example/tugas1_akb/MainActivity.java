package com.example.tugas1_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
/*
NIM     : 10117133
NAMA    : ANANDA SALSABILA ANWIR
KELAS   : IF4
MATKUL  : APLIKASI KOMPUTASI BERGERAK
TUGAS   : AKB-Tugas-1


 */
//  6 April 2020, 13.10 WIB  : Selesai membuat halaman activity_main
//  6 April 2020, 14.35 WIB  : Selesai membuat halaman activity_main2
//  8 April 2020, 16:55 WIB  : Selesai membuat halaman activity_main3 dan activity_main4
//  Tugas sudah selesai
// 8 April 2020, Membuat apk rilis dan megirim file ke email. Dan upload ke github

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Masuk(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
}
