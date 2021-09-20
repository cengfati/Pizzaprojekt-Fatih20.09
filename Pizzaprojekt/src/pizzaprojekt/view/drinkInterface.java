package pizzaprojekt.view;

import pizzaprojekt.control.Doepi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class drinkInterface {
    private JPanel drinkPanel;
    private JLabel availableLabel;
    private JButton waterButton;
    private JButton juiceButton;
    private JButton lemonadeButton;
    private JButton zurückButton;
    private JLabel priceStatus;
    private JLabel waterPiece;
    private JLabel juicePiece;
    private JLabel lemonadePiece;
    private JLabel counterLabel;
    private JButton removeWater;
    private JButton removeJuice;
    private JButton removeLemonade;
    private Doepi myDoepi;
    private int drinkSumPrice;
    private int waterPrice = 1;
    private int waterNumber = 0;
    private int juicePrice = 3;
    private int juiceNumber = 0;
    private int lemonadePrice = 4;
    private int lemonadeNumber = 0;
    private int waterCounter = 0;
    private int juiceCounter = 0;
    private int lemonadeCounter = 0;


    public drinkInterface(Doepi myDoepi){
        this.myDoepi = myDoepi;
        waterPiece.setText("Anzahl Wasser: " + waterNumber);
        juicePiece.setText("Anzahl Saft: " + juiceNumber);
        lemonadePiece.setText("Anzahl Limonade: " + lemonadeNumber);

        waterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(waterCounter < 5) {
                    waterCounter++;
                    drinkSumPrice = drinkSumPrice + waterPrice;
                    priceStatus.setText("Gesamtpreis: " + drinkSumPrice + "€");
                    waterNumber++;
                    waterPiece.setText("Anzahl Wasser: " + waterNumber);
                }else{
                    counterLabel.setText("Maximale Anzahl Getränke erreicht!");
                }
            }
        });
        juiceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(juiceCounter < 5) {
                    juiceCounter++;
                    drinkSumPrice = drinkSumPrice + juicePrice;
                    priceStatus.setText("Gesamtpreis: " + drinkSumPrice + "€");
                    juiceNumber++;
                    juicePiece.setText("Anzahl Säfte: " + juiceNumber);
                }else{
                    counterLabel.setText("Maximale Anzahl Getränke erreicht!");
                }
            }
        });
        lemonadeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lemonadeCounter < 5) {
                    lemonadeCounter++;
                    drinkSumPrice = drinkSumPrice + lemonadePrice;
                    priceStatus.setText("Gesamtpreis: " + drinkSumPrice + "€");
                    lemonadeNumber++;
                    lemonadePiece.setText("Anzahl Limonade: " + lemonadeNumber);
                }else{
                    counterLabel.setText("Maximale Anzahl Getränke erreicht!");
                }
            }
        });
        removeWater.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (waterCounter > 0){
                    waterCounter--;
                    drinkSumPrice = drinkSumPrice - waterPrice;
                    priceStatus.setText("Gesamtpreis: " + drinkSumPrice + "€");
                    waterNumber--;
                    waterPiece.setText("Anzahl Wasser: " + waterNumber);
                    counterLabel.setText("");
                }
            }
        });
        removeJuice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (juiceCounter > 0){
                    juiceCounter--;
                    drinkSumPrice = drinkSumPrice - juicePrice;
                    priceStatus.setText("Gesamtpreis: " + drinkSumPrice + "€");
                    juiceNumber--;
                    juicePiece.setText("Anzahl Säfte: " + juiceNumber);
                    counterLabel.setText("");
                }
            }
        });
        removeLemonade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lemonadeCounter > 0){
                    lemonadeCounter--;
                    drinkSumPrice = drinkSumPrice - lemonadePrice;
                    priceStatus.setText("Gesamtpreis: " + drinkSumPrice + "€");
                    lemonadeNumber--;
                    lemonadePiece.setText("Anzahl Limonade: " + lemonadeNumber);
                    counterLabel.setText("");
                }
            }
        });
        zurückButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myDoepi.switchFrame("order");
            }
        });

    }

    public int getDrinkSumPrice(){
        return drinkSumPrice;
    }

    public JPanel getPanel(){
        return drinkPanel;
    }
}
