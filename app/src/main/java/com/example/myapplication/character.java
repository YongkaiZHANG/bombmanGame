package com.example.myapplication;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;

public class character {
    public Bitmap Image;//the image of the character
    public Point  Pos_point;//the position of the character

    public character(Bitmap image, Point pos_point) {
        this.Image = image;
        this.Pos_point = pos_point;
    }
     public void drawIt(Canvas canvas){
        //to avoid the empty pointer
        if(Image!=null) {
            canvas.drawBitmap(Image, Pos_point.x, Pos_point.y, null);//to draw the character
        }
    }
}
