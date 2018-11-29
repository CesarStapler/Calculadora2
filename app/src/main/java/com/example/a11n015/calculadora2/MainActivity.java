package com.example.a11n015.calculadora2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView pantalla;
    double num1, num2, resultado;
    double operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla=findViewById(R.id.textView6);

    }
    public void button1 (View view){
        pantalla.setText(pantalla.getText()+("1"));
    }
    public void button2 (View view){
        pantalla.setText(pantalla.getText()+("2"));
    }
    public void button3 (View view){
        pantalla.setText(pantalla.getText()+("3"));
    }
    public void button4 (View view){
        pantalla.setText(pantalla.getText()+("4"));
    }
    public void button5 (View view){
        pantalla.setText(pantalla.getText()+("5"));
    }
    public void button6 (View view){
        pantalla.setText(pantalla.getText()+("6"));
    }
    public void button7 (View view){
        pantalla.setText(pantalla.getText()+("7"));
    }
    public void button8 (View view){
        pantalla.setText(pantalla.getText()+("8"));
    }
    public void button9 (View view){
        pantalla.setText(pantalla.getText()+("9"));
    }
    public void button0 (View view){
        pantalla.setText(pantalla.getText()+("0"));
    }

   public void sumar(View view){
        try{
            String aux1=pantalla.getText().toString();
            num1= Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
            pantalla.setText("");
            operacion=1;
   }
    public void restar(View view){
        try{
            String aux1=pantalla.getText().toString();
            num1= Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pantalla.setText("");
        operacion=2;
    }
    public void multiplicar(View view){
        try{
            String aux1=pantalla.getText().toString();
            num1= Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pantalla.setText("");
        operacion=3;
    }
    public void dividir(View view){
        try{
            String aux1=pantalla.getText().toString();
            num1= Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pantalla.setText("");
        operacion=4;
    }
    public  void buttonigual(View view){
        try{
            String aux2=pantalla.getText().toString();
            num2= Double.parseDouble(aux2);
        }catch (NumberFormatException nfe){}
        pantalla.setText("");

        if (operacion==1){
            resultado=num1+num2;
        }else if (operacion==2){
            resultado= num1-num2;
        }else if (operacion==3){
            resultado= num1*num2;
        }else  if (operacion==4){
            resultado=num1/num2;
        }
        pantalla.setText(""+resultado);
        num1=resultado;

    }
    public void Borrar (View view) {
        num1 = 0.0;
        num2 = 0.0;
        pantalla.setText("");

    }

    }
