package ru.alexanderklimov.severalactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    public void onImageClick(View view) {
        EditText userEditText = findViewById(R.id.editTextUser);
        EditText giftEditText = findViewById(R.id.editTextGift);

        Intent intent = new Intent(MainActivity.this, BirthdayActivity.class);

        intent.putExtra("username", userEditText.getText().toString());
        intent.putExtra("gift", giftEditText.getText().toString());

        startActivity(intent);
    }
}