package com.example.demospringboot.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Reguler") 
public class KirimanReguler extends Kiriman {
    
    private double biayaPerKg;

    // 1. Konstruktor tanpa argumen untuk JPA
    public KirimanReguler() {
        super();
    }
    
    public KirimanReguler(String nomorResi, String alamatPengirim, String alamatTujuan, double beratBarang, double biayaPerKg) {
        // Memanggil konstruktor Kiriman dengan 4 data utama
        super(nomorResi, alamatPengirim, alamatTujuan, beratBarang); 
        this.biayaPerKg = biayaPerKg;
    }

    @Override
    public double hitungBiaya() {
        return beratBarang * biayaPerKg;
    }

    public double getBiayaPerKg() {
        return biayaPerKg;
    }

    public void setBiayaPerKg(double biayaPerKg) {
        this.biayaPerKg = biayaPerKg;
    }
}
