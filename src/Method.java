import java.util.ArrayList;

public class Method {
    ArrayList<Officers> officers = new ArrayList<>();
    public void addOfficer(Officers o){
        officers.add(o);
    }

    public void searchName(String name){
        for (Officers x:officers
             ) {
            if(x.getName().equals(name)){
                System.out.println(x.displayOfficer());
            }
        }
    }

    public void readOfficer(){
        for (Officers x:officers
             ) {
            System.out.println(x.displayOfficer());
        }
    }
}
