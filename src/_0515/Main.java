package _0515;

public class Main {
    public static void main(String[] args) {
        Department department = new Department("롯데타워");
        department.addStore("엘지");
        department.addProduct("엘지", "TV");
        department.addProduct("엘지", "phone");

        department.addStore("삼성");
        department.addProduct("삼성", "모니터");
        department.addProduct("삼성", "phone");
        System.out.println(department);

        System.out.println();
        department.departmentSearchProduct("TV");
        System.out.println();
        department.departmentSearchProduct("phone");
        System.out.println();
        department.departmentSearchProduct("모니터");
    }
}
