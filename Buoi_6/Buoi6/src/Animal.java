abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Phương thức trừu tượng
    public abstract void action();

    // Hiển thị thông tin chi tiết của động vật
    public void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
