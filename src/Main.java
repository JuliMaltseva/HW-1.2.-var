public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println ("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 2 (+4)
        System.out.println ("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        // Задача 3 (-3.5; -1.6; -7639)
        System.out.println ("Задача 3");
        dog-=3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper-=7639;
        System.out.println(paper);

        // Задача 4 (+2; /7)
        System.out.println ("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задача 5 (*10; /3.5; +4)
        System.out.println ("Задача 5");
        var frog = 3.5;
        System.out.println (frog);
        frog = frog * 10;
        System.out.println (frog);
        frog = frog / 3.5;
        System.out.println (frog);
        frog+=4;
        System.out.println (frog);

        // Задача 6 (78,2; 82.7;)
        System.out.println ("Задача 6");
        var weightBoxerOne = 78.2;
        System.out.println("Вес первого боксера " + weightBoxerOne + " кг");
        var weightBoxerSecond = 82.7;
        System.out.println("Вес второго боксера " + weightBoxerSecond + " кг");
        var weightDifference = weightBoxerOne - weightBoxerSecond;
        System.out.println("разница между весами бойцов " + weightDifference + " кг");

        // Задача 7
        System.out.println ("Задача 7");
        var advantageVarOne = weightBoxerSecond - weightBoxerOne;
        System.out.println("Второй боксер превышает первого на " + advantageVarOne + " кг");
        var advantageVarTwo = (weightBoxerOne + weightBoxerSecond) % weightBoxerOne;
        System.out.println("Перевес между боксерами составляет " + advantageVarTwo + " кг");

        // Задача 8
        System.out.println ("Задача 8");
        var totalWorkTime = 640;
        System.out.println(totalWorkTime);
        var workingTimePerEmployee = 8;
        System.out.println(workingTimePerEmployee);
        var totalEmployees = totalWorkTime / workingTimePerEmployee;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек");
        var NewTotalEmployees = totalEmployees + 94;
        System.out.println(NewTotalEmployees);
        var NewTotalWorkTime = NewTotalEmployees * workingTimePerEmployee;
        System.out.println("Если в компании работает " + NewTotalEmployees+ " человек, то всего " + NewTotalWorkTime + " часа работы может быть поделено между сотрудниками.");






    }
}