package com.engeto.lekce1.druhy.ukol;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EvidenceProdejcuRunner {


    public static void main(String[] args) {

        String jmenoAPrijmeni = "Petr Novák";

        LocalDate datumNarozeni = LocalDate.of(1973, 8, 18);

        int pocetSmluv = 6;

        BigDecimal mnozstviTunMrkve = BigDecimal.valueOf(2541);

        String mesto = "Ostrava";

        String SPZ = "9T4 6401";

        double spotrebaVozidla = 5.1;

        String IPv4 = "192.168.0.78";


        BigDecimal average = mnozstviTunMrkve.divide(BigDecimal.valueOf(pocetSmluv));

        System.out.println("1. Jméno a příjmení prodejce: " + jmenoAPrijmeni);
        System.out.println("2. Datum narození prodejce (RR-MM-DD): " + datumNarozeni);
        System.out.println("3. Počet dosud sjednaných smluv: " + pocetSmluv);
        System.out.println("4. Celkové množství prodané mrkve v tunách: " + mnozstviTunMrkve + " t");
        System.out.println("5. Město, kde prodejce sídlí: " + mesto);
        System.out.println("6. Registrační značka vozidla („SPZ“): " + SPZ);
        System.out.println("7. Spotřeba firemního vozidla v litrech na 100 km: " + spotrebaVozidla + " l/100 km");
        System.out.println("8. IP adresa verze 4 firemního počítače: " + IPv4);
        System.out.println();
        System.out.println("Průměr prodané mrkve na smlouvu je: " + average + " t");

    }
}
