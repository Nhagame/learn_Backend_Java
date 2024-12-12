import java.util.ArrayList;
import java.util.List;

class ManagerAnimal {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAllAnimals() {
        for (Animal animal : animals) {
            animal.showInfo();
            animal.action();
        }
    }

    public void findAnimalByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                animal.showInfo();
                animal.action();
                return;
            }
        }
        System.out.println("Animal not found.");
    }

    public void removeAnimalByName(String name) {
        boolean removed = animals.removeIf(animal -> animal.getName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Animal removed.");
        } else {
            System.out.println("Animal not found.");
        }
    }
}
