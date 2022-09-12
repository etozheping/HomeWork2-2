public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var allTimeWork = 640; //Общее время работы поделенное на всех сотрудников
        var TimeWork = 8; //Время потраченное одним сотрудником
        var Worker = allTimeWork / TimeWork; //Работники = общее время работы / время потраченное одним сотрудником
        System.out.println("Всего работников в компании – " + Worker + " человек");

        Worker = Worker + 94;
        allTimeWork = Worker * TimeWork;
        System.out.println("Если в компании работает "+ Worker + " человек, то всего " + allTimeWork + " часов работы может быть поделено между сотрудниками");






    }
}