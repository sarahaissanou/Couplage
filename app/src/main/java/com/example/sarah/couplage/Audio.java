package com.example.sarah.couplage;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by sarah on 04/11/2015.
 */
public class Audio {

    MediaPlayer mp;
    Context context;

    public Audio(Context ct){
        this.context = ct;
    }
    public void playClick() {
        mp = MediaPlayer.create(context, R.raw.goat);
        mp.start();
    }
}
