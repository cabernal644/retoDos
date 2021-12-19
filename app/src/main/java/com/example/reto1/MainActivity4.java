package com.example.reto1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }


    /**  area para colocar el menu **/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_imagenes, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.opcion) {
            Intent segundaPantalla = new Intent(this, MainActivity.class);
            startActivity(segundaPantalla);
        }
        if (id == R.id.opcion1) {
            Intent terceraPantalla = new Intent(this, MainActivity2.class);
            startActivity(terceraPantalla);
        }
        if (id == R.id.opcion2) {
            Intent cuartaPantalla = new Intent(this, MainActivity3.class);
            startActivity(cuartaPantalla);
        }
        return super.onOptionsItemSelected(item);
    }

   //***************************************** Menu Botones ***********************************************
    public void Seleccion (View view) {
        switch (view.getId()) {
            case R.id.hamburgesa:
                Toast.makeText(this, "hamburguesa rica", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bigHamburguesa:
                Toast.makeText(this, "hamburguesa  de doble carne", Toast.LENGTH_SHORT).show();
                break;
            case R.id.megaHamburguesa:
                Toast.makeText(this, "el sabor mas extremo para personas extremas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.vegetarina:
                Toast.makeText(this, "sabemos que la carne es muy dificil de dejar te tenmos la mejor hamburgesa  vegetarina del mercado", Toast.LENGTH_SHORT).show();
                break;
            case R.id.complementos:
                Toast.makeText(this, "las mejores papas fritas que probaras con una salsa deliciosa ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bebida:
                Toast.makeText(this, "Las nuevas bebidad con sabores inolvidables te sorprendera  ", Toast.LENGTH_SHORT).show();
                break;



        }
    }
    //*************************************************************************************************************************************************
}