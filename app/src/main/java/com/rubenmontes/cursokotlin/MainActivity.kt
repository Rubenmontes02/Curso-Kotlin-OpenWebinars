package com.rubenmontes.cursokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tiposdeDatos();
       // variablesYConstantes();
    }


    public fun variablesYConstantes(){

        var variable = "Hello word";

        Log.d("log", variable);
    }

    public fun tiposdeDatos(){

        
    }
}