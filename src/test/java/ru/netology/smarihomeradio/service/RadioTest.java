package ru.netology.smarihomeradio.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/currentStationNumber.csv")
    public void radioStation(int current, int expected) {
        Radio station = new Radio();
        station.setCurrentStation(current);
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/currentVolumeNumber.csv")
    public void radioVolume(int current, int expected) {
        Radio volume = new Radio();
        volume.setCurrentVolume(current);
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/radioNextNumber.csv")
    public void nextRadioStation(int current, int expected) {
        Radio station = new Radio();
        station.setCurrentStation(current);
        station.nextStation();
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/radioPreviousNumber.csv")
    public void previousRadioStation(int current, int expected) {
        Radio station = new Radio();
        station.setCurrentStation(current);
        station.previousStation();
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/nextVolume.csv")
    public void nextRadioVolume(int current, int expected) {
        Radio volume = new Radio();
        volume.setCurrentVolume(current);
        volume.nextVolume();
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/previousVolume.csv")
    public void previousRadioVolume(int current, int expected) {
        Radio volume = new Radio();
        volume.setCurrentVolume(current);
        volume.previousVolume();
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}





