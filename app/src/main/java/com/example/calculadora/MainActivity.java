package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Digito, Concatenar;
    Button BorrarDigito, Dividir, Potenciador, Numero7, Numero8, Numero9,
    Resta, Numero4, Numero5, Numero6, Suma, Numero1, Numero2,
    Numero3, Igual, Porcentaje, Numero0, Punto, Multiplicacion;
    double NumeroUno, NumeroDos, Resultado;
    String Operadores;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Multiplicacion=findViewById(R.id.Boton_Multiplicar);
        Digito=findViewById(R.id.Digitos);
        BorrarDigito=findViewById(R.id.Boton_Borrar);
        Dividir=findViewById(R.id.Boton_Dividir);
        Potenciador=findViewById(R.id.Boton_Potencial);
        Numero7=findViewById(R.id.Boton_Numero7);
        Numero8=findViewById(R.id.Boton_Numero8);
        Numero9=findViewById(R.id.Boton_Numero9);
        Resta=findViewById(R.id.Boton_Resta);
        Numero4=findViewById(R.id.Boton_Numero4);
        Numero5=findViewById(R.id.Boton_Numero5);
        Numero6=findViewById(R.id.Boton_Numero6);
        Suma=findViewById(R.id.Boton_Suma);
        Numero1=findViewById(R.id.Boton_Numero1);
        Numero2=findViewById(R.id.Boton_Numero2);
        Numero3=findViewById(R.id.Boton_Numero3);
        Igual=findViewById(R.id.Boton_Igual);
        Porcentaje=findViewById(R.id.Boton_Porcentaje);
        Numero0=findViewById(R.id.Boton_Numero0);
        Punto=findViewById(R.id.Boton_Punto);

        Potenciador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Operadores = "^2";
                Concatenar = (EditText) findViewById(R.id.Digitos);
                NumeroUno = Double.parseDouble(Concatenar.getText().toString());
                Digito.setText("");

            }
        });

        Porcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Operadores = "%";
                Concatenar = (EditText) findViewById(R.id.Digitos);
                NumeroUno = Double.parseDouble(Concatenar.getText().toString());
                Digito.setText("");

            }
        });

        Punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Concatenar=(EditText) findViewById(R.id.Digitos);
                Digito.setText(Concatenar.getText().toString()+".");

            }
        });

        Numero0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Concatenar=(EditText) findViewById(R.id.Digitos);
                Digito.setText(Concatenar.getText().toString()+"0");

            }
        });

        Numero1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Concatenar=(EditText) findViewById(R.id.Digitos);
                Digito.setText(Concatenar.getText().toString()+"1");

            }
        });

        Numero2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Concatenar=(EditText) findViewById(R.id.Digitos);
                Digito.setText(Concatenar.getText().toString()+"2");

            }
        });

        Numero3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Concatenar=(EditText) findViewById(R.id.Digitos);
                Digito.setText(Concatenar.getText().toString()+"3");

            }
        });

        Numero4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Concatenar=(EditText) findViewById(R.id.Digitos);
                Digito.setText(Concatenar.getText().toString()+"4");

            }
        });

        Numero5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Concatenar=(EditText) findViewById(R.id.Digitos);
                Digito.setText(Concatenar.getText().toString()+"5");

            }
        });

        Numero6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Concatenar=(EditText) findViewById(R.id.Digitos);
                Digito.setText(Concatenar.getText().toString()+"6");

            }
        });

        Numero7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Concatenar=(EditText) findViewById(R.id.Digitos);
                Digito.setText(Concatenar.getText().toString()+"7");

            }
        });

        Numero8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Concatenar=(EditText) findViewById(R.id.Digitos);
                Digito.setText(Concatenar.getText().toString()+"8");

            }
        });

        Numero9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Concatenar=(EditText) findViewById(R.id.Digitos);
                Digito.setText(Concatenar.getText().toString()+"9");

            }
        });

        Igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Concatenar=(EditText) findViewById(R.id.Digitos);
                NumeroDos=Double.parseDouble(Digito.getText().toString());

                if (Operadores.equals("+"))
                {
                    Digito.setText("");
                    Resultado = NumeroUno + NumeroDos;
                }

                if (Operadores.equals("-"))
                {
                    Digito.setText("");
                    Resultado = NumeroUno - NumeroDos;
                }

                if (Operadores.equals("*"))
                {
                    Digito.setText("");
                    Resultado = NumeroUno * NumeroDos;
                }

                if (Operadores.equals("%"))
                {
                    Digito.setText("");
                    Resultado = (NumeroUno * NumeroDos) / 100;

                }

                if (Operadores.equals("^2"))
                {
                    Digito.setText("");
                    NumeroUno = NumeroUno * NumeroDos;
                    Resultado = NumeroUno;
                }

                if (Operadores.equals("/"))
                {
                    Digito.setText("");
                    if (NumeroDos!=0)
                    {
                      Resultado = NumeroUno / NumeroDos;
                    }
                    else
                    {
                        Digito.setText("Infinito");
                    }
                }
                Digito.setText(String.valueOf(Resultado));

            }
        });

        BorrarDigito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NumeroUno = 0;
                NumeroDos = 0;
                Digito.setText("");

            }
        });

        Suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Operadores = "+";
                Concatenar = (EditText) findViewById(R.id.Digitos);
                NumeroUno = Double.parseDouble(Concatenar.getText().toString());
                Digito.setText("");

            }
        });

        Resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Operadores = "-";
                Concatenar = (EditText) findViewById(R.id.Digitos);
                NumeroUno = Double.parseDouble(Concatenar.getText().toString());
                Digito.setText("");

            }
        });

        Multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Operadores = "*";
                Concatenar = (EditText) findViewById(R.id.Digitos);
                NumeroUno = Double.parseDouble(Concatenar.getText().toString());
                Digito.setText("");

            }
        });

        Dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Operadores = "/";
                Concatenar = (EditText) findViewById(R.id.Digitos);
                NumeroUno = Double.parseDouble(Concatenar.getText().toString());
                Digito.setText("");

            }
        });

    }



}