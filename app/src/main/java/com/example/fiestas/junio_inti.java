package com.example.fiestas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ahmed.easyslider.EasySlider;
import ahmed.easyslider.SliderItem;

public class junio_inti extends AppCompatActivity {

    EasySlider easySlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junio_inti);

        easySlider = findViewById(R.id.sliderId);

        List<SliderItem> easySliders=new ArrayList<>();
        easySliders.add(new SliderItem("Inti Raymi", R.drawable.intiraymi01));
        easySliders.add(new SliderItem("Inti Raymi", R.drawable.intiraymi02));
        easySliders.add(new SliderItem("Inti Raymi", R.drawable.intiraymi03));
        easySliders.add(new SliderItem("Inti Raymi", R.drawable.intiraymi04));
        easySlider.setPages(easySliders);
    }
}