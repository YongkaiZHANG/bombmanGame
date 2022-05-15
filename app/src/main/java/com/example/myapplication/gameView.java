package com.example.myapplication;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.Button;
import android.widget.GridLayout;

import androidx.annotation.NonNull;

public class gameView extends SurfaceView implements SurfaceHolder.Callback {

    private boolean flag;// to control the thread open or close
    public gameView(Context context) {
        super(context);
       SurfaceHolder holder= getHolder();//get the component of surfaceview holder
        holder.addCallback(this);//add callback to get the api of lifetime of the surfaceview
    }

    public gameView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public gameView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public gameView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    //create surfaceview
    @Override
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
        //to start the new thread
        flag=true;
        toThread toThread= new toThread();
        toThread.start();

    }
//change surfaceview
    @Override
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {
     this.drawView();
    }
//end the surfaceview
    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
        flag=false;
    }

     class toThread extends Thread{
        @Override
        public  void run() {
            System.out.println("hudckj");
            //to draw the view make sure it is always changeable
         while (flag) {
             drawView();
         }
        }
    }
    void  drawView(){
         Canvas canvas= getHolder().lockCanvas();
         if(canvas!=null) {
            // Paint paint = new Paint();
//             paint.setColor(Color.GREEN);
//             canvas.drawRect(80, 8, 648, 300, paint);
             player player=new player(BitmapFactory.decodeResource(getResources(),R.drawable.bombman)
             ,new Point(500,500));
             player.drawIt(canvas);
             System.out.println("hudckj");
             getHolder().unlockCanvasAndPost(canvas);
         }
    }

    }
