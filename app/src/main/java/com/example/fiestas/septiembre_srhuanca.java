package com.example.fiestas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ahmed.easyslider.EasySlider;
import ahmed.easyslider.SliderItem;

public class septiembre_srhuanca extends AppCompatActivity {

    EasySlider easySlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_septiembre_srhuanca);
        easySlider = findViewById(R.id.sliderId);

        List<SliderItem> easySliders=new ArrayList<>();
        easySliders.add(new SliderItem("Señor de Huanca", R.drawable.srhuanca1));
        easySliders.add(new SliderItem("Señor de Huanca", R.drawable.srhuanca2));
        easySliders.add(new SliderItem("Señor de Huanca", R.drawable.srhuanca3));
        easySliders.add(new SliderItem("Señor de Huanca", R.drawable.srhuanca4));
        easySlider.setPages(easySliders);
    }
}