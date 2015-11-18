package com.example.sarah.couplage;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Cette activité contient principalement le menu du jeu à son démarrage.
 * Ici l'utilisateur devra choisoir son jeu: Piano, batterie ou Karaoké.
 */
public class StartingActivity extends Activity {
    TextView text = null;
    Button piano = null;
    Button batterie = null;
    Button karaoke = null;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starting);

        text = (TextView)findViewById(R.id.text);
        text.setText(R.string.game_text);

        piano = (Button)findViewById(R.id.piano);
        piano.setOnClickListener(pianoListener);

        batterie = (Button)findViewById(R.id.batterie);
        batterie.setOnClickListener(batterieListener);

        karaoke = (Button)findViewById(R.id.karaoke);
        karaoke.setOnClickListener(karaokeListener);
    }

    private View.OnClickListener pianoListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(StartingActivity.this, (MainActivity.class));
            startActivity(intent);
        }
    };

    private View.OnClickListener batterieListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //By pressing the cancel button the ChangeName activity is closed.
            Toast.makeText(StartingActivity.this, "You want to play battery", Toast.LENGTH_SHORT).show();
            //StartingActivity.this.finish();
        }
    };

    private View.OnClickListener karaokeListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //By pressing the cancel button the ChangeName activity is closed.
            Toast.makeText(StartingActivity.this, "You want to play Karaoke", Toast.LENGTH_SHORT).show();
            //MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.sound1);
            //mp.start();
        }
    };
}
