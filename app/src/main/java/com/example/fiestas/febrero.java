package com.example.fiestas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ahmed.easyslider.EasySlider;
import ahmed.easyslider.SliderItem;

public class febrero extends AppCompatActivity {

    EasySlider easySlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_febrero);

        easySlider = findViewById(R.id.sliderId);

        List<SliderItem> easySliders=new ArrayList<>();
        easySliders.add(new SliderItem("Carnavales en Cusco", R.drawable.carnav1));
        easySliders.add(new SliderItem("Carnavales en Cusco", R.drawable.carnav2));
        easySliders.add(new SliderItem("Carnavales en Cusco", R.drawable.carnav3));
        easySliders.add(new SliderItem("Carnavales en Cusco", R.drawable.carnav4));
        easySlider.setPages(easySliders);
    }
}