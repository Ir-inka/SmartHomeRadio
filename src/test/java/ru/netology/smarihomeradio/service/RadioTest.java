package ru.netology.smarihomeradio.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    Radio station = new Radio();
    Radio volume = new Radio();

    @Test
    public void showStationFromPackage() {
        Radio station = new Radio(20);

        station.setNumberOfRadioStations(15);
        int actual = station.getNumberOfRadioStations();

        Assertions.assertEquals(15, actual);

    }

    @Test
    public void showStationFromPackage1() {

        station.setNumberOfRadioStations(9);
        int actual = station.getNumberOfRadioStations();

        Assertions.assertEquals(9, actual);

    }

    @Test
    public void showStationFromPackage2() {

        station.setNumberOfRadioStations(0);
        int actual = station.getNumberOfRadioStations();

        Assertions.assertEquals(0, actual);

    }


    @Test
    public void nextNumberStationBorderMin() {

        station.setNumberOfRadioStations(-5);
        station.nextNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void nextNumberStationBorderMax() {

        station.setNumberOfRadioStations(9);
        station.nextNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(0, actual);
    }
    @Test
    public void nextNumberStationBorder() {

        station.setNumberOfRadioStations(25);
        station.nextNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void nextNumberStationBorderMiddle() {

        station.setNumberOfRadioStations(5);
        station.nextNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(6, actual);
    }

    @Test
    public void nextNumberStationZero() {

        station.setNumberOfRadioStations(0);
        station.nextNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(1, actual);
    }


    @Test
    public void previousNumberStationBorderMin() {

        station.setNumberOfRadioStations(-5);
        station.previousNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(9, actual);
    }

    @Test
    public void previousNumberStationBorderMax() {

        station.setNumberOfRadioStations(100);
        station.previousNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(9, actual);
    }

    @Test
    public void previousNumberStationBorderMiddle() {

        station.setNumberOfRadioStations(5);
        station.previousNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(4, actual);
    }

    @Test
    public void previousNumberStationZero() {

        station.setNumberOfRadioStations(0);
        station.previousNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(9, actual);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/currentStationNumber.csv")
    public void radioStation(int current, int expected) {

        station.setCurrentStation(current);
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/currentVolumeNumber.csv")
    public void radioVolume(int current, int expected) {

        volume.setCurrentVolume(current);
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/radioNextNumber.csv")
    public void nextRadioStation(int current, int expected) {

        station.setCurrentStation(current);
        station.nextStation();
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/radioPreviousNumber.csv")
    public void previousRadioStation(int current, int expected) {

        station.setCurrentStation(current);
        station.previousStation();
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/nextVolume.csv")
    public void nextRadioVolume(int current, int expected) {

        volume.setCurrentVolume(current);
        volume.nextVolume();
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/previousVolume.csv")
    public void previousRadioVolume(int current, int expected) {

        volume.setCurrentVolume(current);
        volume.previousVolume();
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}





