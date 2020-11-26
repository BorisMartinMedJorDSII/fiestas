package com.example.fiestas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ahmed.easyslider.EasySlider;
import ahmed.easyslider.SliderItem;

public class abril extends AppCompatActivity {

    EasySlider easySlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abril);

        easySlider = findViewById(R.id.sliderId);

        List<SliderItem> easySliders=new ArrayList<>();
        easySliders.add(new SliderItem("Semana Santa", R.drawable.semsant1));
        easySliders.add(new SliderItem("Semana Santa", R.drawable.semsant2));
        easySliders.add(new SliderItem("Semana Santa", R.drawable.semsant3));
        easySliders.add(new SliderItem("Semana Santa", R.drawable.semsant4));
        easySlider.setPages(easySliders);

    }
}