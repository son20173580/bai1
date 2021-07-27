package templates;

public class Student2 {
    private String name;
    private String address;
    private double gpa;

    public Student2(String name, String address, double gpa) {
        this.address = address;
        this.name = name;
        this.gpa = gpa;
    }

   /* public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getGpa() {
        return gpa;
    }


    */
    public String toString() {
        return "Name: " + name + ",address" + address+ ",GPA:"+ address;
    }
}