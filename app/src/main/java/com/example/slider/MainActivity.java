package com.example.slider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.slider.Slider;

public class MainActivity extends AppCompatActivity {

    TextView main_sliderVal;
    Slider main_slider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_slider = findViewById(R.id.main_slider);
        main_sliderVal = findViewById(R.id.main_sliderVal);

        main_slider.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(Slider slider, float value, boolean fromUser) {
                main_sliderVal.setText(Float.toString(value));
            }
        });
    }
}
