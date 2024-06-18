package ru.netology.Radio;
public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int minStstion;

    public Radio() {
        this.maxStation = 9;
        this.minStstion=0;

    }

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;

    }

    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
            return;
        }
        currentStation = minStstion;
    }

    public void prevStation() {
        if (currentStation != minStstion) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }

    public void increaseVolume() { // увеличение громкости
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() { //уменьшение громкости
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}