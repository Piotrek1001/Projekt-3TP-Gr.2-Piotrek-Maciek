public class Main {
    public static void main(String[] args) {
        //Freelancer f = new Freelancer(100, 30);
        //System.out.println("Wynagrodzenie: " + f.calculateSalary());

        Student Maciek = new Student(2, 3, 5, 4, 2);
        System.out.println("Srednia ocen: " + Maciek.liczSrednia());

        Student Biktor = new Student(1, 2, 1, 1, 2);
        System.out.println("Srednia ocen: " + Biktor.liczSrednia());

        Student Gejcys = new Student(6, 9, 6, 7, 2);
        System.out.println("Srednia ocen: " + Gejcys.liczSrednia());

        Teacher Oliwier = new Teacher(30.50, 160, 200);
        System.out.println("Wynagrodzenie nauczyciela: " + Oliwier.calculateSalary());

        Teacher Ptak = new Teacher(50.50, 200, 11200);
        System.out.println("Wynagrodzenie nauczyciela: " + Ptak.calculateSalary());

        Teacher Grzybek = new Teacher(20.50, 80, 4200);
        System.out.println("Wynagrodzenie nauczyciela: " + Grzybek.calculateSalary());

        Headmaster Malpka = new Headmaster(1120.50, 12, 1467200);
        System.out.println("Wynagrodzenie Dyrektora: " + Malpka.calculateSalary());

        Staff Wieśek = new Staff(1.50, 400, -540);
        System.out.println("Wynagrodzenie Wieśka tego konfidenta z Płocka: " + Wieśek.calculateSalary());
    }
}
