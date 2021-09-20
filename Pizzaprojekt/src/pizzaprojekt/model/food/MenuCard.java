package pizzaprojekt.model.food;

public abstract class MenuCard {

    protected double price;
    protected boolean orderReady;
    protected String[] ingredians;

    public MenuCard(){ //todo Parameter fehlen
        this.price = price;
        this.orderReady = orderReady;
        this.ingredians = ingredians;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getOrderReady(){
        return orderReady;
    }

    public void setOrderReady(boolean orderReady) {
        this.orderReady = orderReady;
    }

    public void setIngredians(String[] ingredians) {
        this.ingredians = ingredians;
    }

    public String[] getIngredians() {
        return ingredians;
    }

    public double getPriceForEverything(){ // Todo gucken wie man alle Preise zusammenrechnen kann
        return price;
    }
}
