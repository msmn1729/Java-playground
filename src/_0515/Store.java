package _0515;

import java.util.Arrays;
import java.util.Objects;

public class Store {
    private String name;
    private Product[] products = new Product[2];

    public Store(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean isNotStoreSearchProduct(String productName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                continue;
            }
            if (products[i].isEqualsProduct(productName)) {
                return false;
            }
        }
        return true;
    }

    public boolean isStoreName(String name) {
        return Objects.equals(this.name, name);
    }

    public void addProduct(String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                continue;
            }
            products[i] = new Product(name);
            return;
        }
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }

    private String productToString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (Product product : products) {
            builder.append("\n    ");
            if (product == null) {
                builder.append("null");
            } else {
                builder.append(product);
            }
            builder.append(",");
        }
        builder.append("]");
        return builder.toString();
    }
}
