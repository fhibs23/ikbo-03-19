package ru.mirea.practice10.Task2;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair();
    public MagicChair createMagicanChair();
    public FunctionalChair createFunctionalChair();

}
