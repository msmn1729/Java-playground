package _0515;

import java.util.Objects;

public class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public boolean isEqualsProduct(String name) {
        return Objects.equals(this.name, name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
