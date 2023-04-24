package com.example.bt_android1_lab3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class GraphicsView extends View {

    public GraphicsView(Context context){
        super(context);
    }

    protected void onDraw(Canvas canvas){
        // Drawing command go here
        Rect r = new Rect(120, 120, 1200, 600);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        canvas.drawRect(r, paint);

        invalidate();
    }


}

