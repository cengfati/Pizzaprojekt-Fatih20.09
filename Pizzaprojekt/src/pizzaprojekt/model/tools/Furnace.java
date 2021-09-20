package pizzaprojekt.model.tools;

import pizzaprojekt.control.Doepi;
import pizzaprojekt.model.food.Pizza;

public class Furnace {
    private double timer;
    private boolean available;
    private Doepi doepi;

    public Furnace(){
        this.timer = timer;
        this.available = available;
    }

    public double getTimer(){
      return timer;
    }

    public void setTimer(double timer){
        this.timer = timer;
    }

    public boolean getAvailable(){
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void use(int type) throws InterruptedException {
        double ingrediansPrice = 2; //Todo Reden ob das sinnvoll ist
        if(getAvailable()){
            setAvailable(false);
            wait(500);
            Pizza pizza = new Pizza(type);
            doepi.setMoney(doepi.getMoney() - ingrediansPrice);
        }
        setAvailable(true);
    }
}
