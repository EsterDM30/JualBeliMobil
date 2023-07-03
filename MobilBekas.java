/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

/**
 *
 * @author L E N O V O
 */
public class MobilBekas {

    MobilBekas(String honda, String civic, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class Mobil {

        public Mobil() {
        }
    }

// Kelas Anak untuk Mobil Baru
class MobilBaru extends Mobil {
    private String garansi;

    public MobilBaru(String merek, String model, String garansi) {
        
        this.garansi = garansi;
    }

    public String getGaransi() {
        return garansi;
    }

    public void info() {
        System.out.println("Mobil Baru: " + getMerek() + " " + getModel() + " (Garansi: " + garansi + ")");
    }

        private String getMerek() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String getModel() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
