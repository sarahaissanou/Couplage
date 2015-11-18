package com.example.sarah.couplage;

/**
 * Created by sarah on 28/10/2015.
 */
import java.util.ArrayList;
public class Finger {


        private ArrayList<Key> keys = new ArrayList<Key>();

        public Boolean isPressing(Key key){
            return this.keys.contains(key);
        }

        public void press(Key key){

            if(this.isPressing(key)){
                return;
            }

            key.press(this);
            this.keys.add(key);
        }

        public void lift(){
            for(Key key : keys){
                key.depress(this);
            }
            keys.clear();
        }
}
