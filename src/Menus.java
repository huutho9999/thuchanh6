import java.time.LocalDate;
import java.util.Scanner;

public class Menus {
    Scanner sc = new Scanner(System.in);
    public Officers createOfficers( Officers o){
        System.out.println("Nhap ten cua nhan vien : ");
        o.setName(sc.nextLine());
        System.out.println("Nhap gioi tinh : ");
        o.setGender(sc.nextLine());
        System.out.println("Nhap dia chi : ");
        o.setAddress(sc.nextLine());
        System.out.println("Nhap ngay sinh : ");
        int day = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap thang sinh : ");
        int month = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap nam sinh : ");
        int year = Integer.parseInt(sc.nextLine());
        o.setDateOfBirth(LocalDate.of(year,month,day));
        return o;
    }
    public Engineer createEngineer(Engineer engineer){
        System.out.println("Nhap nganh dao tao ");
        engineer.setEducate(sc.nextLine());
        System.out.println(engineer.toString());
        System.out.println("Tao thanh cong ");
        return engineer;
    }
    public Worker createWorker( Worker worker){

        System.out.println("Nhap cap bac luong ");
        worker.setLevel(Integer.parseInt(sc.nextLine()));
        System.out.println(worker.toString());
        System.out.println("Tao thanh cong ");
        return worker;
    }
    public Staff createStaff(Staff staff){
        System.out.println("Nhap thong tin cong viec : ");
        staff.setWork(sc.nextLine());
        System.out.println(staff.toString());
        System.out.println("Tao thanh cong ");
        return staff;
    }
}
