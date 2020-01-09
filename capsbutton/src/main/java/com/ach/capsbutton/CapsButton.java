package com.ach.capsbutton;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;

public class CapsButton extends AppCompatButton {


    public CapsButton(Context context) {
        super(context);
    }

    public CapsButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }


    public CapsButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    private void init() {
        setTextColor(Color.RED);
    }
}
