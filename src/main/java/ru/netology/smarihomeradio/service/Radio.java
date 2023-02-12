package ru.netology.smarihomeradio.service;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation++;
        } else currentStation = 0;

    }

    public void previousStation() {
        if (currentStation > 0) {
            currentStation--;
        } else currentStation = 9;
    }

    public void nextVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        } else currentVolume = 10;
    }

    public void previousVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else currentVolume = 0;
    }


}
