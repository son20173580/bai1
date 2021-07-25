package Bai_2;

//import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
//@SpringBootApplication




        /* //setup driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();//cai dat trinh duyet khi khoi chay
        String baseUrl = "https://au-webhook-adc1.onshopbase.com/products/shimanos-new-polarized-fishing-glasses?variant=1000002759576958";
        driver.get(baseUrl);//cai nay la lay URL

        */



class   Product {

   private String name;
   private double price;
   private String variat;
   private int quantity;

    public Product() {
    }

    public Product(String name, double price, String variat, int quantity) {
        this.name = name;
        this.price = price;
        this.variat = variat;
        this.quantity = quantity;

    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVariat(String variat) {
        this.variat = variat;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public String getVariat() {
        return variat;
    }

    @Override
    public String toString() {
        return
                "{price=" + price +
                ", variat='" + variat + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public static void main(String[] args) {
        // Danh sách sản phẩm

        Product ThongTin0 = new Product("POLARIZED FISHING GLASSES", 69.99, "Black", 1);
        Product ThongTin1 = new Product("Gìay", 17.78, "Black", 1);
        Product ThongTin2 = new Product("Bikini", 35.08, "Red", 1);
        Product ThongTin3 = new Product("Túi", 50.11, "Black", 2);
        Product ThongTin4 = new Product("SHIRT", 10.00, null, 1);
        Product ThongTin5 = new Product("Đồ bơi", 31.08, "White", 3);
        Product ThongTin6 = new Product("Aó sơ mi", 17.08, "Black", 1);


        // Danh sách List sản phẩm
        ArrayList<Product> ListProduct = new ArrayList<>();
        ListProduct.add(ThongTin0 );
        ListProduct.add(ThongTin1);
        ListProduct.add(ThongTin2);
        ListProduct.add(ThongTin3);
        ListProduct.add(ThongTin4);
        ListProduct.add(ThongTin5);
        ListProduct.add(ThongTin6);
       // for (int i = 0; i <= 6; i++) {
        //    System.out.println(ListProduct.get(i) + "");



        // Tạo HashMap

        HashMap<String, Product> GioHang = new HashMap<>();
        //Buyer tích mua thêm 3 sản phẩm
        GioHang.put("POLARIZED FISHING GLASSES", ThongTin0);
        GioHang.put("Gìay", ThongTin1);
        GioHang.put("Bikini", ThongTin2);

        //Buyer giảm số lượng của product trên trong giỏ hàng còn 2
        GioHang.remove("SHIRT");

        //Buyer tiếp tục thêm mới 1 product khác:
        GioHang.putIfAbsent("Váy",ThongTin4);

        // In ra tất cả sản phẩm có trong giỏ hàng

        System.out.println(GioHang);



    }

}
