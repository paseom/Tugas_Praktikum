abstract class TiketKonser implements HargaTiket {
    // Do your magic here...
    protected String jenis;
    protected double harga;

    // Konstruktor untuk membuat objek TiketKonser dengan jenis dan harga tertentu
    public TiketKonser(String jenis, double harga) {
        this.jenis = jenis;
        this.harga = harga;
    }

    // Implementasi metode dari interface HargaTiket untuk mendapatkan jenis tiket
    @Override
    public String getJenis() {
        return jenis;
    }

    // Implementasi metode dari interface HargaTiket untuk mendapatkan harga tiket
    @Override
    public double getHarga() {
        return harga;
    }
}
