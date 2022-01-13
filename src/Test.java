public class Test {
    public static void main(String[] args) {
        System.out.println("Hello");
        Product cheese1 = new Cheese();
        cheese1.buyProduct();
        cheese1.setPrice(100);
        System.out.println(cheese1.getPrice());

    }
}
