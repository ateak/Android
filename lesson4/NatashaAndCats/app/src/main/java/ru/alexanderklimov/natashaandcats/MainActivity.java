package ru.alexanderklimov.natashaandcats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView secondTextView = findViewById(R.id.second_text);
        TextView thirdTextView = findViewById(R.id.third_text);
        TextView fourTextView = findViewById(R.id.fourth_text);

        ImageView right_bottom_image = findViewById(R.id.right_bottom_image);
        right_bottom_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] phrases = {"Уже 6 часов утра, Наташ",
                        "Вставай, мы там все уронили",
                        "Мы уронили вообще все, Наташ, честно",
                        "Наташ, ты че опять лежишь?",
                        "Часики-то тикают",
                        "Мужика-то хоть нашла себе?",
                        "Уже дитачек пора рожать вообще-то"};

                shuffleArray(phrases); //перемешиваем

                secondTextView.setText(phrases[0]);
                thirdTextView.setText(phrases[1]);
                fourTextView.setText(phrases[2]);
            }
        });
    }

    void shuffleArray(String[] arr) {
        Random rnd = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            String a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }
    }
}