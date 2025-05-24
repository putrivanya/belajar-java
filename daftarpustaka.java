package com.belajar;

import java.util.ArrayList;
import java.util.Scanner;

class Buku {
    String id;
    String judul;
    String penulis;
    boolean dipinjam;

    public Buku(String id, String judul, String penulis) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.dipinjam = false;
    }

    public void tampilkan() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        System.out.println("ID: " + id + " | Judul: " + judul + " | Penulis: " + penulis + " | Status: " + status);
    }
}

public class daftarpustaka {
    static ArrayList<Buku> daftarBuku = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void tambahBuku() {
        System.out.print("Masukkan ID Buku: ");
        String id = input.nextLine();
        System.out.print("Masukkan Judul Buku: ");
        String judul = input.nextLine();
        System.out.print("Masukkan Penulis: ");
        String penulis = input.nextLine();

        daftarBuku.add(new Buku(id, judul, penulis));
        System.out.println("Buku berhasil ditambahkan.");
    }

    public static void tampilkanBuku() {
        System.out.println("\nDaftar Buku:");
        for (Buku b : daftarBuku) {
            b.tampilkan();
        }
    }

    public static void pinjamBuku() {
        System.out.print("Masukkan ID buku yang ingin dipinjam: ");
        String id = input.nextLine();
        for (Buku b : daftarBuku) {
            if (b.id.equals(id)) {
                if (!b.dipinjam) {
                    b.dipinjam = true;
                    System.out.println("Buku berhasil dipinjam.");
                } else {
                    System.out.println("Buku sedang dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    public static void kembalikanBuku() {
        System.out.print("Masukkan ID buku yang ingin dikembalikan: ");
        String id = input.nextLine();
        for (Buku b : daftarBuku) {
            if (b.id.equals(id)) {
                if (b.dipinjam) {
                    b.dipinjam = false;
                    System.out.println("Buku berhasil dikembalikan.");
                } else {
                    System.out.println("Buku tidak sedang dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Menu Perpustakaan ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            String pilihan = input.nextLine();

            switch (pilihan) {
                case "1":
                    tambahBuku();
                    break;
                case "2":
                    tampilkanBuku();
                    break;
                case "3":
                    pinjamBuku();
                    break;
                case "4":
                    kembalikanBuku();
                    break;
                case "5":
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}