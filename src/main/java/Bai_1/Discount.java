package Bai_1;

class Dashboard {
    private static double discount_value;
    private static String discount_code;


    public Dashboard(String discount_code, double discount_value) {
        this.discount_code = discount_code;
        this.discount_value = discount_value;
    }





    public void setDiscount_code(String discount_code) {
        this.discount_code = discount_code;
    }

    public void setDiscount_value(int discount_value) {
        this.discount_value = discount_value;
    }

    public String getDiscount_code() {
        return discount_code;
    }

    public double getDiscount_value() {
        return discount_value;
    }

    public static void main(String[] args) {
        Dashboard d = new Dashboard("testing", discount_value);


        System.out.println("Discount code: " + d.getDiscount_code() + " Discount value:" + d.getDiscount_value());
    }

}







