package Testing;

import java.util.Scanner;

public class btap {

    double x;

    public static void main(String[] args) {
        System.out.println("Nhập từ bàn phím ");
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        double denta = b*b - 4*a*c;
        System.out.println("KẾT QUẢ TRẢ VỀ");

        if(a==0) {




            double x = (-c) / b;
            System.out.println("Phương trình có nghiệm x=" + x);
        }

        if(a!=0&&denta<0){
            System.out.println("Phương trình vô nghiệm");

        }
        if(a!=0 && denta==0){
                double x = (-b)/(2*a);

                System.out.println("Phương trình có nghiệm kép x1=x2="+x);



        }
        if(a!=0 && denta >0){
            double x1= (-b +Math.sqrt(denta))/(2*a);
            double x2 = (-b -Math.sqrt(denta))/(2*a);
            System.out.println("Phương có 2 nghiệm x1="+x1+ " x2= "+x2);
        }

        }

    }

