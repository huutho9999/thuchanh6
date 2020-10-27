import java.time.LocalDate;

public class Worker extends Officers {
    private int level;

    public Worker() {
    }

    public Worker(int level) {
        this.level = level;
    }

    public Worker(String name, LocalDate dateOfBirth, String gender, String address, int level) {
        super(name, dateOfBirth, gender, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker{" +
        "name='" + getName() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                ", gender='" + getGender() + '\'' +
                ", address='" + getAddress() + '\'' +
                "level=" + level +
                '}';
    }
}
