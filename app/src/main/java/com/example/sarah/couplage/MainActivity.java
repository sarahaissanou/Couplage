package com.example.sarah.couplage;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

        private static final String DEBUG_TAG = "Piano_View";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            LinearLayout main = (LinearLayout)findViewById(R.id.main_content);
            Piano piano;
            piano = new Piano(this);
            piano.setPianoKeyListener(onPianoKeyPress);
            main.addView(piano);
        }

        private Piano.PianoKeyListener onPianoKeyPress =
                new Piano.PianoKeyListener() {

                    @Override
                    public void keyPressed(int id, int action) {
                        Log.i(DEBUG_TAG, "Key pressed: " + id);
                    }

                };


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            //If the user choses to click on the item "change the lamp's name" the ChangeName activity is launched
            case R.id.nb_octaves:
                Intent intent = new Intent(MainActivity.this, ChangeOctaves.class);
                startActivity(intent);
                //Piano.setOctave(36);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    }
