public class Animal extends AnimalBase implements AnimalInterface {
    private String name;
    private int age;
    String type;

    public Animal(String name, int age, String type) throws Exception {
        validateName(name);
        validateAge(age);
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getType() {
        return this.type;
    }

    public String setType() {
        return this.type;
    }

    public String setName(String name) throws Exception {
        validateName(name);
        return name;
    }

    public void setAge(int age) throws Exception {
        validateAge(age);
    }



    @Override
    public void voice() {
        System.out.println("Roar");
    }

    @Override
    public void walkingManner() {
        System.out.println("Walk");
    }

    private void validateAge(int age) throws Exception {
        if (age >= 0 && age <= 30) {
            this.age = age;
        } else {
            throw new Exception("Age " + age + " is incorrect. Please enter the number from 0 to 30");
        }
    }

    private void validateName(String name) throws Exception {
        if (name.length() <= 20) {
            this.name = name;
        } else {
            throw new Exception("Age " + age + " is incorrect. Please enter the number from 0 to 30");
        }
    }
}
