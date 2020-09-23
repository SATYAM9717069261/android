package com.example.music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mSoundPool=new SoundPool(7, AudioManager.STREAM_MUSIC,0);
        mCSoundId = mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        mDSoundId = mSoundPool.load(getApplicationContext(),R.raw.note2_d,1);
        mESoundId = mSoundPool.load(getApplicationContext(),R.raw.note3_e,1);
        mFSoundId = mSoundPool.load(getApplicationContext(),R.raw.note4_f,1);
        mGSoundId = mSoundPool.load(getApplicationContext(),R.raw.note5_g,1);
        mASoundId = mSoundPool.load(getApplicationContext(),R.raw.note6_a,1);
        mBSoundId = mSoundPool.load(getApplicationContext(),R.raw.note7_b,1);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void Node1(View v){
        mSoundPool.play(mCSoundId,LEFT_VOLUME,RIGHT_VOLUME,NO_LOOP,PRIORITY,NORMAL_PLAY_RATE);
    }
    public  void Node2(View v){
        mSoundPool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLUME,NO_LOOP,PRIORITY,NORMAL_PLAY_RATE);
    }
    public  void Node3(View v){
        mSoundPool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME,NO_LOOP,PRIORITY,NORMAL_PLAY_RATE);
    }
    public  void Node4(View v){
        mSoundPool.play(mFSoundId,LEFT_VOLUME,RIGHT_VOLUME,NO_LOOP,PRIORITY,NORMAL_PLAY_RATE);
    }
    public  void Node5(View v){
        mSoundPool.play(mGSoundId,LEFT_VOLUME,RIGHT_VOLUME,NO_LOOP,PRIORITY,NORMAL_PLAY_RATE);
    }
    public  void Node6(View v){
        mSoundPool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLUME,NO_LOOP,PRIORITY,NORMAL_PLAY_RATE);
    }
    public  void Node7(View v){
        mSoundPool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME,NO_LOOP,PRIORITY,NORMAL_PLAY_RATE);
    }
}