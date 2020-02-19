package com.example.electronicguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class ResistorActivity extends AppCompatActivity {
    private CardView mfourband;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resistor);
        mfourband = (CardView)findViewById(R.id.fourband);
        mfourband.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResistorActivity.this, FourBResistorActivity.class);
                startActivity(intent);
            }
        });
    }
}
