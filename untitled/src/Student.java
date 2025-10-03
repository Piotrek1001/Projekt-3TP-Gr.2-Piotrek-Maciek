import java.util.List;

public class Student extends Person implements Srednia
{

    private List<Integer> oceny;
    private double srednia;

    public Student(List<Integer> oceny)
    {
        this.oceny = oceny;
    }

    @Override
    public double liczSrednia()
    {
        int x = 5;
        int wyjmijZListy = 0;
        for(int i = 0; i < x; i++)
        {
            oceny.get(i) += wyjmijZListy;
            srednia = (double) wyjmijZListy / 5;
            return srednia;
        }
    }

    public String czyZdaje()
    {
        if(srednia > 1.75)
        {
            return "Uczeń zdaje";
        }
        else
        {
            return "Uczeń nie zdaje";
        }
    }
}
