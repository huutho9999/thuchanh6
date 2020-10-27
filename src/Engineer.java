import java.time.LocalDate;

public class Engineer extends Officers{
    private String educate;

    public Engineer() {
    }

    public Engineer(String educate) {
        this.educate = educate;
    }

    public Engineer(String name, LocalDate dateOfBirth, String gender, String address, String educate) {
        super(name, dateOfBirth, gender, address);
        this.educate = educate;
    }

    public String getEducate() {
        return educate;
    }

    public void setEducate(String educate) {
        this.educate = educate;
    }

    @Override
    public String toString() {
        return "Engineer{" +
        "name='" + getName() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                ", gender='" + getGender() + '\'' +
                ", address='" + getAddress() + '\'' +
                "educate='" + educate + '\'' +
                '}';
    }
}
