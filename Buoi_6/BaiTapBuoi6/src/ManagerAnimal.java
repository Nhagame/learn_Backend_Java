import java.util.ArrayList;
import java.util.Scanner;
class ManagerAnimal {
    private ArrayList<Animal> animals;

    public ManagerAnimal() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void displayAllAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No animals in the zoo.");
        } else {
            System.out.println("List of animals in the zoo:");
            for (Animal animal : animals) {
                animal.showInfo();
            }
        }
    }

    public void searchAnimalByName(String name) {
        boolean found = false;
        for (Animal animal : animals) {
            if (animal.getName().equals(name.toLowerCase())) {
                animal.showInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Animal not found.");
        }
    }

    public void removeAnimalByName(String name) {
        Animal toRemove = null;
        for (Animal animal : animals) {
            if (animal.getName().equals(name.toLowerCase())) {
                toRemove = animal;
                break;
            }
        }
        if (toRemove != null) {
            animals.remove(toRemove);
            System.out.println("Animal removed successfully.");
        } else {
            System.out.println("Animal not found.");
        }
    }
}