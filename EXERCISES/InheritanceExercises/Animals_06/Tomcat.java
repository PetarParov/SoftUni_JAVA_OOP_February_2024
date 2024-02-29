package InheritanceExercises.Animals_06;

public class Tomcat extends Cat{
    private final static String genderKitten = "Male";
    public Tomcat(String name, int age) {
        super(name, age, genderKitten);
    }

    @Override
    public String produceSound() {
        return "MEOW";
    }
}