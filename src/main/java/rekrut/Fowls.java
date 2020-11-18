package rekrut;


import java.util.concurrent.Callable;

interface Fowl {
    Egg lay();
}

class Hen implements Fowl{
    public Hen() {
    }


    public static void main(String[] args) throws Exception {
        Hen hen = new Hen();
        System.out.println(hen instanceof Fowl);
    }

    @Override
    public Egg lay() {
        return null;
    }
}

class Egg {
    public Egg(Callable<Fowl> createFowl) {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public Fowl hatch() throws Exception {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }
}
