public class Headmaster extends Person implements Payable
{
    private double stawkaNaGodz;
    private int godziny;
    private double premia = 0.0;

    public Headmaster(double stawkaNaGodz, int godziny, double premia)
    {
        this.stawkaNaGodz = stawkaNaGodz;
        this.godziny = godziny;
        this.premia = premia;
    }

    @Override
    public double calculateSalary()
    {
        double wyplata = stawkaNaGodz * godziny + premia;
        return wyplata;
    }
}
