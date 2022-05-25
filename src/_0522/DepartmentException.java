package _0522;

public class DepartmentException extends RuntimeException {
    private final String storeName;

    public DepartmentException(String message, String storeName) {
        super(message);
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }
}
