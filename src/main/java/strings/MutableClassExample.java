package strings;

public class MutableClassExample {
    public int x;
    public String str;

    public MutableClassExample(int x, String str) {
        this.x = x;
        this.str = str;
    }

    public int getX() {
        return x;
    }

    public String getStr() {
        return str;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
