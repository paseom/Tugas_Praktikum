//package LCD;

public class MainLCD {
    public static void main(String[] args) {

        LCD lcd = new LCD();
        lcd.turnOff();
        lcd.turnOn();
        lcd.freeze();
        lcd.setVolume(50);
        lcd.volumeUp();
        lcd.setBrightness(39);
        lcd.brightnessDown();
        lcd.setCable(2);

        lcd.displayMessage();
    }
}
