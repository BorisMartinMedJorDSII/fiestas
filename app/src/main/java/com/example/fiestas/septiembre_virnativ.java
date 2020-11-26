package com.example.fiestas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ahmed.easyslider.EasySlider;
import ahmed.easyslider.SliderItem;

public class septiembre_virnativ extends AppCompatActivity {

    EasySlider easySlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_septiembre_virnativ);

        easySlider = findViewById(R.id.sliderId);

        List<SliderItem> easySliders=new ArrayList<>();
        easySliders.add(new SliderItem("Virgen de la Natividad", R.drawable.virgennatividad1));
        easySliders.add(new SliderItem("Virgen de la Natividad", R.drawable.virgennatividad2));
        easySliders.add(new SliderItem("Virgen de la Natividad", R.drawable.virgennatividad3));
        easySliders.add(new SliderItem("Virgen de la Natividad", R.drawable.virgennatividad4));
        easySlider.setPages(easySliders);
    }
}