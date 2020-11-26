package com.example.fiestas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ahmed.easyslider.EasySlider;
import ahmed.easyslider.SliderItem;

public class junio_corpus extends AppCompatActivity {

    EasySlider easySlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junio_corpus);

        easySlider = findViewById(R.id.sliderId);

        List<SliderItem> easySliders=new ArrayList<>();
        easySliders.add(new SliderItem("Corpus Christi", R.drawable.corpuschristi1));
        easySliders.add(new SliderItem("SCorpus Christi", R.drawable.corpuschristi2));
        easySliders.add(new SliderItem("Corpus Christi", R.drawable.corpuschristi3));
        easySliders.add(new SliderItem("Corpus Christi", R.drawable.corpuschristi4));
        easySlider.setPages(easySliders);
    }
}