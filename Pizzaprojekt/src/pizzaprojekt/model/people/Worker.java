package pizzaprojekt.model.people;

import pizzaprojekt.model.tools.Furnace;
import pizzaprojekt.model.tools.KebabSkewer;
import pizzaprojekt.model.tools.SaladStorage;
import pizzaprojekt.model.food.Drink;

public class Worker extends Human {
    private Furnace furnace;
    private KebabSkewer kebabSkewer;
    private SaladStorage saladStorage;

    public Worker(){


    }

    public void setFurnace(Furnace furnace) {
        this.furnace = furnace;
    }

    public Furnace getFurnace() {
        return furnace;
    }

    public void setKebabSkewer(KebabSkewer kebabSkewer) {
        this.kebabSkewer = kebabSkewer;
    }

    public KebabSkewer getKebabSkewer() {
        return kebabSkewer;
    }

    public void setSaladStorage(SaladStorage saladStorage) {
        this.saladStorage = saladStorage;
    }

    public SaladStorage getSaladStorage() {
        return saladStorage;
    }

    public void setForename() {
        nameList[0] = "Greed";
        nameList[1] = "Choco";
        nameList[2] = "Bam";
        int r = (int) Math.random()*2;
        forename = nameList[2];
    }

    public void processOrder(int food, int type){
        switch(food){
            case 1: kebabSkewer.makeKebab(type);
            break;
            case 2:
                try {
                    furnace.use(type);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 3: saladStorage.use(type);
            break;
            case 4: Drink drink = new Drink(type);
            break;
        }
    }
}
