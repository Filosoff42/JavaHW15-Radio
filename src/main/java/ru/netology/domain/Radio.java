package ru.netology.domain;

public class Radio {
    private int numberOfStations;
    private int currentStation;
    private int currentVolume;

    public Radio(int numberOfStations, int currentStation, int currentVolume) {
        this.numberOfStations = numberOfStations;
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStationWithNumber(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > numberOfStations) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation == numberOfStations) {
            this.currentStation = 0;
        } else {
            this.currentStation += 1;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            this.currentStation = numberOfStations;
        } else {
            this.currentStation -= 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void buttonPlus() {
        if (currentVolume == 100) {
            return;
        }
        this.currentVolume += 1;
    }

    public void buttonMinus() {
        if (currentVolume == 0) {
            return;
        }
        this.currentVolume -= 1;
    }
}

