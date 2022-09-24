package com.gabor.colorpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private TextView textViewColor;
    private FrameLayout frameLayout;
    private SeekBar seekBarRed;
    private SeekBar seekBarGreen;
    private SeekBar seekBarBlue;
    private TextView textViewRed;
    private TextView textViewGreen;
    private TextView textViewBlue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        final int[] color = new int[3];
        seekBarRed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                color[0] = i;
                textViewRed.setText("red: " + i);
                textViewColor.setBackgroundColor(Color.rgb(color[0], color[1], color[2]));
                textViewColor.setText("("+ color[0] + "," + color[1] + "," + color[2] + ")");
                textViewColor.setTextColor(Color.WHITE);

            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        seekBarGreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                color[1] = i;
                textViewGreen.setText("green: " + i);
                textViewColor.setBackgroundColor(Color.rgb(color[0], color[1], color[2]));
                textViewColor.setText("("+ color[0] + "," + color[1] + "," + color[2] + ")");
                textViewColor.setTextColor(Color.WHITE);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        seekBarBlue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                color[2] = i;
                textViewBlue.setText("blue: " + i);
                textViewColor.setBackgroundColor(Color.rgb(color[0], color[1], color[2]));
                textViewColor.setText("("+ color[0] + "," + color[1] + "," + color[2] + ")");
                textViewColor.setTextColor(Color.WHITE);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

    }

    private void init(){
        relativeLayout = findViewById(R.id.relativeLayout);
        textViewColor = findViewById(R.id.textViewColor);
        frameLayout = findViewById(R.id.frameLayout);
        seekBarGreen = findViewById(R.id.seekBarGreen);
        seekBarBlue = findViewById(R.id.seekBarBlue);
        seekBarRed = findViewById(R.id.seekBarRed);
        textViewBlue = findViewById(R.id.textViewBlue);
        textViewRed = findViewById(R.id.textViewRed);
        textViewGreen = findViewById(R.id.textViewGreen);

    }
}