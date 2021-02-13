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
    void shouldNext() {
        Radio radio = new Radio();
        radio.setCurrentStationWithNumber(5);
        radio.next();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void shouldPrev() {
        Radio radio = new Radio();
        radio.setCurrentStationWithNumber(5);
        radio.prev();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldNextIf9() {
        Radio radio = new Radio();
        radio.setCurrentStationWithNumber(9);
        radio.next();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldPrevIf0() {
        Radio radio = new Radio();
        radio.prev();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentVolumeIfTrue() {
        Radio radio = new Radio();
        int expected = 5;
        radio.setCurrentVolume(expected);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldSetCurrentVolumeIfAbove() {
        Radio radio = new Radio();
        int newCurrentVolume = 11;
        radio.setCurrentVolume(newCurrentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldSetCurrentVolumeIfBelow() {
        Radio radio = new Radio();
        int newCurrentVolume = -1;
        radio.setCurrentVolume(newCurrentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldButtonPlus() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.buttonPlus();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void shouldButtonMinus() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.buttonMinus();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void shouldButtonPlusIf10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.buttonPlus();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldButtonMinusIf0() {
        Radio radio = new Radio();
        radio.buttonMinus();
        assertEquals(0, radio.getCurrentVolume());
    }

}