package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStationWithNumber(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public void setCurrentStationWithButton(String stationButton) {
        if (stationButton == "next") {
            if (currentStation == 9) {
                this.currentStation = 0;
            } else
                this.currentStation += 1;
        }
        if (stationButton == "prev") {
            if (currentStation == 0) {
                this.currentStation = 9;
            } else
                this.currentStation -= 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentVolumeWithButton(String volumeButton) {
        if (volumeButton == "+") {
            if (currentVolume == 10) {
                return;
            }
            this.currentVolume += 1;
        }
        if (volumeButton == "-") {
            if (currentVolume == 0) {
                return;
            }
            this.currentVolume -= 1;
        }
    }
}
