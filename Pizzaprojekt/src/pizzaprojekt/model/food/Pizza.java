package pizzaprojekt.model.food;

public class Pizza extends MenuCard {

    public Pizza(int type) {
        //p(type);
    }

    public String p(int Type){
        ingredians = new String[2];
        ingredians[0]="Pizza magarita";
        ingredians[1]="Thunfischpizza";
        return ingredians[Type];
    }
}