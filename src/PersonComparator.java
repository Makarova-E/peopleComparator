import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    protected int wordCount;
    protected int wordCount2;
    protected int maxWordCount;

    public PersonComparator(int maxWordCount) {
        this.maxWordCount = maxWordCount;
    }

    @Override
    public int compare(Person o1, Person o2) {
        wordCount = o1.getSurname().split("-").length; //составные фамилии пишутся через дефис
        wordCount2 = o2.getSurname().split("-").length;
        if (wordCount > maxWordCount & wordCount > maxWordCount
                || wordCount == maxWordCount & wordCount2 == maxWordCount) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else if (wordCount == wordCount2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else {
            return Integer.compare(wordCount, wordCount2);
        }
    }
}
