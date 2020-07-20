package com.example.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class StarShapeView extends View {

    public StarShapeView(Context context) {
        super(context);
    }

    public StarShapeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public StarShapeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        StarShape starShape = new StarShape();
        starShape.draw(canvas, new Paint());
    }
}
