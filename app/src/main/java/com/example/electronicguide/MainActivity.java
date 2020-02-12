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
    }
}
