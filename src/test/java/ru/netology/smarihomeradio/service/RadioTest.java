package ru.netology.smarihomeradio.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    Radio station = new Radio();
    Radio volume = new Radio();

    @Test
    public void nextNumberStation() {
        Radio station = new Radio(10);
        station.setNumberOfRadioStations(0);
        station.nextNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void nextNumberStation1() {
        Radio station = new Radio(10);
        station.setNumberOfRadioStations(10);
        station.nextNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void nextNumberStation2() {
        Radio station = new Radio(10);
        station.setNumberOfRadioStations(-4);
        station.nextNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void nextNumberStation3() {
        Radio station = new Radio(10);
        station.setNumberOfRadioStations(30);
        station.nextNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void previousNumberStation() {
        Radio station = new Radio(10);
        station.setNumberOfRadioStations(1);
        station.previousNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void previousNumberStation1() {
        Radio station = new Radio(10);
        station.setNumberOfRadioStations(10);
        station.previousNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(9, actual);
    }

    @Test
    public void previousNumberStation2() {
        Radio station = new Radio(10);
        station.setNumberOfRadioStations(-4);
        station.previousNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(9, actual);
    }

    @Test
    public void previousNumberStation3() {
        Radio station = new Radio(10);
        station.setNumberOfRadioStations(0);
        station.previousNumberStation();
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(10, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numberRadio")
    public void numberStation(int current, int expected) {

        station.setNumberOfRadioStations(current);
        int actual = station.getNumberOfRadioStations();
        Assertions.assertEquals(expected, actual);
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
        Radio volume = new Radio();
        volume.setCurrentVolume(current);
        volume.previousVolume();
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}





