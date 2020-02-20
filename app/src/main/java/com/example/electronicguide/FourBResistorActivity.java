package com.example.electronicguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import java.util.ArrayList;

public class FourBResistorActivity extends AppCompatActivity {

    private ArrayList<ColorSpinnerItem> colotList;
    private ColorSpinnerAdapter adapter;
    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_bresistor);

        initList();

        spinner1=findViewById(R.id.colorspinner1);
        adapter=new ColorSpinnerAdapter(this,colotList);
        spinner1.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ColorSpinnerItem clickedItem = (ColorSpinnerItem) adapterView.getItemAtPosition(i);
                String clickedColorName = clickedItem.getColorName();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void initList(){

        colotList=new ArrayList<>();
        colotList.add(new ColorSpinnerItem("Red",R.drawable.redcircle));
        colotList.add(new ColorSpinnerItem("Green",R.drawable.greencolor));
        colotList.add(new ColorSpinnerItem("Blue",R.drawable.bluecolor));
        colotList.add(new ColorSpinnerItem("Black",R.drawable.blackcolor));




    }
}
