class VVIP extends TiketKonser {
  // Do your magic here...
  // Konstruktor untuk membuat objek VVIP dengan jenis "UNLIMITED EXPERIENCE" dan
  // harga 30.0
  public VVIP() {
    super("UNLIMITED EXPERIENCE", 300.0);
  }

  // Implementasi metode hitungTotalHarga untuk Festival
  @Override
  void display() {
    System.out.println("UNLIMITED EXPERIENCE");
  }
}