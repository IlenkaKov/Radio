
package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void test() {          // текущая радиостанция
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void onMinStation() {   // включение станции ниже минмальной
        Radio radio = new Radio();
        radio.setCurrentStation(-1);


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void onMaxStation() {   // включение станции выше максимальной
        Radio radio = new Radio();
        radio.setCurrentStation(10);


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation0on1() {   // переключение с 0 станции на 1
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation8on9() {   // переключение с 8 на 9
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation9on0() {   // переключение с 9 на 0
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxStationOn() {   // максимальная станция
        Radio radio = new Radio(11);
        radio.setCurrentStation(9);


        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void MinStationOn() {   // минимальная станция
        Radio radio = new Radio(-2);
        radio.setCurrentStation(4);


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testVolume() {          // текущая громкость
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume0on1() {   // переключение с 0 на 1
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolume100() {   // увеличение звука если стоит 100
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolume99on100() {   // увеличение звука c 99 на 100
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {   // уменьшение звука если стоит 0
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume1on0() {   // уменьшение с 1 на 0
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume100on99() {   // уменьшение со 100 на 99
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeAbove100() {   // выставление звука выше 100
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeBelowMin() {   // выставление звука ниже максимального
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void prevStation9on8() { //переключение с 9 на 8
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation1on0() { //переключение с 1 на 0
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation0on9() { //переключение с 0 на 9
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

}



