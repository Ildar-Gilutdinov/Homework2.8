import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Программа определения знатности людей");
        List<Person> people = new ArrayList<>();
        people.add(new Person("Стивинг", "Кинг ", 15));
        people.add(new Person("Джордж", "Ди Сисьвер Оушен Гу", 17));
        people.add(new Person("Лев", "Ди Лас Белинкин Ци", 67));
        people.add(new Person("Эрнест", "Ли Ванс Ган Хемингуэй", 42));


        Predicate<Person> predicate = person -> person.getAge() < 18;
        people.removeIf(predicate);
        System.out.println(people);

        System.out.println("Программа завершина");

    }
}
