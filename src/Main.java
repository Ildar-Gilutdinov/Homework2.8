import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    //    public static int maxSurnameWord = 3;//мин кол-ва слов в фамилии для проверки
    public static void main(String[] args) {
        System.out.println("Программа определения знатности людей");
        List<Person> people = new ArrayList<>();
        people.add(new Person("Стивинг", "Кинг ", 28));
        people.add(new Person("Джордж", "Ди Сисьвер Оушен Гу", 53));
        people.add(new Person("Лев", "Ди Лас Белинкин Ци", 67));
        people.add(new Person("Эрнест", "Ли Ванс Ган Хемингуэй", 42));

//        Comparator<Person> PersonComparatorSurnameNameAge = new Comparator<Person>() {
//            final int maxSurnameWord = 3;//мин кол-ва слов в фамилии для проверки
//            @Override
//            public int compare(Person p1, Person p2) {
//                int surname1 = p1.getSurname().split(" ").length; // разделяем фамилии на слова
//                int surname2 = p2.getSurname().split(" ").length; // разделяем фамилии на слова
//                if (Math.min(surname1, maxSurnameWord) != (Math.min(surname2, maxSurnameWord))) { //условие 1, сравниваем наших людей (3 -> maxSurnameWord)
//                    return Integer.compare(surname1, surname2);
//                }
//                return Integer.compare(p1.getAge(), p2.getAge()); // сравнение по возрасту;
//            }
//        };

        Comparator<Person> PersonComparatorSurnameNameAge2 = (p1, p2) -> {
            int surname1 = p1.getSurname().split(" ").length; // разделяем фамилии на слова
            int surname2 = p2.getSurname().split(" ").length; // разделяем фамилии на слова
            if (Math.min(surname1, 3) != (Math.min(surname2, 3))) {
                return Integer.compare(surname1, surname2);
            }
            return Integer.compare(p1.getAge(), p2.getAge()); // сравнение по возрасту;
        };
        //Collections.sort(people, PersonComparatorSurnameNameAge);
        Collections.sort(people, PersonComparatorSurnameNameAge2);
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println("Программа завершина");
    }
}
