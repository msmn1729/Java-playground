package _0522;

import java.util.Arrays;

public class Store {
    private Product[] products = new Product[3];
    private String name;

    public Store(String name) {
        this.name = name;
        if (name.equals("현대")) {
            throw new RuntimeException("ㅁㄴㅇ");
        }
    }

    public boolean isEqualStoreName(String storeName) {
        return this.name.equals(storeName);
    }

    public void addProduct(String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                continue;
            }
            products[i] = new Product(name);
            return;
        }
        System.err.println("product 사이즈 초과로 " + name + "을 추가하지 못했습니다.");
    }

    public void printAllProduct() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                continue;
            }
            products[i].printProductName();
        }
    }

    public void printEqualStoreProductCount(int productCount) {
        int storeProductCount = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                continue;
            }
            storeProductCount++;
        }
        if (storeProductCount == productCount) {
            System.out.println(this.name);
        } else {
            System.err.println(name + "의 물건 개수와 일치하지 않습니다");
        }
    }

    public void printSearchStoreProductName(String productName) {
        boolean isExistProduct = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                continue;
            }
            if (products[i].isEqualProductName(productName)) {
                System.out.println(name);
                isExistProduct = true;
            }
        }
        if (!isExistProduct) {
            System.err.println(name + "에서 " + productName + "을 찾지 못했습니다.");
        }
    }

    @Override
    public String toString() {
        return "Store{" +
                "products=" + Arrays.toString(products) +
                ", name='" + name + '\'' +
                '}';
    }
}
