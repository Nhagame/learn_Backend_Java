abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void action();

    public void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public String getName() {
        return name.toLowerCase(); // For case-insensitive comparison
    }
}
