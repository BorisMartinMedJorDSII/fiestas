package com.example.fiestas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ahmed.easyslider.EasySlider;
import ahmed.easyslider.SliderItem;

public class noviembre extends AppCompatActivity {

    EasySlider easySlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noviembre);

        easySlider = findViewById(R.id.sliderId);

        List<SliderItem> easySliders=new ArrayList<>();
        easySliders.add(new SliderItem("Semana de todos los Santos", R.drawable.todossantos1));
        easySliders.add(new SliderItem("Semana de todos los Santos", R.drawable.todossantos2));
        easySliders.add(new SliderItem("Semana de todos los Santos", R.drawable.todossantos3));
        easySliders.add(new SliderItem("Semana de todos los Santos", R.drawable.todossantos4));
        easySlider.setPages(easySliders);
    }
}