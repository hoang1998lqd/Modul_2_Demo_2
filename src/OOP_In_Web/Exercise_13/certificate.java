package OOP_In_Web.Exercise_13;

import java.time.LocalDate;

public class certificate {
    private int id;
    private String name;
    private int rank;
    private LocalDate date;

    public certificate(int id, String name, int rank, LocalDate date) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.date = date;
    }

    public certificate() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "certificate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                ", date=" + date +
                '}';
    }
}
