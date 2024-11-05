package com.maxima.homework;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("radioMaximumBean")
public class RadioMaximum implements Radio {

    private List<String> songs;

    public RadioMaximum(@Value("#{'${RadioMaximum.songs}'.split(',')}") List<String> songs) {
        this.songs = songs;
    }

    @Override
    public List<String> getTracks() {
        return songs;
    }
}

