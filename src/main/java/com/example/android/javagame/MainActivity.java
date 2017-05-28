package com.example.android.javagame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonA(View view) {
        String message = "Correct";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        return;
    }

    public void buttonB(View view) {
        String message = "Incorrect";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        return;
    }

    public void buttonC(View view) {
        String message = "Incorrect";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        return;
    }

    public void buttonD(View view) {
        String message = "Incorrect";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        return;
    }

}
