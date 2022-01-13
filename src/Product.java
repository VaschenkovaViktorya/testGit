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
public void buyProduct(){
    System.out.println("купить продукт");
}



}
