package Bakery;

import javax.swing.*;

public class Menu {
    public double mbaguette, mwheat_bread, mbagel, mbanana_bread, menglish_muffin;
    public double mcroissant, mmile_feuille, mbizcocho, mcannoli, mpecan_pie;
    public double bread, pastries, jmlh;

    public double Jumlah(){
        bread = mbaguette + mwheat_bread + mbagel + mbanana_bread + menglish_muffin;
        pastries = mcroissant + mmile_feuille + mbizcocho + mcannoli + mpecan_pie;

        jmlh = bread + pastries;
        return jmlh;
    }

    public double hbaguette = 20000;
    public double hwheat_bread = 15000;
    public double hbagel = 15000;
    public double hbanana_bread = 18000;
    public double henglish_muffin = 12000;

    public double hcroissant = 15000;
    public double hmile_feuille = 19000;
    public double hbizcocho = 15000;
    public double hcannoli = 12000;
    public double hpecan_pie = 16000;

    public double jmlhpajak = 0.90;

    public Double Jumlah(double subTotal){
        double pajak_akhir = subTotal - (subTotal * jmlhpajak);
        return pajak_akhir;
    }

    private JFrame frame;
    public void ExitSystem(){
        frame = new JFrame("Keluar");

        if(JOptionPane.showConfirmDialog(frame, "Apakah Anda Ingin Keluar?", "Bakery",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }

}
