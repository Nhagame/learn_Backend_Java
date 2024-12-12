class Monkey extends Animal {
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println("The monkey is climbing trees.");
    }
}