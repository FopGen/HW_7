package org.example;

public class Level {
    public String title;
    private Level(String title){
        this.title = title;
    }
    public static Level TRAINEE = new Level("Trainee");
    public static Level JUNIOR = new Level("Junior");
    public static Level MIDDLE = new Level("Middle");
    public static Level SENIOR = new Level("Senior");
}
