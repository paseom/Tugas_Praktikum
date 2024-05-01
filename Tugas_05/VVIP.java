// Kelas turunan untuk tiket VVIP
class VVIP extends Tiket {
    // Do your magic here
    public VVIP() {
        super("VVIP", 200);
    }

    public VVIP(double harga) {
        super("VVIP", harga);
    }

    // Implementasi metode hitungTotalHarga untuk VVIP
    @Override
    public double hitungTotalHarga(int jumlah, String tahap) {
        double hitungTotalHarga = getHarga() * jumlah;
        if (tahap.equalsIgnoreCase("Presale")) {
            hitungTotalHarga *= 0.8; // diskon 20% untuk presale
        }
        return hitungTotalHarga;
    }
}