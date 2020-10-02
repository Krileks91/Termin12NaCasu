package com.example.termin12;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
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

    public void onClick(View view) {
        Toast.makeText(this, "Kliknuli ste na OK dugme!" + brojac++, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("brojac", brojac);
    }
    //Dugme da nas prebaci na drugi aktiviti
    public void OnClickSecondActivity(View v) {
        Intent i = new Intent(this, DrugiAktiviti.class);
        startActivity(i);
    }

    static final int REQUEST_SELECT_CONTACT = 1;

    //Dugme kojim pozivamo imenik iz telefona
    public void selectContact(int requestSelectContact) {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType(ContactsContract.Contacts.CONTENT_TYPE);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, REQUEST_SELECT_CONTACT);
        }
    }
    //Kao rezultat uzimamo taj kontakt
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_SELECT_CONTACT && resultCode == RESULT_OK) {
            Uri contactUri = data.getData();
        }
    }
    //Kada se otvori imenik dobijamo da izaberemo kontakt
    static final int RESULT_PICK_CONTACT = 1;
    public void pickContact(View v) {
        Intent contactPickerIntent = new Intent(Intent.ACTION_PICK,
                ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
        startActivityForResult(contactPickerIntent, RESULT_PICK_CONTACT);
    }
}


