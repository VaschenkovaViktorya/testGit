public class Product {
    public String getName() {
        return name;
    }
public Product(){

}

    public Product(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;
public void buyProduct(){
    System.out.println("купить продукт");
}



}
