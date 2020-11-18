package rekrut;

public class Student implements Comparable<Student> {
    private String name;
    private int score;
    private String sth;

    public Student(String name, int score, String sth) {
        this.name = name;
        this.score = score;
        this.sth = sth;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public String getSth() {
        return sth;
    }

    @Override
    public int compareTo(Student o) {
        if (this.getScore() == o.getScore()) {
            return 0;
        } else if (this.getScore() > o.getScore()) {
            return 1;
        } else {
            return -1;
        }
    }
}
