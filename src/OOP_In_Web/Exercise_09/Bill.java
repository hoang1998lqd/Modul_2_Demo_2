package OOP_In_Web.Exercise_09;

public class Bill {
    private Client client;
    private int oldE;
    private int newE;
    private int cost;

    public Bill(Client client, int oldE, int newE, int cost) {
        this.client = client;
        this.oldE = oldE;
        this.newE = newE;
        this.cost = cost;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getOldE() {
        return oldE;
    }

    public void setOldE(int oldE) {
        this.oldE = oldE;
    }

    public int getNewE() {
        return newE;
    }

    public void setNewE(int newE) {
        this.newE = newE;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "client=" + client +
                ", oldE=" + oldE +
                ", newE=" + newE +
                ", cost=" + cost +
                '}';
    }
}
