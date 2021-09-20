package pizzaprojekt.model.tools;
import pizzaprojekt.control.Doepi;
import pizzaprojekt.model.food.Kebab;

public class KebabSkewer{

    private double status;
    private double price;
    private boolean getConsumed;
    private int numberSkewer;
    private Kebab kebab;
    private Doepi doepi;

    public KebabSkewer(Kebab kebab, Doepi doepi){
        status = 100;
        numberSkewer = 5;
        this.kebab = kebab;
        this.doepi = doepi;
    }

    public KebabSkewer() {

    }

    public double getStatus() {
        return status;
    }

    public void setStatus(double status) {
        status = status;
    }

    public void useSkewer(){
        int numberNewSkewer = 2;
        int skewerPrice = 10;
        if(numberSkewer > 0){
            if (getConsumed){
                status = status - 1.5;
                if(getStatus() == 0){
                    numberSkewer =- 1;
                }
            }
        }else{
            numberSkewer =+ numberNewSkewer;
            doepi.setMoney(doepi.getMoney() - numberNewSkewer * skewerPrice);
        }
    }

    public void makeKebab(int type){
        double productPrice = 1;
        useSkewer();
        Kebab kebab = new Kebab();
        doepi.setMoney(doepi.getMoney()- productPrice);
    }

    /* public boolean skewerLeft(){
        if (status <= 0){
            skewerLeft = skewerLeft - 1;
            return true;
        }else{
            System.out.println("Alle Dönerspieße sind leer!");
            return false;
        }
    } */
}
