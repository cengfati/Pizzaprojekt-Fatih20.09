package pizzaprojekt.model.tools;

import pizzaprojekt.model.food.Salad;
import pizzaprojekt.control.Doepi;

public class SaladStorage {

    private int numberKit = 35;
    private double abundancePrice = 2;
    private Doepi doepi;

    public SaladStorage(Doepi doepi){
        this.doepi = doepi;
    }

    public int getNumberKit() {
        return numberKit;
    }

    public void setNumberKit(int numberKit) {
        this.numberKit = numberKit;
    }

    public double getAbundancePrice() {
        return abundancePrice;
    }

    public void setAbundancePrice(double abundancePrice){
        this.abundancePrice = abundancePrice;
    }

    public void use(int saladType){
        int numberNewKit = 5;
        numberKit--;
        Salad s = new Salad(saladType);
        if(numberKit == 0){
            numberKit =+ numberNewKit;
            doepi.setMoney(doepi.getMoney() - numberNewKit * abundancePrice);
        }
    }
}
