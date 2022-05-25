package _0522;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

public class Department {
    private Store[] stores = new Store[2];
    private String name;

    public Department(String name) {
        this.name = name;
    }

    // Department 에서 가게 생성하기
    public void addStore(String name) throws RuntimeException {
        for (int i = 0; i < stores.length; i++) {
            if (stores[i] != null) {
                continue;
            }
            stores[i] = new Store(name);
            return;
        }

//        throw new IOException("store의 사이즈를 초과했습니다.");
        throw new DepartmentException("store의 사이즈를 초과했습니다.", name);
//        System.err.println("store의 사이즈를 초과했습니다.");
    }

    // Department 에서 물건 생성하기
    public void addProduct(String storeName, String productName) {
        Store store = findStoreOrNull(storeName);
        if (store == null) {
            System.err.println(storeName + "이 존재하지 않습니다.");
            return;
        }
        store.addProduct(productName);
    }

    // Department 에서 특정 가게에 어떤 물건들이 있는지 출력하기
    public void searchStoreProductList(String storeName) {
        Store store = findStoreOrNull(storeName);
        if (store == null) {
            System.err.println(storeName + "를 찾지 못했습니다.");
            return;
        }
        store.printAllProduct();
    }

    // Department 에서 특정 물건의 개수를 만족하는 가게이름 출력하기
    public void searchDepartmentProductCount(int productCount) {
        for (int i = 0; i < stores.length; i++) {
            if (stores[i] == null) {
                continue;
            }
            stores[i].printEqualStoreProductCount(productCount);
        }
    }

    // Department 에서 특정 물건 검색하여 어떤 가게에 있는지 출력하기
    public void searchDepartmentProductName(String productName) {
        for (int i = 0; i < stores.length; i++) {
            if (stores[i] == null) {
                continue;
            }
            stores[i].printSearchStoreProductName(productName);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Department{" +
                "stores=" + Arrays.toString(stores) +
                ", name='" + name + '\'' +
                '}';
    }

    private Store findStoreOrNull(String storeName) {
        for (int i = 0; i < stores.length; i++) {
            if (stores[i] == null) {
                continue;
            }
            if (stores[i].isEqualStoreName(storeName)) {
                return stores[i];
            }
        }
        return null;
    }
}
