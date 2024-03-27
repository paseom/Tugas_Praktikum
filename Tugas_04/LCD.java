//package LCD;

public class LCD {
    // mendeklarasikan variabel
    private int volume;
    private int brightness;
    private String cable;
    private String status;

    // method untuk turnOff
    public void turnOff() {
        this.status = "Off";
    }

    // method untuk turnOn
    public void turnOn() {
        this.status = "On";
    }

    // method untuk freeze
    public void freeze() {
        this.status = "Freeze";
    }

    // method untuk volume
    public void setVolume(int volume) {
        this.volume = volume;
    }

    // untuk menambahkan volume
    public void volumeUp() {
        volume++;
    }

    // method untuk brightness
    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    // untuk menurunkan brightness
    public void brightnessDown() {
        brightness--;
    }

    // method untuk cable
    public void setCable(int nomor) {
        // array untuk menyimpan pilihan cable
        String[] cable = { "VGA", "DVI", "HDMI", "Dsiplay Port" };
        // untuk range nomor yang dapat dipilih di array
        if (0 <= nomor && nomor < cable.length) {
            this.cable = cable[nomor];
        }
    }

    // method untuk displayMessage
    public void displayMessage() {
        // menampilkan status lcd
        System.out.println("LCD Status: " + status);
        // menampilkan volume lcd
        System.out.println("Volume: " + volume);
        // menampilkan brightness lcd
        System.out.println("Brightness: " + brightness);
        // menentukan pilihan cable lcd
        System.out.println("Cable: " + cable);
    }

}