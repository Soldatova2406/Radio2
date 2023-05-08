import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio2.Radio;

public class RadioTest {
    @Test
    public void stationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        int actual = radio.getCurrentStation();
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationMinTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void station0Test() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.setCurrentStation(0);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        int actual = radio.getCurrentVolume();
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMinTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volume0Test() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setCurrentVolume(0);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationNextTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationNext9Test() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationPrevTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationPrev0Test() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeIncreaseTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 51;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeIncreaseMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDecreaseTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 49;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDecreaseMinTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationCountsTest() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(12);

        int actual = radio.getCurrentStation();
        int expected = 12;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationCountsNextTest() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(12);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 13;
        Assertions.assertEquals(expected, actual);
    }
}
