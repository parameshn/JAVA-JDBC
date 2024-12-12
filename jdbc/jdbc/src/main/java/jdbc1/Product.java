package jdbc1;

public class Product {
    private int productcode;
    private String productName;
    private double price;
    private String description;

    public Product(int productCode, String productName, double price, String description) {
        this.productcode = productCode;
        this.productName = productName;
        this.description = description;
        this.price = price;
    }


    public String getName() {
        return productName;
    }

    public int getCode() {
        return productcode;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;

    }
    
    public void  setName(String productName) {
        
         this.productName = productName;
        
    }

    public void setCode(int productCode) {
        this.productcode = productCode;
    }

    public void setDescription(String description) {
        this.description = description;
        
    }
    

    public void setPrice(double price) {
        this.price = price;

    }

    public void displayProduct() {
        System.out.println("Product ID: " + productcode);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Description: " + description);
    }
}
