package pizzaprojekt.control;

import pizzaprojekt.model.people.Worker;
import pizzaprojekt.model.tools.Furnace;
import pizzaprojekt.model.tools.KebabSkewer;
import pizzaprojekt.model.tools.SaladStorage;
import pizzaprojekt.view.*;

import javax.swing.*;

public class Doepi {

    private double money = 1000;
    private JFrame myFrame;
    private startInterface interface1;
    private loginInterface interface2;
    private orderInterface interface3;
    private drinkInterface interface4;
    private foodInterface interface5;
    private exitInterface interface6;
    private Doepi doepi;

    public static void main(String[] args) {
        Worker worker = new Worker();
        App myApp = new App();
        Doepi doepi = new Doepi();
        Furnace furnace = new Furnace();
        SaladStorage saladStorage = new SaladStorage(doepi);
    }

    public Doepi(){
        createFrame();
    }

    public void createFrame(){
        myFrame = new JFrame("Doepi App");
        interface1 = new startInterface(this);
        interface2 = new loginInterface(this);
        interface5 = new foodInterface(this);
        interface4 = new drinkInterface(this);
        interface3 = new orderInterface(this, interface5, interface4);
        interface6 = new exitInterface(this);
        myFrame.setVisible(true);
        myFrame.setBounds(0,0,1000,1000);
        myFrame.setContentPane(interface1.getPanel());
    }

    public void switchFrame(String panel){
        switch(panel) {
            case "start":
                myFrame.setContentPane(interface1.getPanel());
                break;
            case "login":
                myFrame.setContentPane(interface2.getPanel());
                break;
            case "order":
                myFrame.setContentPane(interface3.getPanel());
                break;
            case "drink":
                myFrame.setContentPane(interface4.getPanel());
                break;
            case "food":
                myFrame.setContentPane(interface5.getPanel());
                break;
            case "exit":
                myFrame.setContentPane(interface6.getPanel());
                break;
            default: myFrame.setContentPane(interface1.getPanel());
        }
        myFrame.revalidate();
    }

    public void closeFrame(){
        myFrame.dispose();
    }

    public double getMoney(){
        return money;
    }

    public void setMoney(double money){
        this.money = money;
    }

    public void isBankrupt(){
        if(doepi.getMoney() <= 0){
            System.out.println("Doepi ist bankrott und muss leider schließen.");
            //Todo Gibt es eine Möglichkeit, dass man das ganze Programm blockiert, sodass man nichts mehr machen kann?
        }
    }
}
