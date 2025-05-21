package com.belajar.belajar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihan7 {
    public static void main(String[] args)throws IOException {
        String nama, alamat;
        Integer umur;
        //Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        //Membuat objek bufferedreader
        BufferedReader br = new BufferedReader(isr);
        //Mengisi variabel nama dengan BufferedReader
        System.out.print("Inputkan nama Anda : ");
        nama = br.readLine();
        System.out.print("Inputkan alamat Anda : ");
        alamat = br.readLine();
        System.out.print("Inputkan umur anda : ");
        umur = Integer.parseInt(br.readLine());
        //Tampilkan output isi variabel nama
        System.out.println("Nama anda adalah " + nama);
        System.out.println("alamat anda adalah " + alamat);
        System.out.println("umur anda adalah " + umur);

    }
}
        
    
    
