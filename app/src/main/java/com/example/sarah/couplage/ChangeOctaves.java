package com.example.sarah.couplage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by sarah on 29/10/2015.
 */
public class ChangeOctaves extends Activity{

    ListView liste = null;
    ArrayAdapter<String> adapter = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_octave);
        liste = (ListView) findViewById(R.id.listView);

        String[] octaves = new String[] {
                "Une octave",
                "Deux octaves",
                "Trois octaves",
                "Quatre octaves",
                "Cinq octaves",
                "Six octaves",
                "Sept octaves"
        };

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_single_choice, octaves);
        liste.setAdapter(adapter);
        //Piano.setOctave(36);

        int nb_Octaves = Piano.getOctaves()/12;
        int i=1;
        while(i!= nb_Octaves){
            i++;
        }
        liste.setItemChecked(i-1, true);


        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //When the user clicks on an item, we apply its light settings by calling the applyLampsStates function
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Piano.setOctave(position*12 + 12);
                Intent intent = new Intent(ChangeOctaves.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
