package OOP_In_Web.Excercise_12;

public class Truck extends Vehicle{
    private  int tonnage;

    public Truck() {
    }

    public Truck(int ID, String company, int year, int cost, String color, int tonnage) {
        super(ID, company, year, cost, color);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Truck{" +
                "tonnage=" + tonnage +
                '}';
    }

    public Truck(int ID, String company, int year, int cost, String color) {
        super(ID, company, year, cost, color);
    }

    @Override
    public int getID() {
        return super.getID();
    }

    @Override
    public void setID(int ID) {
        super.setID(ID);
    }

    @Override
    public String getCompany() {
        return super.getCompany();
    }

    @Override
    public void setCompany(String company) {
        super.setCompany(company);
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public int getCost() {
        return super.getCost();
    }

    @Override
    public void setCost(int cost) {
        super.setCost(cost);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
}
