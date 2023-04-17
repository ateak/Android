package ru.alexanderklimov.expresscourse;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button mCrowsCounterButton;
    private int mCount = 0;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mCrowsCounterButton = findViewById(R.id.buttonCrowsCounter);
        mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInfoTextView = findViewById(R.id.textView);
                mInfoTextView.setText("Я насчитал " + ++mCount + " ворон");
            }
        });
    }

    public void onClick(View view) {
        mInfoTextView.setText("Hello Kitty!");
    }
}