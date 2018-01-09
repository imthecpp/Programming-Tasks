package com.company;

import java.util.Random;

/**
 * Created by Dawid Kowalski on 10.11.2017.
 */
public class Draw {

    private int random;
    public int getRandom(){

        Random r = new Random(System.currentTimeMillis());
        return r.nextInt(3);

        //return random = (int)(Math.random() * 3);
    }
}
