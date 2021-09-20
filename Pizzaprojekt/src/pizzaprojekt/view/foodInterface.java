package pizzaprojekt.view;

import pizzaprojekt.control.Doepi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class foodInterface {
    private JPanel foodPanel;
    private JLabel doenerPiece;
    private JLabel pizzaPiece;
    private JLabel saladPiece;
    private JLabel availableLabel;
    private JButton zurückButton;
    private JButton doenerButton;
    private JButton pizzaButton;
    private JButton saladButton;
    private JLabel priceStatus;
    private JLabel counterLabel;
    private JButton removeDoener;
    private JButton removePizza;
    private JButton removeSalad;
    private Doepi myDoepi;
    private int doenerCounter = 0;
    private int pizzaCounter = 0;
    private int saladCounter = 0;
    private int foodSumPrice;
    private int doenerPrice = 5;
    private int doenerNumber = 0;
    private int pizzaPrice = 7;
    private int pizzaNumber = 0;
    private int saladPrice = 3;
    private int saladNumber = 0;


    public foodInterface(Doepi myDoepi){
        this.myDoepi = myDoepi;
        doenerPiece.setText("Anzahl Döner: " + doenerNumber);
        pizzaPiece.setText("Anzahl Pizzen: " + pizzaNumber);
        saladPiece.setText("Anzahl Salate: " + saladNumber);

        doenerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(doenerCounter < 5) {
                    doenerCounter++;
                    foodSumPrice = foodSumPrice + doenerPrice;
                    priceStatus.setText("Gesamtpreis: " + foodSumPrice + "€");
                    doenerNumber++;
                    doenerPiece.setText("Anzahl Döner: " + doenerNumber);
                }else{
                    counterLabel.setText("Maximale Anzahl Gerichte erreicht!");
                }
            }
        });
        pizzaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pizzaCounter < 5) {
                    pizzaCounter++;
                    foodSumPrice = foodSumPrice + pizzaPrice;
                    priceStatus.setText("Gesamtpreis: " + foodSumPrice + "€");
                    pizzaNumber++;
                    pizzaPiece.setText("Anzahl Pizzen: " + pizzaNumber);
                }else{
                    counterLabel.setText("Maximale Anzahl Gerichte erreicht!");
                }
            }
        });
        saladButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(saladCounter < 5) {
                    saladCounter++;
                    foodSumPrice = foodSumPrice + saladPrice;
                    priceStatus.setText("Gesamtpreis: " + foodSumPrice + "€");
                    saladNumber++;
                    saladPiece.setText("Anzahl Salate: " + saladNumber);
                }else{
                    counterLabel.setText("Maximale Anzahl Gerichte erreicht!");
                }
            }
        });
        removeDoener.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (doenerCounter > 0){
                    doenerCounter--;
                    foodSumPrice = foodSumPrice - doenerPrice;
                    priceStatus.setText("Gesamtpreis: " + foodSumPrice + "€");
                    doenerNumber--;
                    doenerPiece.setText("Anzahl Döner: " + doenerNumber);
                    counterLabel.setText("");
                }
            }
        });
        removePizza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pizzaCounter > 0){
                    pizzaCounter--;
                    foodSumPrice = foodSumPrice - pizzaPrice;
                    priceStatus.setText("Gesamtpreis: " + foodSumPrice + "€");
                    pizzaNumber--;
                    pizzaPiece.setText("Anzahl Pizzen: " + pizzaNumber);
                    counterLabel.setText("");
                }
            }
        });
        removeSalad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (saladCounter > 0){
                    saladCounter--;
                    foodSumPrice = foodSumPrice - saladPrice;
                    priceStatus.setText("Gesamtpreis: " + foodSumPrice + "€");
                    saladNumber--;
                    saladPiece.setText("Anzahl Salate: " + saladNumber);
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

    public int getFoodSumPrice() {
        return foodSumPrice;
    }

    public JPanel getPanel(){
        return foodPanel;
    }
}
