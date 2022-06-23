package OOP_In_Web.Excercise_12;

public class Motor extends Vehicle {
    private int capacity;


    public Motor(int ID, String company, int year, int cost, String color, int capacity) {
        super(ID, company, year, cost, color);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
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

    @Override
    public String toString() {
        return super.toString() +
                "Motor{" +
                "capacity=" + capacity +
                '}';
    }
}
