package com.dapursulawesi.konversisuhu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;



public class MainActivity extends AppCompatActivity {
    EditText clcv,input;
    Button btn_konversi;
    Spinner asal,akhir;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //variable
        input = (EditText)findViewById(R.id.idinput);
        btn_konversi = (Button)findViewById(R.id.idconvert);
        clcv = (EditText)findViewById(R.id.cltocv);

        //listing spinner
        adapter = ArrayAdapter.createFromResource(this,R.array.list_convert,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //start spinner_asal
        asal = (Spinner)findViewById(R.id.idasal);
        asal.setAdapter(adapter);

        //start spinner_akhir
        akhir = (Spinner)findViewById(R.id.idakhir);
        akhir.setAdapter(adapter);

    }
    public void diconvert (View view){
        double ninput = Double.parseDouble(input.getText().toString());
        //Formula Celcius to all
        double nclcv = ninput+273.15;
        double nclfa = ninput*1.8+32;
        double nclre = ninput*0.8;
        double nclra = ninput*1.8+32+459.67;

        //formula Kelvin to all
        double ncvcl = ninput-273.15;
        double ncvfa = ninput*1.8-459.67;
        double ncvre = (ninput-273.15)*0.8;
        double ncvra = ninput*1.8;

        //formula Fahreneit to all
        double nfacl = (ninput-32)/1.8;
        double nfacv = (ninput+459.67)/1.8;
        double nfare = (ninput-32)/2.25;
        double nfara = ninput+459.67;

        //formula Reamur to all
        double nrecl = ninput*1.25;
        double nrecv = (ninput*1.25)+273.15;
        double nrefa = ninput*2.25+32;
        double nrera = ninput*2.25+32+459.67;

        //formula Rankine to all
        double nracl = (ninput-32-459.67)/1.8;
        double nracv = ninput/1.8;
        double nrafa = ninput-459.67;
        double nrare = (ninput-32-459.67)/2.25;


        //start convert celcius to all

        try{

            if (asal.getSelectedItem().toString().equals("Celcius") && akhir.getSelectedItem().toString().equals("Kelvin")){
                clcv.setText(String.valueOf(nclcv));
            }
            else if (asal.getSelectedItem().toString().equals("Celcius") && akhir.getSelectedItem().toString().equals("Fahrenheit")){
                clcv.setText(String.valueOf(nclfa));
            }
            else if (asal.getSelectedItem().toString().equals("Celcius") && akhir.getSelectedItem().toString().equals("Reamur")){
                clcv.setText(String.valueOf(nclre));
            }
            else if (asal.getSelectedItem().toString().equals("Celcius") && akhir.getSelectedItem().toString().equals("Rankine")){
                clcv.setText(String.valueOf(nclra));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        //end convert celcius to all

        //start convert kelvin to all
        try{

            if (asal.getSelectedItem().toString().equals("Kelvin") && akhir.getSelectedItem().toString().equals("Celcius")){
                clcv.setText(String.valueOf(ncvcl));
            }
            else if (asal.getSelectedItem().toString().equals("Kelvin") && akhir.getSelectedItem().toString().equals("Fahrenheit")){
                clcv.setText(String.valueOf(ncvfa));
            }
            else if (asal.getSelectedItem().toString().equals("Kelvin") && akhir.getSelectedItem().toString().equals("Reamur")){
                clcv.setText(String.valueOf(ncvre));
            }
            else if (asal.getSelectedItem().toString().equals("Kelvin") && akhir.getSelectedItem().toString().equals("Rankine")){
                clcv.setText(String.valueOf(ncvra));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        //end convert kelvin to all

        //start convert Fahrenheit to all
        try{

            if (asal.getSelectedItem().toString().equals("Fahrenheit") && akhir.getSelectedItem().toString().equals("Celcius")){
                clcv.setText(String.valueOf(nfacl));
            }
            else if (asal.getSelectedItem().toString().equals("Fahrenheit") && akhir.getSelectedItem().toString().equals("Kelvin")){
                clcv.setText(String.valueOf(nfacv));
            }
            else if (asal.getSelectedItem().toString().equals("Fahrenheit") && akhir.getSelectedItem().toString().equals("Reamur")){
                clcv.setText(String.valueOf(nfare));
            }
            else if (asal.getSelectedItem().toString().equals("Fahrenheit") && akhir.getSelectedItem().toString().equals("Rankine")){
                clcv.setText(String.valueOf(nfara));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        //end convert Fahrenheit to all

        //start convert Reamur to all
        try{

            if (asal.getSelectedItem().toString().equals("Reamur") && akhir.getSelectedItem().toString().equals("Celcius")){
                clcv.setText(String.valueOf(nrecl));
            }
            else if (asal.getSelectedItem().toString().equals("Reamur") && akhir.getSelectedItem().toString().equals("Kelvin")){
                clcv.setText(String.valueOf(nrecv));
            }
            else if (asal.getSelectedItem().toString().equals("Reamur") && akhir.getSelectedItem().toString().equals("Fahrenheit")){
                clcv.setText(String.valueOf(nrefa));
            }
            else if (asal.getSelectedItem().toString().equals("Reamur") && akhir.getSelectedItem().toString().equals("Rankine")){
                clcv.setText(String.valueOf(nrera));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        //end convert Reamur to all

        //start convert Rankine to all
        try{

            if (asal.getSelectedItem().toString().equals("Rankine") && akhir.getSelectedItem().toString().equals("Celcius")){
                clcv.setText(String.valueOf(nracl));
            }
            else if (asal.getSelectedItem().toString().equals("Rankine") && akhir.getSelectedItem().toString().equals("Kelvin")){
                clcv.setText(String.valueOf(nracv));
            }
            else if (asal.getSelectedItem().toString().equals("Rankine") && akhir.getSelectedItem().toString().equals("Fahrenheit")){
                clcv.setText(String.valueOf(nrafa));
            }
            else if (asal.getSelectedItem().toString().equals("Rankine") && akhir.getSelectedItem().toString().equals("Reamur")){
                clcv.setText(String.valueOf(nrare));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        //end convert Rankine to all

    }
    public void diclear (View view){
        input.getText().clear();
        clcv.getText().clear();
    }
}
