import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Программа определения знатности людей");
        List<Person> people = new ArrayList<>();
        people.add(new Person("Стивинг", "Кинг ", 28));
        people.add(new Person("Джордж", "Ди Сисьвер Оушен Гу", 53));
        people.add(new Person("Лев", "Ди Лас Белинкин Ци", 67));
        people.add(new Person("Эрнест", "Ли Ванс Ган Хемингуэй", 42));

        Collections.sort(people, new PersonComparatorSurnameNameAge(3));
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println("Программа завершина");
    }
}
