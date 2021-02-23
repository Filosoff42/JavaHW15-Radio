package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int numberOfStations;
    private int currentStation;
    private int currentVolume;


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

