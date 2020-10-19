package InitializationBlocks;

public class Blocks {

    {
        System.out.println("Initialization block");
    }

    static {
        System.out.println("Static block");
    }

    Blocks() {
        System.out.println("Constructor");
    }


    public static void main(String[] args) {
        Blocks block = new Blocks();
//        ORDER OF EXECUTION:

//        Static block
//        Initialization block
//        Constructor

    }
}
