package com.example.rezafd.activity_button;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        final TextView NRP1 = (TextView) findViewById(R.id.textNRP);
        final TextView nama1 = (TextView) findViewById(R.id.textNama);
        final TextView email1 = (TextView) findViewById(R.id.textemail);
        final TextView tmptlahir1 = (TextView) findViewById(R.id.texttmptlahir);
        final TextView tgllahir1 = (TextView) findViewById(R.id.texttgllahir);
        final TextView jurusan1 = (TextView) findViewById(R.id.textjurusan);
        final TextView alamat1 = (TextView) findViewById(R.id.textalamat);
        final TextView noHP1 = (TextView) findViewById(R.id.textNoHp);

        Intent intent = getIntent();
        String nrp = intent.getStringExtra("NRP");
        String nama = intent.getStringExtra("Nama");
        String email = intent.getStringExtra("Email");
        String tmptlahir = intent.getStringExtra("TmptLahir");
        String tgllahir = intent.getStringExtra("TglLahir");
        String jurusan = intent.getStringExtra("Jurusan");
        String alamat = intent.getStringExtra("Alamat");
        String noHP = intent.getStringExtra("NoHP");

        NRP1.setText(nrp);
        email1.setText(email);
        nama1.setText(nama);
        tmptlahir1.setText(tmptlahir);
        tgllahir1.setText(tgllahir);
        jurusan1.setText(jurusan);
        alamat1.setText(alamat);
        noHP1.setText(noHP);

    }
}
