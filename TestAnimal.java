public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry animalRegistry = new AnimalRegistry();

        Animal sheep = animalRegistry.createSheep("Shaun");
        Animal cow = animalRegistry.createCow();
        Animal horse = animalRegistry.createHorse();

        sheep.makeSound();
        cow.makeSound();
        horse.makeSound();
      
    }
}