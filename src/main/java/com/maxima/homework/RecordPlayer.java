package com.maxima.homework;

import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Random;


@Component
public class RecordPlayer {

    private List<Radio> list;
    private Random rand;

    public RecordPlayer(List<Radio> list) {
        this.list = list;
        this.rand = new Random();
    }

    public void powerPlayer() {
        for (Radio radio : list) {
            List<String> tracks = radio.getTracks();
            String track = tracks.get(rand.nextInt(tracks.size()));
            System.out.println("Playing: " + radio.getClass().getSimpleName() + " : " + track);
        }
    }
}
