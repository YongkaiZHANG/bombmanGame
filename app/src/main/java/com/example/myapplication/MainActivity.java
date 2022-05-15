package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button moveRight;
    private Button moveLeft;
    private Button moveUp;
    private Button moveDown;
    private Button attackIt;
    private TextView score;
    private TextView enemy;
    private TextView HP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        moveDown=this.findViewById(R.id.down);
        moveDown.setOnClickListener(this);
        moveRight=this.findViewById(R.id.right);
        moveRight.setOnClickListener(this);
        moveUp=this.findViewById(R.id.up);
        moveUp.setOnClickListener(this);
        moveLeft=this.findViewById(R.id.left);
        moveLeft.setOnClickListener(this);
        attackIt=this.findViewById(R.id.attack);
        attackIt.setOnClickListener(this);
        score=this.findViewById(R.id.score);
        enemy=this.findViewById(R.id.enemy);
        HP=this.findViewById(R.id.HP);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }


    @Override
    protected void onResume() {
        super.onResume();
    }

    public void moveUp(View view) {
    }

    public void moveLeft(View view) {

    }

    public void moveRight(View view) {
    }

    public void moveDown(View view) {
    }

    public void attackIt(View view) {
    }

    @Override
    public void onClick(View view) {

    }
}