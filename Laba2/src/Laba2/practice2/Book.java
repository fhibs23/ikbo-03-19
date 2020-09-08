package Laba2.practice2;

public class Book {
    private String author;
    private String name;
    private int year;
    private String color;
    public Book(){
        name="";
        author="";
        year=0;
        color="";
    }
    public Book(String author,String name, int year, String color)
    {
        this.name=name;
        this.author=author;
        this.year=year;
        this.color=color;
    }
    public void setAuthor(String author){
        this.author=author;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
