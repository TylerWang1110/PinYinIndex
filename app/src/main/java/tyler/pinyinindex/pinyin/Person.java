package tyler.pinyinindex.pinyin;

/**
 * @创建者 Tyler.
 * @创建时间 2016/11/7  11:16.
 * @描述 ${TODO}.
 */
public class Person implements Comparable<Person> {
    private String name;
    private char letter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public Person(String name, char letter) {
        this.name = name;
        this.letter = letter;
    }

    @Override
    public int compareTo(Person p) {
        return this.letter - p.letter;
    }
}
