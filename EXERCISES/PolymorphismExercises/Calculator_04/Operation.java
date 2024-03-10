package PolymorphismExercises.Calculator_04;

public interface Operation {
    void addOperand(int operand); // тук добяме числото
    int getResult(); // тук поп-ваме или греша?
    boolean isCompleted();

}
