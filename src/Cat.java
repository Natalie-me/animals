public class Cat extends Animal {

    String colour;

    public Cat(String colour, String name, int age, String type) throws Exception {
        super(name, age, type);
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }

    @Override
    public void voice() {
        System.out.println("Mew");
    }

    @Override
    public void walkingManner() {
        System.out.println("Sneak");
    }
}
