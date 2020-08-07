import java.util.Set;

public class Main {
    public static void main(String[] args) {
        TaskOne.readFileContent("src\\alice.txt");
        Set<String> resultSet = TaskOne.putTheArrayInSet();
        System.out.println("Unique words are: " + resultSet);
        System.out.println("Count of unique words: " + resultSet.size());
        TaskTwo.wordsCount();
    }
}
