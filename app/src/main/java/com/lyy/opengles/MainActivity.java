package com.lyy.opengles;

import android.graphics.Color;
import android.opengl.GLSurfaceView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private GLSurfaceView mGLSurfaceView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//      setContentView(R.layout.activity_main);
        setupViews();
    }
    private void setupViews() {
        mGLSurfaceView = new GLSurfaceView(this);
        setContentView(mGLSurfaceView);
        //设置版本
        mGLSurfaceView.setEGLContextClientVersion(3);
        GLSurfaceView.Renderer renderer = new ColorRenderer(Color.GRAY);
        //GLSurfaceView.Renderer renderer = new NativeColorRenderer(Color.GRAY);
        mGLSurfaceView.setRenderer(renderer);
    }
}