/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

/**
 *
 * @author L E N O V O
 */
// Kelas untuk Dealer Mobil
public class Main {
    public static void main(String[] args) {
        MobilBaru mobilBaru = new MobilBaru("Toyota", "Avanza", "3 tahun");
        MobilBekas mobilBekas = new MobilBekas("Honda", "Civic", 2018, 200000000);
        Dealer dealer = new Dealer("Mobilindo", mobilBaru, mobilBekas);
        dealer.info();
    }

    private static class MobilBaru {

        public MobilBaru(String toyota, String avanza, String _tahun) {
        }
    }

    private static class Dealer {

        public Dealer(String mobilindo, MobilBaru mobilBaru, MobilBekas mobilBekas) {
        }

        private void info() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
    

