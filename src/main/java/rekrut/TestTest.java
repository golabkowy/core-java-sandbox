package rekrut;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestTest {

    public static Predicate<Student> predicate1(int score) {
        return student -> student.getScore() >= score;
    }

    public static Predicate<Student> predicate2(String sth) {
        return student -> student.getSth().equals(sth);
    }

    public static List<String> studentsThatPass(Stream<Student> students, int passingScore, String sth) {
        return students.
                sorted().
                filter(predicate1(passingScore)
                        .and(predicate2(sth)))
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();

        students.add(new Student("MikeX", 80, "x"));
        students.add(new Student("MikeY", 80, "y"));
        students.add(new Student("JamesX", 57, "x"));
        students.add(new Student("JamesY", 57, "y"));
        students.add(new Student("Alan", 21, "A"));

        studentsThatPass(students.stream(), 50, "x").forEach(System.out::println);
    }
}
