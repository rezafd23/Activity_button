package com.example.rezafd.activity_button;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    TextView txtnama;
    EditText inputnama;
    Button btnset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnama=(TextView)findViewById(R.id.txtnama);
        inputnama =(EditText)findViewById(R.id.inputnama);
        btnset=(Button)findViewById(R.id.btnset);

        btnset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String snama=inputnama.getText().toString();
                Toast.makeText(MainActivity.this,"Hello Selamat "+snama,Toast.LENGTH_SHORT).show();
                txtnama.setText(snama);
                Intent intent=new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }


}
