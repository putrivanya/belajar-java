package com.belajar.belajar;
// latihan void method
public class mobil {
 String warna;
int tahunProduksi;
int nomorMesin;
int nomorRangka;
public static void main(String[] args) {
     mobil mobilNiaga = new mobil();
    //  pemangggilan method void 
    mobilNiaga.isi();
    mobilNiaga.tampil();

}
// megisi variabel instance
void isi(){
    warna = "hitam";
    tahunProduksi = 1929;
    nomorMesin = 64532;
    nomorRangka = 90182;
    
}

// menampilkan isi variabel

void tampil(){

System.out.println("--- warna = " + warna);
System.out.println("--- tahun produksi = " + tahunProduksi);
System.out.println("--- nomor mesin = " + nomorMesin);
System.out.println("--- nomor rangka = " + nomorRangka);

}
}