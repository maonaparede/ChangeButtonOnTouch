package com.example.onbutton;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class OnButton extends androidx.appcompat.widget.AppCompatButton implements View.OnTouchListener {


    /** Core Items*/
    private Context mContext;
    private AttributeSet attrs;
    private int styleAttr;
    private Button button;


    private Drawable newBackground;
    private Drawable defaultBackground;
    private CharSequence text = "Button";
    private int newTextColor;
    private int defaultTextColor;


    public OnButton(@NonNull Context context) {
        super(context);

        this.mContext=context;

        init();
    }

    public OnButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        this.mContext=context;
        this.attrs=attrs;

        init();
    }

    public OnButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        this.mContext=context;
        this.attrs=attrs;
        this.styleAttr=defStyleAttr;

        init();
    }



    @SuppressLint("ClickableViewAccessibility")
    private void init() {
        this.button = this;

        TypedArray arr = mContext.obtainStyledAttributes(attrs, R.styleable.OnButton, styleAttr, 0);

        defaultBackground = button.getBackground();
        defaultTextColor = button.getCurrentTextColor();

        newBackground = arr.getDrawable(R.styleable.OnButton_onTouch_background);
        newTextColor = arr.getColor( R.styleable.OnButton_onTouch_text_color , defaultTextColor);
        text = arr.getText(R.styleable.OnButton_android_text);





        if (newBackground != null) {
            button.setOnTouchListener(this);
        }
    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {

        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            v.setBackground(newBackground);
            button.setTextColor(newTextColor);
            return true;
        } else if (event.getAction() == MotionEvent.ACTION_UP) {
            v.setBackground(defaultBackground);
            button.setTextColor(defaultTextColor);
        }
        return false;
    }
}
