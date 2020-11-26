package com.example.fiestas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ahmed.easyslider.EasySlider;
import ahmed.easyslider.SliderItem;

public class diciembre extends AppCompatActivity {
    EasySlider easySlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diciembre);

        easySlider = findViewById(R.id.sliderId);

        List<SliderItem> easySliders=new ArrayList<>();
        easySliders.add(new SliderItem("Feria Santurantikuy", R.drawable.santurantikuy1));
        easySliders.add(new SliderItem("Feria Santurantikuy", R.drawable.santurantikuy2));
        easySliders.add(new SliderItem("Feria Santurantikuy", R.drawable.santurantikuy3));
        easySliders.add(new SliderItem("Feria Santurantikuy", R.drawable.santurantikuy4));
        easySlider.setPages(easySliders);
    }
}