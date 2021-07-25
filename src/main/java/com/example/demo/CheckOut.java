package com.example.demo;

import java.util.Locale;

class Checkout extends Dashboard {


    private static String discount_code;
    private static double discount_value;
    double discount ;

    double ship;
    double Tong;

    public  Checkout(String discount_code, double discount_value,double discount,double ship,double Tong) {
        super(discount_code, discount_value);
        this.discount = discount;
        this.ship=ship;
        this.Tong=Tong;
    }
    public static void main(String[] args) {
        Checkout c = new Checkout("testing", 5.00, 5.0,4.00,15.00);


            if (c.getDiscount_code().toUpperCase(Locale.ROOT).equals("TESTING")) {
                System.out.println(" Pass");
            }
            else {
                System.out.println(" False");
            }



            if ((c.Tong - c.discount + c.ship) == 6.00) {
                System.out.println(" Pass");
            } else {
                System.out.println(" False");
            }
        }


    }

