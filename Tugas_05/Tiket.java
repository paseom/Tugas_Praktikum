// Kelas abstrak untuk semua jenis tiket
abstract class Tiket {
    // Do your magic here
    private String jenis;
    private double harga;

    public Tiket(String jenis, double harga) {
        this.jenis = jenis;
        this.harga = harga;
    }

    public String getJenis() {
        return jenis;
    }

    public double getHarga() {
        return harga;
    }

    // Metode abstrak untuk menghitung harga total
    public abstract double hitungTotalHarga(int jumlah, String tahap);
}