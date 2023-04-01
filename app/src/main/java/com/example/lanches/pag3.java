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
    TextView coca,guarana,aguasgas,aguacgas,delvale;
    Button b4;
    Button b5;

    float subtotal1 =0;
    String allbebidas="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag3);
        opbebida=findViewById(R.id.opbebida);
        qtdebebida=findViewById(R.id.qtdebebida);
        sub2=findViewById(R.id.sub2);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        coca=findViewById(R.id.coca);
        guarana=findViewById(R.id.guarana);
        aguasgas=findViewById(R.id.aguasgas);
        aguacgas=findViewById(R.id.aguacgas);
        delvale=findViewById(R.id.delvale);

        Intent intent1 = getIntent();
        String totalburguer = intent1.getStringExtra("totalpag2");
        String tempalllanches = intent1.getStringExtra("lanches");
        sub2.setText(totalburguer);

        subtotal1=Float.parseFloat(totalburguer);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String op2 = opbebida.getText().toString();
                int opcao2 = Integer.parseInt(op2);
                String qtd2=qtdebebida.getText().toString();
                int quantidade2=Integer.parseInt(qtd2);


                switch (opcao2) {
                    case 1:
                        subtotal1 = subtotal1 +6*quantidade2;
                        allbebidas = allbebidas + "\n" + coca.getText().toString();
                        sub2.setText(String.valueOf("R$" + subtotal1));
                        break;
                    case 2:
                        subtotal1 = subtotal1 +5*quantidade2;
                        allbebidas = allbebidas + "\n" + guarana.getText().toString();
                        sub2.setText(String.valueOf("R$" + subtotal1));
                        break;
                    case 3:
                        subtotal1 = subtotal1 +3*quantidade2;
                        allbebidas = allbebidas + "\n" + aguasgas.getText().toString();
                        sub2.setText(String.valueOf("R$" + subtotal1));
                        break;
                    case 4:
                        subtotal1 = subtotal1 +4*quantidade2;
                        allbebidas = allbebidas + "\n" + aguacgas.getText().toString();
                        sub2.setText(String.valueOf("R$" + subtotal1));
                        break;
                    case 5:
                        subtotal1 = subtotal1 +7*quantidade2;
                        allbebidas = allbebidas + "\n" + delvale.getText().toString();
                        sub2.setText(String.valueOf("R$" + subtotal1));
                        break;
                }

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(pag3.this, pag4.class);

                intent2.putExtra("totalpag3",String.valueOf(subtotal1) );
                intent2.putExtra("novoalllanches",String.valueOf(tempalllanches) );
                intent2.putExtra("bebidas",String.valueOf(allbebidas));
                startActivity(intent2);

            }
        });


    }
}