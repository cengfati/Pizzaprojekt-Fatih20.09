package pizzaprojekt.model.people;

public abstract class Human {
    protected String forename;
    protected String surname;
    protected String[] nameList;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String[] getNameList(){ return nameList; }

    public void setNameList(String[] nameList){}

    public String getForename() {
        return forename;
    }

    public abstract void setForename();


}
