package strings;

// make class final so, it cannot be extended

public final class StringImmutabilityProve {
    public static void main(String[] args) {


        final String x = "asd";
        final MutableClassExample mutalbeClassInstance = new MutableClassExample(5, "Szynom");
//        mutalbeClassInstance = new MutableClassExample(5,"asasd");  // error, so unchecked exception - not required to check it, it will not allows application to start
        // but it is not a problem to change value of mutable class fields

        mutalbeClassInstance.setStr("asd");
        mutalbeClassInstance.setX(1);

        ImmutableClassExample lolo = new ImmutableClassExample(5, "asd", new MutableClassExample(3, "asdasd"));
        System.out.println(lolo.getMce().getX());
        System.out.println(lolo.getMce().getStr());
        // And this is why it is necessary to make "DEFENSIVE COPY" within immutable class Getter methods.
        lolo.getMce().setX(1);  //immutability broken!
        lolo.getMce().setStr("immutability broken!");

        System.out.println(lolo.getMce().getX());
        System.out.println(lolo.getMce().getStr());
    }
}
