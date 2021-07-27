package templates;
public class Entry {
    public static void main(String[] args) {
        IEmployee e1= new PartTimeEmployee("Hiếu",15000,7);
        IEmployee e2 = new FullTimeEmployee("Hà",20000);
        System.out.println("Name: "+e1.getName()+" Salary: " + e1.calculateSalary());
        System.out.println("Name: "+e2.getName()+" Salary: " +  e2.calculateSalary());


    }
}