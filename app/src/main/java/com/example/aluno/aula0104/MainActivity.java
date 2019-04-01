package com.example.aluno.aula0104;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Campotext;
    private EditText Campotext2;
    private EditText num1;
    private EditText num2;
    private Button soma;
    private Button multi;
    private Button sub;
    private Button limpar;
    private Button resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        soma = (Button) findViewById(R.id.soma);
        multi = (Button) findViewById(R.id.multi);
        sub = (Button) findViewById(R.id.sub);
        limpar= (Button) findViewById(R.id.limpar);
        resultado = (Button) findViewById(R.id.resultado);

        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double v1 = Double.parseDouble(num1.getText().toString());
                    Double v2 = Double.parseDouble(num2.getText().toString());

                    Double total = v1+v2;
                    resultado.setText("O resultado é: "+total);
                    Toast.makeText(MainActivity.this, "Blz", Toast.LENGTH_SHORT).show();

                }catch (Exception e ){
                    Toast.makeText(MainActivity.this, "N", Toast.LENGTH_SHORT).show();

                }

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double v1 = Double.parseDouble(num1.getText().toString());
                    Double v2 = Double.parseDouble(num2.getText().toString());

                    Double total = v1-v2;
                    resultado.setText("O resultado é: "+total);
                    Toast.makeText(MainActivity.this, "BLZ", Toast.LENGTH_SHORT).show();
                }catch (Exception e ){
                    Toast.makeText(MainActivity.this, "N", Toast.LENGTH_SHORT).show();

                }
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double v1 = Double.parseDouble(num1.getText().toString());
                    Double v2 = Double.parseDouble(num2.getText().toString());

                    Double total = v1*v2;
                    resultado.setText("O resultado é: "+total);
                    Toast.makeText(MainActivity.this, "BLZ", Toast.LENGTH_SHORT).show();
                }catch (Exception e ){
                    Toast.makeText(MainActivity.this, "N", Toast.LENGTH_SHORT).show();

                }
            }
        });
        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    num1.setText("");
                    num2.setText("");
                    resultado.setText("");

                }catch{

                }

            }
        });




            }
}
