import java.time.LocalDate;

public class Staff extends Officers {
    private String work;

    public Staff() {
    }

    public Staff(String work) {
        this.work = work;
    }

    public Staff(String name, LocalDate dateOfBirth, String gender, String address, String work) {
        super(name, dateOfBirth, gender, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Staff{" +
        "name='" + getName() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                ", gender='" + getGender() + '\'' +
                ", address='" + getAddress() + '\'' +
                "work='" + work + '\'' +
                '}';
    }
}
