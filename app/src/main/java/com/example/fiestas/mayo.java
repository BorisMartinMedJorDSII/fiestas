package com.example.fiestas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ahmed.easyslider.EasySlider;
import ahmed.easyslider.SliderItem;

public class mayo extends AppCompatActivity {

    EasySlider easySlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mayo);

        easySlider = findViewById(R.id.sliderId);

        List<SliderItem> easySliders=new ArrayList<>();
        easySliders.add(new SliderItem("Cruz Velacuy", R.drawable.crxvela1));
        easySliders.add(new SliderItem("Cruz Velacuy", R.drawable.crxvela2));
        easySliders.add(new SliderItem("Cruz Velacuy", R.drawable.crxvela3));
        easySliders.add(new SliderItem("Cruz Velacuy", R.drawable.crxvela4));
        easySlider.setPages(easySliders);
    }
}