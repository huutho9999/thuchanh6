import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Method m = new Method();
        Menus menu = new Menus();
        do{
            System.out.println("1. Nhap thong tin nhan vien : ");
            System.out.println("2. Hien thi thong tin nhan vien : ");
            System.out.println("3. Tim kiem nhan vien theo ten : ");
            System.out.println("4. Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("1. Chuc vu Ky su : ");
                    System.out.println("2. Chuc vu Nhan vien van phong : ");
                    System.out.println("3. Chuc vu cong nhan : ");
                    int choice1 = Integer.parseInt(sc.nextLine());
                    switch (choice1){
                        case 1:
                            Officers engineer = new Engineer();
                            Engineer engineer1 = (Engineer) menu.createOfficers(engineer);
                            menu.createEngineer(engineer1);
                            m.addOfficer(engineer1);
                            break;
                        case 2:
                            Officers staff = new Staff();
                            Staff staff1 = (Staff) menu.createOfficers(staff);
                            menu.createStaff(staff1);
                            m.addOfficer(staff1);
                            break;
                        case 3:
                            Officers worker = new Worker();
                            Worker worker1 = (Worker) menu.createOfficers(worker);
                            menu.createWorker(worker1);
                            m.addOfficer(worker1);
                            break;
                    }
                    break;
                case 2:
                    m.readOfficer();
                    break;
                case 3:
                    System.out.println("Nhap ten nhan vien : ");
                    String a = sc.nextLine();
                    m.searchName(a);
                    break;
                case 4:
                    System.exit(0);
            }
        }while(true);
    }
}
