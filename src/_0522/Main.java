package _0522;

public class Main {
    public static void main(String[] args) {
//        System.out.println(testSearchDepartmentProductCount());
        System.out.println(testAddProduct());
    }

    public static Department testAddStore() {
        Department department = new Department("롯데타워");
        department.addStore("삼성");
//        department.addStore("엘지");

        try {
            department.addStore("현대");
        } catch (DepartmentException | StoreException e) {
            if (e instanceof DepartmentException) {
                DepartmentException de = (DepartmentException) e;
                de.getStoreName();
            }
//            e.printStackTrace();
//            System.err.println(e.getStoreName());
            throw e;
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            throw e;
        }
        return department;
    }

    public static Department testAddProduct() {
        Department department = testAddStore();
        department.addProduct("삼성", "TV");
        department.addProduct("삼성", "냉장고");
        department.addProduct("엘지", "폰");
        department.addProduct("엘지", "TV");
        department.addProduct("엘지", "폰3");
        department.addProduct("엘지", "폰4");
        department.addProduct("현대", "차");
        return department;
    }

    public static Department testSearchStore() {
        Department department = new Department("롯데타워");

        department.addStore("삼성");
        department.addStore("엘지");
        department.addProduct("삼성", "TV");
        department.addProduct("삼성", "냉장고");
        department.addProduct("엘지", "폰");
        department.addProduct("엘지", "TV");
        department.addProduct("엘지", "폰3");
//        department.searchDepartmentProductName("TV");
//        department.searchDepartmentProductName("냉장고");
//        department.searchDepartmentProductName("차");
        return department;
    }

    public static Department testSearchStoreProductList() {
        Department department = testSearchStore();
//        department.searchStoreProductList("삼성");
//        department.searchStoreProductList("엘지");
//        department.searchStoreProductList("현대");
        return department;
    }

    public static Department testSearchDepartmentProductCount() {
        Department department = testSearchStoreProductList();
//        department.searchDepartmentProductCount(2);
//        department.searchDepartmentProductCount(3);
        department.searchDepartmentProductCount(4);
        return department;
    }
}
