package com.casting99.passandoparametroactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textView = (TextView) findViewById(R.id.idtext);

        Intent objetoIntent = getIntent();

        String nomeRecebido = objetoIntent.getStringExtra("idValor");

        textView.setText(nomeRecebido);

    }
}
