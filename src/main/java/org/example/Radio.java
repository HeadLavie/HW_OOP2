package org.example;

public class Radio {

    private int currentVolume;
    private int currentStation;
    private int numberOfStations = 10;
    private int lastStation = numberOfStations - 1;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        this.lastStation = numberOfStations - 1;
    }

    public Radio() {

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int numberOfStations() {
        return numberOfStations;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {

        if (newCurrentStation < 0) {
            return;
        }

        if (newCurrentStation > lastStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {

        if (currentStation == lastStation) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {

        if (currentStation == 0) {
            currentStation = lastStation;
        } else {
            currentStation = currentStation - 1;
        }
    }
}