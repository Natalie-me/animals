public class Dog extends Animal {
    String size;

    public Dog(String size, String name, int age, String type) throws Exception {
        super(name, age, type);
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }

    @Override
    public void voice() {
        System.out.println("Ruff");
    }

    @Override
    public void walkingManner() {
        System.out.println("Run");
    }
}
