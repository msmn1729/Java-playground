package _0515.instance;

public class Coffee {
    private String name = "커피";

    public Coffee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                '}';
    }
}
