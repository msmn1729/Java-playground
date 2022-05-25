package _0515;

public class Department {
    private String name;
    private Store[] stores = new Store[3];
    private int index = 0;

    public Department(String name) {
        if (name == null) {
            throw new RuntimeException("이름이 null이면 안됩니다");
        }
        this.name = name;
    }

    public void departmentSearchProduct(String productName) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < stores.length; i++) {
            if (stores[i] == null) {
                continue;
            }
            if (stores[i].isNotStoreSearchProduct(productName)) {
                continue;
            }
            builder.append(stores[i].getName()).append(", ");
        }

        System.out.println(builder.toString());
    }

    public void addStore(String name) {
        if (stores.length <= index) {
            System.err.println("인덱스 초과");
            return;
        }
        if (name == null) {
            System.err.println("이름이 null");
            return;
        }
        Store store = new Store(name);
        stores[index++] = store;
    }

    public void addProduct(String storeName, String productName) {
        for (int i = 0; i < stores.length; i++) {
            if (stores[i] == null) {
                continue;
            }
            if (stores[i].isStoreName(storeName)) {
                stores[i].addProduct(productName);
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", stores=" + toArrayString() +
                '}';
    }

    private String toArrayString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i < stores.length; i++) {
            builder.append("\n  ");
            if (stores[i] == null) {
                builder.append("null");
            } else {
                builder.append(stores[i].toString());
            }

            builder.append(",");
        }

        builder.append("\n]");
        return builder.toString();
    }
}
