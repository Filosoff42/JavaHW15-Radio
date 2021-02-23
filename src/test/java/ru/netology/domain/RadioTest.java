package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio(10, 5, 0);

    @Test
    void shouldSetCurrentStationWithNumberIfTrue() {
        int newCurrentStation = 5;
        radio.setCurrentStationWithNumber(newCurrentStation);
        assertEquals(newCurrentStation, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationWithNumberIfAbove() {
        int newCurrentStation = radio.getNumberOfStations() + 1;
        radio.setCurrentStationWithNumber(newCurrentStation);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationWithNumberIfBelow() {
        int newCurrentStation = -1;
        radio.setCurrentStationWithNumber(newCurrentStation);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldNext() {
        radio.next();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void shouldPrev() {
        radio.prev();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldNextIfMax() {
        radio.setCurrentStationWithNumber(radio.getNumberOfStations());
        radio.next();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldPrevIf0() {
        radio.setCurrentStationWithNumber(0);
        radio.prev();
        assertEquals(radio.getNumberOfStations(), radio.getCurrentStation());
    }

    @Test
    void shouldButtonPlus() {
        Radio radio = new Radio(10, 5, 5);
        radio.buttonPlus();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void shouldButtonMinus() {
        Radio radio = new Radio(10, 5, 5);
        radio.buttonMinus();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void shouldButtonPlusIf100() {
        Radio radio = new Radio(10, 5, 100);
        radio.buttonPlus();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldButtonMinusIf0() {
        radio.buttonMinus();
        assertEquals(0, radio.getCurrentVolume());
    }

}