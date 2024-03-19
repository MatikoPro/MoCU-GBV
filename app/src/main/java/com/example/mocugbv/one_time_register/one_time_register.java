package com.example.mocugbv.one_time_register;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import com.example.mocugbv.R;

public class one_time_register extends AppCompatActivity {


    private RadioButton englishRadioButton;
    private RadioButton kiswahiliRadioButton;

    private Button continuentb;

    @SuppressLint("WrongViewCast")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_time_register);



            // Find radio buttons and continue button by their ids
            englishRadioButton = findViewById(R.id.selected_english_langiage);
            kiswahiliRadioButton = findViewById(R.id.selected_kiswahili_language);
            continuentb = findViewById(R.id.Continuebtn);



            // Set up listeners for radio buttons
            englishRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        // English radio button is checked
                        kiswahiliRadioButton.setChecked(false);

                    }
                }
            });

            kiswahiliRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        // see if Kiswahili radio button is checked if checked the English button deselected
                        englishRadioButton.setChecked(false);
                    }
                }
            });
        }

    }

