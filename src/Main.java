public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var BoxerWeight1 = 78.2; // Вес боксера 1
        var BoxerWeight2 = 82.7; // Вес боксера 2
        //var allWeightBoxer = BoxerWeight2 + BoxerWeight1; // allWeightBxer - общий вес боксеров

        //Решение 6 задания
        //System.out.println("Общий вес бойцов " + allWeightBoxer + " кг");
        //var differenceWeightBoxer = BoxerWeight2 - BoxerWeight1;
        //System.out.println("разница в весе у бойцов " + differenceWeightBoxer + " кг");

        //Решение 7 задания
        //var differenceWeightBoxer = (BoxerWeight2 - BoxerWeight1) % allWeightBoxer; // differenceWeightBoxer - разница в весе боксёров.
        //System.out.println("разница в весе у бойцов " + differenceWeightBoxer + " кг!");

        var differenceWeightBoxer = BoxerWeight2 - BoxerWeight1;
        System.out.println("Разница в весе у бойцов " + differenceWeightBoxer + " кг!");



    }
}