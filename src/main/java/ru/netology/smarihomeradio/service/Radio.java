package ru.netology.smarihomeradio.service;

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

    public Radio() {
    }

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;

    }

    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

    public void setNumberOfRadioStations(int newNumberOfRadioStations) {
        if (newNumberOfRadioStations > maxNumberOfRadioStations) {
            return;
        }
        if (newNumberOfRadioStations < minNumberOfRadioStations) {
            return;
        }
        numberOfRadioStations = newNumberOfRadioStations;

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
