package com.example.lanches;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pag2 extends AppCompatActivity {

    EditText oplanche;
    TextView sub1;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag2);
        oplanche=findViewById(R.id.oplanche);
        sub1=findViewById(R.id.sub1);
        b2=findViewById(R.id.b2);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String op1 = oplanche.getText().toString();
                int opcao1 = Integer.parseInt(op1);

                float subtotal=0;

                switch (opcao1) {
                    case 1:
                        subtotal=10;
                        sub1.setText(String.valueOf("R$" + subtotal));
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                }






                // etresultado.setText(String.valueOf(somatotal));



            }
        });
    }
}