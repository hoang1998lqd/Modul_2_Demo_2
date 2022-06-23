package OOP_In_Web.Excercise_12;

public class Vehicle {
    private int ID;
    private String company;
    private int year;
    private int cost;
    private String color;

    public Vehicle() {
    }

    public Vehicle(int ID, String company, int year, int cost, String color) {
        this.ID = ID;
        this.company = company;
        this.year = year;
        this.cost = cost;
        this.color = color;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "ID=" + ID +
                ", company='" + company + '\'' +
                ", year=" + year +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
