package OOP_In_Web.Exercise_09;

public class Client {
    private String name;
    private int number;
    private int code;

    public Client() {

    }

    public Client(String name, int number, int code) {
        this.name = name;
        this.number = number;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", code=" + code +
                '}';
    }
}
