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

        station.setNumberOfRadioStations(11);
        int actual = station.getNumberOfRadioStations();

        Assertions.assertEquals(0, actual);

    }

    @Test
    public void showStationFromPackage2() {

        station.setNumberOfRadioStations(-4);
        int actual = station.getNumberOfRadioStations();

        Assertions.assertEquals(0, actual);

    }

    @Test
    public void showStationFromPackage3() {

        station.setNumberOfRadioStations(0);
        int actual = station.getNumberOfRadioStations();

        Assertions.assertEquals(0, actual);

    }


    @Test
    public void nextNumberStation() {

        station.setNumberOfRadioStations(0);
        station.nextNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void nextNumberStation1() {

        station.setNumberOfRadioStations(9);
        station.nextNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(10, actual);
    }

    @Test
    public void nextNumberStation2() {

        station.setNumberOfRadioStations(-4);
        station.nextNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void nextNumberStation3() {

        station.setNumberOfRadioStations(30);
        station.nextNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void nextNumberStation4() {
        Radio station = new Radio(0);

        station.setNumberOfRadioStations(1);
        station.nextNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void nextNumberStation5() {
        Radio station = new Radio(99);

        station.setNumberOfRadioStations(100);
        station.nextNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(1, actual);
    }


    @Test
    public void previousNumberStation() {

        station.setNumberOfRadioStations(1);
        station.previousNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void previousNumberStation1() {

        station.setNumberOfRadioStations(10);
        station.previousNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(9, actual);
    }

    @Test
    public void previousNumberStation2() {

        station.setNumberOfRadioStations(-5);
        station.previousNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(9, actual);
    }

    @Test
    public void previousNumberStation3() {

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





