import java.util.Scanner;
import java.util.Random;

public class Person
{
    protected static String imie;
    protected int wiek;
    protected int ID;

    public void Person (String imie, int wiek, int ID)
    {
        this.imie = imie;
        this.wiek = wiek;
        this.ID = ID;
    }
}