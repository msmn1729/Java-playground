package _0522;

public class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public void printProductName() {
        System.out.println(name);
    }

    public boolean isEqualProductName(String name) {
        return this.name.equals(name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
