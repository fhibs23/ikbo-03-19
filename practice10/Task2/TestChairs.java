package ru.mirea.practice10.Task2;

public class TestChairs {
    public static void main(String[] args) {
        Client client = new Client();
        client.setChair(new ChairFactory().createFunctionalChair());
        client.sit();
        client.setChair(new ChairFactory().createVictorianChair());
        client.sit();
        client.setChair(new ChairFactory().createMagicanChair());
        client.sit();
    }
}
