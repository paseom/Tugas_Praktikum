class FESTIVAL extends TiketKonser {
  // Do your magic here...
  // Konstruktor untuk membuat objek FESTIVAL dengan jenis "FESTIVAL" dan harga
  // 200.0
  public FESTIVAL() {
    super("FESTIVAL", 200.0);
  }

  // Implementasi metode hitungTotalHarga untuk Festival
  @Override
  void display() {
    System.out.println("Festival");
  }
}