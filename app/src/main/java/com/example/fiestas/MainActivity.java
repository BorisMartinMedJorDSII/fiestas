package com.example.fiestas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = (VideoView) findViewById(R.id.videoView);

        Uri uri = Uri.parse("android.resource://"+ getPackageName() + "/" + R.raw.fiestasdelcusco);
        videoView.setMediaController((new MediaController(this)));
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }

    public void carnavales(View view) {
        Intent canav = new Intent(MainActivity.this, febrero.class);
        startActivity(canav);
    }

    public void semanasanta(View view) {
        Intent semsant = new Intent(MainActivity.this, abril.class);
        startActivity(semsant);
    }

    public void cruzvelacuy(View view) {
        Intent cruz = new Intent(MainActivity.this, mayo.class);
        startActivity(cruz);
    }

    public void qoyllority(View view) {
        Intent qoy = new Intent(MainActivity.this, junio_qoyllo.class);
        startActivity(qoy);
    }

    public void corpuschristi(View view) {
        Intent corpus = new Intent(MainActivity.this, junio_corpus.class);
        startActivity(corpus);
    }

    public void intiraymi(View view) {
        Intent inti = new Intent(MainActivity.this, junio_inti.class);
        startActivity(inti);
    }

    public void virgendelcarmen(View view) {
        Intent vcarmen = new Intent(MainActivity.this, julio.class);
        startActivity(vcarmen);
    }

    public void ofrendapachamama(View view) {
        Intent pacha = new Intent(MainActivity.this, agosto.class);
        startActivity(pacha);
    }

    public void virgennatividad(View view) {
        Intent vnativ = new Intent(MainActivity.this, septiembre_virnativ.class);
        startActivity(vnativ);
    }

    public void srhuanca(View view) {
        Intent srhu = new Intent(MainActivity.this, septiembre_srhuanca.class);
        startActivity(srhu);
    }

    public void todossantos(View view) {
        Intent todossan = new Intent(MainActivity.this, noviembre.class);
        startActivity(todossan);
    }

    public void santurantikuy(View view) {
        Intent santu = new Intent(MainActivity.this, diciembre.class);
        startActivity(santu);
    }
}