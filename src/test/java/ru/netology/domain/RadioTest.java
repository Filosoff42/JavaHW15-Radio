package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetCurrentStationWithNumberIfTrue() {
        Radio radio = new Radio();
        int newCurrentStation = 5;
        radio.setCurrentStationWithNumber(newCurrentStation);
        assertEquals(newCurrentStation, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationWithNumberIfAbove() {
        Radio radio = new Radio();
        int newCurrentStation = 10;
        radio.setCurrentStationWithNumber(5);
        radio.setCurrentStationWithNumber(newCurrentStation);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationWithNumberIfBelow() {
        Radio radio = new Radio();
        int newCurrentStation = -1;
        radio.setCurrentStationWithNumber(5);
        radio.setCurrentStationWithNumber(newCurrentStation);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationWithButtonIfNext() {
        Radio radio = new Radio();
        String stationButton = "next";
        radio.setCurrentStationWithNumber(5);
        radio.setCurrentStationWithButton(stationButton);
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationWithButtonIfPrev() {
        Radio radio = new Radio();
        String stationButton = "prev";
        radio.setCurrentStationWithNumber(5);
        radio.setCurrentStationWithButton(stationButton);
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationWithButtonIf9AndNext() {
        Radio radio = new Radio();
        String stationButton = "next";
        radio.setCurrentStationWithNumber(9);
        radio.setCurrentStationWithButton(stationButton);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationWithButtonIf0AndPrev() {
        Radio radio = new Radio();
        String stationButton = "prev";
        radio.setCurrentStationWithButton(stationButton);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void setCurrentVolumeIfTrue() {
        Radio radio = new Radio();
        int expected = 5;
        radio.setCurrentVolume(expected);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeIfAbove() {
        Radio radio = new Radio();
        int newCurrentVolume = 11;
        radio.setCurrentVolume(newCurrentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeIfBelow() {
        Radio radio = new Radio();
        int newCurrentVolume = -1;
        radio.setCurrentVolume(newCurrentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeWithButtonIfPlus() {
        Radio radio = new Radio();
        String volumeButton = "+";
        radio.setCurrentVolume(5);
        radio.setCurrentVolumeWithButton(volumeButton);
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeWithButtonIfMinus() {
        Radio radio = new Radio();
        String volumeButton = "-";
        radio.setCurrentVolume(5);
        radio.setCurrentVolumeWithButton(volumeButton);
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeWithButtonIfPlusAnd10() {
        Radio radio = new Radio();
        String volumeButton = "+";
        radio.setCurrentVolume(10);
        radio.setCurrentVolumeWithButton(volumeButton);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeWithButtonIfMinusAnd0() {
        Radio radio = new Radio();
        String volumeButton = "-";
        radio.setCurrentVolumeWithButton(volumeButton);
        assertEquals(0, radio.getCurrentVolume());
    }

}