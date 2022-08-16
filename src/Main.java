import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Vasya", "Vasilenko", 40));
        people.add(new Person("Ivan", "Mikluho-Maklay",  45));
        people.add(new Person("Anna", "Kovaleva-Sedova", 38));
        people.add(new Person("Oleg", "Dunin-Gunin-Van", 30));
        people.add(new Person("Kim", "Mahai-Ahalai-Balay", 25));
        people.add(new Person("Varan", "Kumar-Komar-Kabar", 20));

        Collections.sort(people, new PersonComparator(3));
        for (Person per: people) {
            System.out.println(per);
        }
    }
}
