public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Задание1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задание2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задание3");
        var dog1 = 8.0;
        dog1 = dog1 - 3.5;
        System.out.println(dog1);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задание4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        System.out.println("Задание5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        System.out.println("Задание6");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        System.out.println("Общий вес" + (boxerWeight2 + boxerWeight1));
        System.out.println("Разница в весе" + (boxerWeight2 - boxerWeight1));

        System.out.println("Задание7");
        System.out.println("Разница в весе (1)" + (boxerWeight2 - boxerWeight1));
        System.out.println("Разница в весе (2)" + (boxerWeight2 % boxerWeight1));

        System.out.println("Задание8");
        var totalHours = 640;
        var hoursDay = 8;
        var Emp = totalHours / hoursDay;
        System.out.println("Всего работников в компании - " + Emp + (" человек"));

        Emp += 94;
        totalHours = Emp * hoursDay;
        System.out.println("Если в компании работает " + Emp + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками ");

    }
}
