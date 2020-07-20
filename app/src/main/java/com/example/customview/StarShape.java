package com.example.customview;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.shapes.Shape;

public class StarShape extends Shape {

    private float xA = 400;
    private float yA = 200;
    private int r = 100; //五角星边长

    @Override
    public void draw(Canvas canvas, Paint paint) {
        Path path = new Path();
        float[] floats = fivePoints(xA, yA, r);
        for (int i = 0; i < floats.length - 1; i++) {
            path.lineTo(floats[i], floats[i += 1]);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(10);
        path.transform(matrix);
        paint.setColor(Color.YELLOW);
        canvas.drawPath(path, paint);
    }

    /**
     * @param xA 起始点位置A的x轴绝对位置
     * @param yA 起始点位置A的y轴绝对位置
     * @param rFive 五角星边的边长
     */
    public static float[] fivePoints(float xA, float yA, int rFive) {
        float xB = 0;
        float xC = 0;
        float xD = 0;
        float xE = 0;
        float yB = 0;
        float yC = 0;
        float yD = 0;
        float yE = 0;
        xD = (float) (xA - rFive * Math.sin(Math.toRadians(18)));
        xC = (float) (xA + rFive * Math.sin(Math.toRadians(18)));
        yD = yC = (float) (yA + Math.cos(Math.toRadians(18)) * rFive);
        yB = yE = (float) (yA + Math.sqrt(Math.pow((xC - xD), 2) - Math.pow((rFive / 2), 2)));
        xB = xA + (rFive / 2);
        xE = xA - (rFive / 2);
        float[] floats = new float[]{xA, yA,  xD, yD,xB, yB, xE, yE, xC, yC,xA, yA};
        return floats;
    }
}
