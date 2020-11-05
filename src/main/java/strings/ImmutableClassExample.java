package strings;

public final class ImmutableClassExample {
    private final int x;
    private final String str;
    private final MutableClassExample mce;

    // NO SETTERS!

    // GETTERS - defensive copy only!
    public ImmutableClassExample(int x, String str, MutableClassExample mce) {
        this.x = x;
        this.str = str;
        this.mce = mce;
    }

    public int getX() {
        return x;
    }

    public String getStr() {
        return str;
    }

    // classic Getter of mutable class field - do not use it if you want to create immutable class
//
//    public MutableClassExample getMce() {
//        return mce;
//    }

    // create getter with DEFENSIVE COPY
    public MutableClassExample getMce() {
        return new MutableClassExample(this.mce.getX(), this.getStr());
    }
}
