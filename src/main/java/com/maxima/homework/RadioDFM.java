package com.maxima.homework;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.List;

@Component("radioDFMBean")
public class RadioDFM implements Radio {

    private List<String> songs;

    public RadioDFM(@Value("#{'${RadioDFM.songs}'.split(',')}") List<String> songs) {
        this.songs = songs;
    }

    @Override
    public List<String> getTracks() {
        return songs;
    }
}
