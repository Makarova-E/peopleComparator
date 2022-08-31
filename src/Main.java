import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Vasya", "Vasilenko", 40));
        people.add(new Person("Ivan", "Mikluho-Maklay", 45));
        people.add(new Person("Anna", "Kovaleva-Sedova", 38));
        people.add(new Person("Oleg", "Dunin-Gunin-Van", 30));
        people.add(new Person("Kim", "Mahai-Ahalai-Balay", 25));
        people.add(new Person("Varan", "Kumar-Komar-Kabar", 20));

        people.sort(
                (Person p1, Person p2) -> {
                    int wordCount = p1.getSurname().split("-").length; //составные фамилии пишутся через дефис
                    int wordCount2 = p2.getSurname().split("-").length;
                    if (wordCount > 3 & wordCount > 3
                            || wordCount == 3 & wordCount2 == 3) {
                        return Integer.compare(p1.getAge(), p2.getAge());
                    } else if (wordCount == wordCount2) {
                        return Integer.compare(p1.getAge(), p2.getAge());
                    } else {
                        return Integer.compare(wordCount, wordCount2);
                    }
                });
        for (Person per : people) {
            System.out.println(per);
        }
    }
}
