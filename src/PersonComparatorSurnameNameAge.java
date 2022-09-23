import java.util.Comparator;

public class PersonComparatorSurnameNameAge implements Comparator<Person> {

    private int maxSurnameWords;

    public PersonComparatorSurnameNameAge(int maxSurnameWords) {
        this.maxSurnameWords = maxSurnameWords;
    }


    @Override
    public int compare(Person p1, Person p2) {
        int surname1 = p1.getSurname().split(" ").length;
        int surname2 = p2.getSurname().split(" ").length;
//        if (Math.min(surname1, maxSurname) != (Math.min(surname2, maxSurname))) {
        if ((surname1 >= maxSurnameWords) != (surname2 >= maxSurnameWords)) {
            return Integer.compare(surname1, surname2);
        }
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}
