package com.acer.tugaskelompokpwpb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.acer.tugaskelompokpwpb.bio.farhan.BioFarhanActivity;
import com.acer.tugaskelompokpwpb.bio.immanuel.BiodataActivity;
import com.acer.tugaskelompokpwpb.bio.rizki.BioRizkiActivity;

public class MainActivity extends AppCompatActivity {
    TextView gotoFarhan, gotoIman, gotoRizki, gotoLat2, gotoLat3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gotoFarhan = findViewById(R.id.gotoFarhan);
        gotoIman = findViewById(R.id.gotoIman);
        gotoRizki = findViewById(R.id.gotoRizki);
        gotoLat2 = findViewById(R.id.gotoLat2);
        gotoLat3 = findViewById(R.id.gotoLat3);

        gotoFarhan.setOnClickListener(new Listener());
        gotoIman.setOnClickListener(new Listener());
        gotoRizki.setOnClickListener(new Listener());
        gotoLat2.setOnClickListener(new Listener());
        gotoLat3.setOnClickListener(new Listener());
    }

    class Listener implements View.OnClickListener{
        Context context = com.acer.tugaskelompokpwpb.MainActivity.this;
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.gotoFarhan:
                    Intent intentF = new Intent(context, BioFarhanActivity.class);
                    startActivity(intentF);
                    break;
                case R.id.gotoIman:
                    Intent intentI = new Intent(context, BiodataActivity.class);
                    startActivity(intentI);
                    break;
                case R.id.gotoRizki:
                    Intent intentR = new Intent(context, BioRizkiActivity.class);
                    startActivity(intentR);
                    break;
                case R.id.gotoLat2:
                    Intent intentL2 = new Intent(context, Latihan2Activity.class);
                    startActivity(intentL2);
                    break;
                case R.id.gotoLat3:
                    Intent intentL3 = new Intent(context, Latihan3Activity.class);
                    startActivity(intentL3);
                    break;
            }
        }



    }

}
