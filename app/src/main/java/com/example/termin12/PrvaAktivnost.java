package com.example.termin12;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class PrvaAktivnost extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prva_aktivnost);
        if (savedInstanceState != null)
             brojac = savedInstanceState.getInt("brojac");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("PrvaAktivnost", "Ovo je onStart metoda");
        Toast.makeText(this, "Ovo je onStart metoda", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("PrvaAktivnost", "Ovo je onStop metoda");
        Toast.makeText(this, "Ovo je onStop metoda", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("PrvaAktivnost", "Ovo je onDestroy metoda");
        Toast.makeText(this, "Ovo je onDestroy metoda", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("PrvaAktivnost", "Ovo je onPause metoda");
        Toast.makeText(this, "Ovo je onPause metoda", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("PrvaAktivnost", "Ovo je onResume metoda");
        Toast.makeText(this, "Ovo je onResume metoda", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("PrvaAktivnost", "Ovo je onRestart metoda");
        Toast.makeText(this, "Ovo je onRestart metoda", Toast.LENGTH_SHORT).show();

    }

    private int brojac = 1;
    public void onClick(View v){
        Toast.makeText(this, "Kliknuli ste na OK dugme!" +brojac++, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("brojac" ,brojac);
    }
}