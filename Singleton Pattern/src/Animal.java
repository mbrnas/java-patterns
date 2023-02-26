public class Animal {
    private static Animal instance;

    private Animal() {
    
    }

    public static Animal getInstance() {
        if (instance == null) {
            instance = new Animal();
        }
        return instance;
    }

    public void makeSound() {
        System.out.println("Animal making a sound!");
    }
}
