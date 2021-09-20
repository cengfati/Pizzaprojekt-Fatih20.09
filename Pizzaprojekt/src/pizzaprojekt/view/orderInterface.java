package pizzaprojekt.view;

import pizzaprojekt.control.Doepi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class orderInterface {

    private JPanel orderPanel;
    private JLabel welcomeLabel;
    private JButton drinkButton;
    private JButton foodButton;
    private JButton finishOrderButton;
    private JLabel sumPriceLabel;
    private JButton updateButton;
    private Doepi myDoepi;
    private foodInterface myFoodInterface;
    private drinkInterface myDrinkInterface;

    public orderInterface(Doepi myDoepi, foodInterface myFoodInterface, drinkInterface myDrinkInterface){
        this.myDoepi = myDoepi;
        updateButton.addActionListener(new ActionListener() {
            public int addUpSumPrice(foodInterface myFoodInterface, drinkInterface myDrinkInterface){
                return (myFoodInterface.getFoodSumPrice() + myDrinkInterface.getDrinkSumPrice());
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                sumPriceLabel.setText("Ihr Gesamtpreis: " + addUpSumPrice(myFoodInterface, myDrinkInterface) + "€");
            }
        });
        drinkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myDoepi.switchFrame("drink");
            }
        });
        foodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myDoepi.switchFrame("food");
            }
        });
        finishOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myDoepi.switchFrame("exit");
            }
        });
    }

    public orderInterface(foodInterface myFoodInterface) {
    }

    public JPanel getPanel(){
        return orderPanel;
    }

}
