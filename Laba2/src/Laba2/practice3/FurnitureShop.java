package Laba2.practice3;

public class FurnitureShop {
    public static void main(String[] args){
        Bed bed1=new Bed("wonderful bed","black and blue",25000);
        Chair chair1=new Chair("amazing chair","black",10000);
        Table table1=new Table("cool table", "white", 15000);
        bed1.displayInfo();
        chair1.displayInfo();
        table1.displayInfo();
    }
}
