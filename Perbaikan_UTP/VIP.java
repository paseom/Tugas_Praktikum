class VIP extends TiketKonser {
    // Do your magic here...
    // Konstruktor untuk membuat objek VIP dengan jenis "VIP" dan harga 250.0
    public VIP() {
        super("VIP", 250.0);
    }

    // Implementasi metode hitungTotalHarga untuk Festival
    @Override
    void display() {
        System.out.println("VIP");
    }
}