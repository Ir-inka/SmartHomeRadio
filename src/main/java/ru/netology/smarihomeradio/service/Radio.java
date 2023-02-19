package ru.netology.smarihomeradio.service;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxCurrentStation = 9;
    private int minCurrentStation = 0;
    private int maxCurrentVolume = 100;
    private int minCurrentVolume = 0;


    public Radio() {
    }

    public Radio(int maxNumber) {
        this.maxCurrentStation = maxNumber - 1;


    }

    public int getNumberOfRadioStations() {
        return currentStation;
    }

    public void setNumberOfRadioStations(int newNumberOfRadioStations) {
        if (newNumberOfRadioStations > maxCurrentStation) {
            return;
        }
        if (newNumberOfRadioStations < minCurrentStation) {
            return;
        }
        currentStation = newNumberOfRadioStations;

    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxCurrentStation) {
            return;
        }
        if (newCurrentStation < minCurrentStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxCurrentVolume) {
            return;
        }
        if (newCurrentVolume < minCurrentVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextNumberStation() {
        if (currentStation < maxCurrentStation) {
            currentStation++;
        } else {
            currentStation = minCurrentStation;
        }
    }

    public void previousNumberStation() {
        if (currentStation > minCurrentStation) {
            currentStation--;
        } else {
            currentStation = maxCurrentStation;
        }
    }

    public void nextStation() {
        if (currentStation < maxCurrentStation) {
            currentStation++;
        } else {
            currentStation = minCurrentStation;
        }

    }


    public void previousStation() {
        if (currentStation > minCurrentStation) {
            currentStation--;
        } else {
            currentStation = maxCurrentStation;
        }
    }

    public void nextVolume() {
        if (currentVolume < maxCurrentVolume) {
            currentVolume++;
        } else {
            currentVolume = minCurrentVolume;
        }
    }

    public void previousVolume() {
        if (currentVolume > minCurrentVolume) {
            currentVolume--;
        } else {
            currentVolume = maxCurrentVolume;
        }
    }


}