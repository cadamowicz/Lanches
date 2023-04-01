package com.example.lanches;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pag4 extends AppCompatActivity {

    TextView valortotalpedido;

    TextView lanchetotal,bebidatotal;
    Button b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag4);
        b6=findViewById(R.id.b6);
        valortotalpedido=findViewById(R.id.valortotalpedido);
        bebidatotal=findViewById(R.id.bebidatotal);
        lanchetotal=findViewById(R.id.lanchetotal);

        Intent intent2 = getIntent();
        String totalfinal = intent2.getStringExtra("totalpag3");
        String totallanches = intent2.getStringExtra("novoalllanches");
        String totalbebidas = intent2.getStringExtra("bebidas");
        lanchetotal.setText(totallanches);
        bebidatotal.setText(totalbebidas);
        valortotalpedido.setText("R$" + totalfinal);


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(pag4.this, MainActivity.class);
                startActivity(intent3);
            }
        });
    }



}