package com.example.fiestas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ahmed.easyslider.EasySlider;
import ahmed.easyslider.SliderItem;

public class julio extends AppCompatActivity {
    EasySlider easySlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_julio);

        easySlider = findViewById(R.id.sliderId);

        List<SliderItem> easySliders=new ArrayList<>();
        easySliders.add(new SliderItem("Virgen del Carmen - Paucartambo", R.drawable.virgendelcarmen1));
        easySliders.add(new SliderItem("Virgen del Carmen - Paucartambo", R.drawable.virgendelcarmen2));
        easySliders.add(new SliderItem("Virgen del Carmen - Paucartambo", R.drawable.virgendelcarmen3));
        easySliders.add(new SliderItem("Virgen del Carmen - Paucartambo", R.drawable.virgendelcarmen4));
        easySlider.setPages(easySliders);
    }
}