package pizzaprojekt.model.food;

public class Drink extends MenuCard {

    protected String variety;
    protected double abundance; // abundace = Fülle

    public Drink(int type){
        super();
        setVariety(type);
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(int type) {
        this.variety = variety;
        if(type == 0){
            variety = "Water";
        }else if(type == 1){
            variety = "Juice";
        }else if(type == 2){
            variety = "Lemonade";
        }
    }
    public double getAbundance() {
        return abundance;
    }

    public void setAbundance(double abundance) {
        this.abundance = abundance;
    }
}
