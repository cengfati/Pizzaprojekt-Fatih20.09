package pizzaprojekt.model.people;

import pizzaprojekt.model.food.MenuCard;

public class Guest extends Human {

    private String username;
    private String password;
    private String favoriteFood;
    private double budget; // Todo: In der App sein Budget angeben
    private String[] orderMeal;
    private String[] lastTenOrders = new String[10];
    private int i = 0;
    private int Meal;
    private int Type;
    private Guest guest;
    private MenuCard menuCard;

    public Guest(){
        this.username = username;
        this.password = password;
        this.favoriteFood = favoriteFood;
        this.budget = Math.random()*70+ 20;
        setForename();
        Meal = (int) Math.random()*3;
        Type = (int) Math.random();
    }

    public void register(){
    }

    public void setForename(){
        nameList[0] = "Karl";
        nameList[1] = "Hans";
        nameList[2] = "Lucifer";
        nameList[3] = "Thomas";
        nameList[4] = "Iglob";
        nameList[5] = "Fritz";
        nameList[6] = "Jonn";
        nameList[7] = "Sara";
        nameList[8] = "Marie";
        nameList[9] = "Karin";
        int r = (int) Math.random()*10;
        forename = nameList[2];
    }

    public void doOrderMeal(int Meal){
        String theOrder = " ";
        orderMeal = new String[6];
        int anzahl = (int) Math.random()*4+1;
        orderMeal[0] = "Doener ohne alles ";
        orderMeal[1] = "Doener mit alles ";
        orderMeal[2] = "Pizza Magarita ";
        orderMeal[3] = "Thunfischpizza";
        orderMeal[4] = "Salat ";
        orderMeal[5] = "Salat ohne Kaese ";
        for(int i = 0;i<anzahl;i++){
            int theMeal = (int) Math.random()*5;
            theOrder = orderMeal[theMeal] + ", ";
        }
        System.out.println("Ich will" + theOrder + "haben");
        if(i<10){
            lastTenOrders[i] = theOrder;
            i++;
        }else{
            i = 0;
            lastTenOrders[i] = theOrder;
        }
    }

    public void login(){

    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFavoriteFood(){
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood){
        this.favoriteFood = favoriteFood;
    }

    public double getBudget(){
        return budget;
    }

    public void setBudget(double Budget){
        this.budget = budget;
    }

    public void pay(){
        guest.setBudget(budget - menuCard.getPriceForEverything());
    }
}
