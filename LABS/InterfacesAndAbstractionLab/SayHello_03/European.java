package InterfacesAndAbstractionLab.SayHello_03;

public class European implements Person{
    private String name;

    public European(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}