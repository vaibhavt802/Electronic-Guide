package com.example.electronicguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CardView mResistor, mDiode, mZenerDiode, mCapacitor, mInductor, mLED, mSCR, mIC, mBattery, mTransistor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mResistor = (CardView)findViewById(R.id.resistor);
        mDiode = (CardView)findViewById(R.id.diode);
        mZenerDiode = (CardView)findViewById(R.id.zenerdiode);
        mCapacitor = (CardView)findViewById(R.id.capacitor);
        mInductor = (CardView)findViewById(R.id.inductor);
        mLED = (CardView)findViewById(R.id.led);
        mSCR = (CardView)findViewById(R.id.scr);
        mIC = (CardView)findViewById(R.id.ic);
        mBattery = (CardView)findViewById(R.id.battery);
        mTransistor = (CardView)findViewById(R.id.transistor);

        mResistor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ResistorActivity.class);
                startActivity(intent);
            }
        });

        mDiode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DiodeActivity.class);
                startActivity(intent);
            }
        });

        mZenerDiode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ZenerDiodeActivity.class);
                startActivity(intent);
            }
        });

        mCapacitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CapacitorActivity.class);
                startActivity(intent);
            }
        });

        mInductor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,InductorActivity.class);
                startActivity(intent);
            }
        });

        mLED.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LEDActivity.class);
                startActivity(intent);
            }
        });

        mSCR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SCRActivity.class);
                startActivity(intent);
            }
        });

        mIC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ICActivity.class);
                startActivity(intent);
            }
        });

        mBattery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BatteryActivity.class);
                startActivity(intent);
            }
        });

        mTransistor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TransistorActivity.class);
                startActivity(intent);
            }
        });
    }
}
