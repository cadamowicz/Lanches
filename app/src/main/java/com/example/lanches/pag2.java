package com.example.lanches;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pag2 extends AppCompatActivity {

    EditText oplanche;
    TextView xburguer, xsalada,xbacon,xtudao;
    EditText qtde;
    TextView sub1;
    Button b2;
    Button b3;

    float subtotal=0;

    String alllanches="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag2);
        oplanche=findViewById(R.id.oplanche);
        sub1=findViewById(R.id.sub1);
        b2=findViewById(R.id.b2);
        qtde=findViewById(R.id.qtde);
        b3=findViewById(R.id.b3);
        xburguer=findViewById(R.id.xburguer);
        xsalada=findViewById(R.id.xsalada);
        xbacon=findViewById(R.id.xbacon);
        xtudao=findViewById(R.id.xtudao);



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String op1 = oplanche.getText().toString();
                int opcao1 = Integer.parseInt(op1);
                String qtd=qtde.getText().toString();
                int quantidade=Integer.parseInt(qtd);


                switch (opcao1) {
                    case 1:
                        subtotal=subtotal+10*quantidade;
                        alllanches = alllanches + "\n" + xburguer.getText().toString();
                        sub1.setText(String.valueOf("R$" + subtotal));

                        break;
                    case 2:
                        subtotal=subtotal+15*quantidade;
                        alllanches = alllanches + "\n" + xsalada.getText().toString();
                        sub1.setText(String.valueOf("R$" + subtotal));
                        break;
                    case 3:
                        subtotal=subtotal+18*quantidade;
                        alllanches = alllanches + "\n" + xbacon.getText().toString();
                        sub1.setText(String.valueOf("R$" + subtotal));
                        break;
                    case 4:
                        subtotal=subtotal+25*quantidade;
                        alllanches = alllanches + "\n" + xtudao.getText().toString();
                        sub1.setText(String.valueOf("R$" + subtotal));
                        break;
                }


            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(pag2.this, pag3.class);
                intent1.putExtra("totalpag2",String.valueOf(subtotal) );
                intent1.putExtra("lanches",String.valueOf(alllanches));
                startActivity(intent1);


            }
        });

    }
}