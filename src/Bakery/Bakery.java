package Bakery;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.String;

public class Bakery {
    private JLabel title, breads, baguette, wheat_bread, bagel, banana_bread, english_muffin;
    private JLabel pastries, croissant, mile_feuille, bizcocho, cannoli, pecan_pie;
    private JTextField a0TextField, a0TextField1, a0TextField2, a0TextField3, a0TextField4;
    private JTextField a0TextField5, a0TextField6, a0TextField7;
    private JTextField a0TextField8, a0TextField9, a0TextField10, a0TextField11, a0TextField12;
    private JLabel subTotal, pajak, total;
    private JLabel sel1, sel2;
    private JButton totalButton, resetButton, exitButton, receiptButton;
    private JPanel Main;
    private JTextField a0TextField13;
    private JTextField a0TextField14;
    private JTextArea textArea1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Summer Bakery");
        frame.setContentPane(new Bakery().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Bakery() {
        totalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuLain HargaMakanan = new MenuLain();

                double jPajak, jSubTotal, jTotal;

                HargaMakanan.mbaguette = HargaMakanan.hbaguette * Double.parseDouble(a0TextField.getText());
                HargaMakanan.mwheat_bread = HargaMakanan.hwheat_bread * Double.parseDouble(a0TextField1.getText());
                HargaMakanan.mbagel = HargaMakanan.hbagel * Double.parseDouble(a0TextField2.getText());
                HargaMakanan.mbanana_bread = HargaMakanan.hbanana_bread * Double.parseDouble(a0TextField3.getText());
                HargaMakanan.menglish_muffin = HargaMakanan.henglish_muffin * Double.parseDouble(a0TextField4.getText());

                HargaMakanan.mcroissant = HargaMakanan.hcroissant * Double.parseDouble(a0TextField8.getText());
                HargaMakanan.mmile_feuille = HargaMakanan.hmile_feuille * Double.parseDouble(a0TextField9.getText());
                HargaMakanan.mbizcocho = HargaMakanan.hbizcocho * Double.parseDouble(a0TextField10.getText());
                HargaMakanan.mcannoli = HargaMakanan.hcannoli * Double.parseDouble(a0TextField11.getText());
                HargaMakanan.mpecan_pie = HargaMakanan.hpecan_pie * Double.parseDouble(a0TextField12.getText());

                jSubTotal = HargaMakanan.Jumlah();
                jPajak = HargaMakanan.Jumlah(jSubTotal);
                jTotal = jSubTotal + jPajak;

                String SubTotal = String.format("Rp%.2f", jSubTotal);
                a0TextField5.setText(SubTotal);

                String Pajak = String.format("Rp%.2f", jPajak);
                a0TextField6.setText(Pajak);

                String Total = String.format("Rp%.2f", jTotal);
                a0TextField7.setText(Total);
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a0TextField.setText("0");
                a0TextField1.setText("0");
                a0TextField2.setText("0");
                a0TextField3.setText("0");
                a0TextField4.setText("0");
                a0TextField5.setText("0");
                a0TextField6.setText("0");
                a0TextField7.setText("0");
                a0TextField8.setText("0");
                a0TextField9.setText("0");
                a0TextField10.setText("0");
                a0TextField11.setText("0");
                a0TextField12.setText("0");
                textArea1.setText("");

                tgltrnsks tanggal = new tgltrnsks();
                Date tgl = new Date();
                tanggal.setTanggal(tgl);
                tanggal.getTanggal();
                a0TextField14.setText(tanggal.toString());
                a0TextField14.setText(tgl.toString());
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Keluar Keluar = new Keluar();
                Keluar.ExitSystem();
            }
        });

        receiptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ref = 1024 + (int)(Math.random() * 4238);


                textArea1.append("Nomor Transaksi: " + ref +
                                 "\n-------------------------------"+
                                 "\nSubTotal : " + a0TextField5.getText() +
                                 "\nPajak    : " + a0TextField6.getText() +
                                 "\nTotal    : " + a0TextField7.getText() +
                                 "\n-------------------------------"+
                                 "\n          Terima Kasih!        ");
            }
        });
    }
}
