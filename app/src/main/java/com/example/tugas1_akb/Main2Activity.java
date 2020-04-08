package com.example.tugas1_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private String kd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView view = (TextView) findViewById(R.id.kttn);
        String formattedText = "<b>Ketentuan Pengguna</b> dan <b>Kebijakan Data</> Kami";
        // or getString(R.string.htmlFormattedText);
        view.setText(Html.fromHtml(formattedText));
        EditText et = findViewById(R.id.kd);
        et.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
    }

    public void Kd(View view) {
        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(intent);
    }

}
