// Kelas turunan untuk tiket Festival
class Festival extends Tiket {
    // Do your magic here
    public Festival() {
        super("Festival", 100);
    }

    // Implementasi metode hitungTotalHarga untuk Festival
    @Override
    public double hitungTotalHarga(int jumlah, String tahap) {
        return getHarga() * jumlah;
    }
}