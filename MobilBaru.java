/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author L E N O V O
 */
// Kelas Anak untuk Mobil Baru
class MobilBaru extends Mobil {
    private final String garansi;

    public MobilBaru(String merek, String model, String garansi) {
        super(merek, model);
        this.garansi = garansi;
    }

    public String getGaransi() {
        return garansi;
    }

    public void info() {
        System.out.println("Mobil Baru: " + getMerek() + " " + getModel() + " (Garansi: " + garansi + ")");
    }

    public String getModel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getMerek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

