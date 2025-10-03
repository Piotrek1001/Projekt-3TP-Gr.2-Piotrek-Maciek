public class Student extends Person implements Srednia
{

    private int ocena1;
    private int ocena2;
    private int ocena3;
    private int ocena4;
    private int ocena5;
    private double srednia;

    public Student(int ocena1, int ocena2, int ocena3, int ocena4, int ocena5)
    {
        this.ocena1 = ocena1;
        this.ocena2 = ocena2;
        this.ocena3 = ocena3;
        this.ocena4 = ocena4;
        this.ocena5 = ocena5;
    }

    @Override
    public double liczSrednia()
    {
        srednia = (double) (ocena1 + ocena2 + ocena3 + ocena4 + ocena5) / 5;
        return srednia;
    }
}
