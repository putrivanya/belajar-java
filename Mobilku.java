package com.belajar.belajar;

public class Mobilku {
    String warna;
    int tahunProduksi;
    int nomorMesin;
    int nomorRangka;
    // Method mengisi variabel instance
    void isi ( String warna, int tahunProduksi, int nomorMesin, int nomorRangka) 
    {
      this.warna =warna;
      this.tahunProduksi = tahunProduksi;
      this.nomorMesin = nomorMesin;
      this.nomorRangka = nomorRangka;

    }
//    Method menampilkan isi variabel 
  String ambilWarna ()
  {
    return warna;
  }
  int ambilTahunProduksi ()
  {
    return tahunProduksi;
  }
  int ambilNomormesin ()
  {
    return nomorMesin;
  }
  int ambilNomorRangka()
  {
    return nomorRangka;
  }
  public static void main(String[] args) {
    Mobilku MobilNiaga = new Mobilku();
    // proses pemanggilan method non void
    MobilNiaga.isi("putih",2018,97486,8333);
    System.out.println("warna : " + MobilNiaga.ambilWarna());
    System.out.println("tahun produksi : " + MobilNiaga.ambilTahunProduksi());
    System.out.println("nomor mesin : " + MobilNiaga.nomorMesin);
    System.out.println("nomor rangka : " + MobilNiaga.ambilNomorRangka());
  }
}