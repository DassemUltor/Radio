package com.maxima.homework;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

@Component("radioLoveBean")
public class RadioLove implements Radio {

    private List<String> songs;

    public RadioLove(@Value("#{'${RadioLove.songs}'.split(',')}") List<String> songs) {
        this.songs = songs;
    }

    @Override
    public List<String> getTracks() {
        return songs;
    }
}