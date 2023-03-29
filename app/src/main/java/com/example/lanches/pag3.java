package com.example.lanches;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pag3 extends AppCompatActivity {
    EditText opbebida;
    EditText qtdebebida;
    TextView sub2;
    Button b4;
    Button b5;

    float subtotal1 =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag3);
        opbebida=findViewById(R.id.opbebida);
        qtdebebida=findViewById(R.id.qtdebebida);
        sub2=findViewById(R.id.sub2);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);

        Intent intent1 = getIntent();
        String totalburguer = intent1.getStringExtra("totalpag2");
        sub2.setText(totalburguer);


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String op2 = opbebida.getText().toString();
                int opcao2 = Integer.parseInt(op2);
                String qtd2=qtdebebida.getText().toString();
                int quantidade2=Integer.parseInt(qtd2);


                switch (opcao2) {
                    case 1:
                        subtotal1 = subtotal1 +10*quantidade2;
                        sub2.setText(String.valueOf("R$" + subtotal1));
                        break;
                    case 2:
                        subtotal1 = subtotal1 +15*quantidade2;
                        sub2.setText(String.valueOf("R$" + subtotal1));
                        break;
                    case 3:
                        subtotal1 = subtotal1 +18*quantidade2;
                        sub2.setText(String.valueOf("R$" + subtotal1));
                        break;
                    case 4:
                        subtotal1 = subtotal1 +25*quantidade2;
                        sub2.setText(String.valueOf("R$" + subtotal1));
                        break;
                }


            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}