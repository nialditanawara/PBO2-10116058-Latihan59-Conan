/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan59.conan;


public class PBO210116058Latihan59Conan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainCharacter conan = new MainCharacter("Investigator", "Menyelesaikan Kasus",
                 "Conan Edogawa", "Tokyo", true);
        MainCharacter ran = new MainCharacter("Karate", "Sama seperti Shinichi",
                "Ran Mouri", "Osaka", false);
        SupportCharacter eisuke = new SupportCharacter("Teman Sekelas Ran Mouri",
                 "Eisuke Hondo", "Osaka", false);
        conan.displayCharacter();
        ran.displayCharacter();
        eisuke.displayCharacter();
    }

}