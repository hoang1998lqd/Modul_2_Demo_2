package OOP_In_Web.Excercise_12;

public class Car extends Vehicle{
    private int seat;
    private String engine;

    public Car() {
    }

    public Car(int seat, String engine) {
        this.seat = seat;
        this.engine = engine;
    }

    public Car(int ID, String company, int year, int cost, String color, int seat, String engine) {
        super(ID, company, year, cost, color);
        this.seat = seat;
        this.engine = engine;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Car{" +
                "seat=" + seat +
                ", engine='" + engine + '\'' +
                '}';
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
