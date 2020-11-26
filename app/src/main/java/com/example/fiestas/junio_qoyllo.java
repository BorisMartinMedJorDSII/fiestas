package com.example.fiestas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ahmed.easyslider.EasySlider;
import ahmed.easyslider.SliderItem;

public class junio_qoyllo extends AppCompatActivity {

    EasySlider easySlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junio_qoyllo);

        easySlider = findViewById(R.id.sliderId);

        List<SliderItem> easySliders=new ArrayList<>();
        easySliders.add(new SliderItem("Señor de Qoyllority", R.drawable.qoyllority1));
        easySliders.add(new SliderItem("Señor de Qoyllority", R.drawable.qoyllority2));
        easySliders.add(new SliderItem("Señor de Qoyllority", R.drawable.qoyllority3));
        easySliders.add(new SliderItem("Señor de Qoyllority", R.drawable.qoyllority4));
        easySlider.setPages(easySliders);
    }
}