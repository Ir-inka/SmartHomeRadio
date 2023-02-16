package ru.netology.smarihomeradio.service;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Radio {
    private int maxCurrentStation = 9;
    private int minCurrentStation = 0;
    private int maxCurrentVolume = 100;
    private int minCurrentVolume = 0;
    private int maxNumberOfRadioStations = 10;
    private int minNumberOfRadioStations = 0;
    private int currentStation = minCurrentStation;
    private int currentVolume = minCurrentVolume;
    private int numberOfRadioStations = maxNumberOfRadioStations;


    public Radio(int numberOfRadioStations, int maxNumberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
        this.maxNumberOfRadioStations = maxNumberOfRadioStations;
    }


    public void nextNumberStation() {
        if (numberOfRadioStations < maxNumberOfRadioStations) {
            numberOfRadioStations++;
        } else {
            numberOfRadioStations = minNumberOfRadioStations;
        }
    }

    public void previousNumberStation() {
        if (numberOfRadioStations > minNumberOfRadioStations) {
            numberOfRadioStations--;
        } else {
            numberOfRadioStations = maxNumberOfRadioStations;
        }
    }

    public void nextStation() {
        if (currentStation < maxCurrentStation) {
            currentStation++;
        } else {
            currentStation = maxCurrentStation;
        }

    }

    public void previousStation() {
        if (currentStation > minCurrentStation) {
            currentStation--;
        } else {
            currentStation = minCurrentStation;
        }
    }

    public void nextVolume() {
        if (currentVolume < maxCurrentVolume) {
            currentVolume++;
        } else {
            currentVolume = maxCurrentVolume;
        }
    }

    public void previousVolume() {
        if (currentVolume > minCurrentVolume) {
            currentVolume--;
        } else {
            currentVolume = minCurrentVolume;
        }
    }


}
