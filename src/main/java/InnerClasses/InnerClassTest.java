package InnerClasses;

public class InnerClassTest {

    static class ClassInnerPackageStatic {
        public static Character character = 'A';
        public static Integer integer = 5;
        public static void test(){
            System.out.println("inside inner package static");
        }
    }

    class ClassInnerPackage{
        public Character character = 'A';
        public Integer integer = 5;
        public void test(){
            System.out.println("inside inner package");
        }
    }

    public static class ClassInnerPublicStatic {
        public static Character character = 'A';
        public static Integer integer = 5;
        public static void test(){
            System.out.println("inside inner public static");
        }
    }

    public class ClassInnerPublic{
        public Character character = 'A';
        public Integer integer = 5;
        public void test(){
            System.out.println("inside inner public");
        }
    }

    private class ClassInnerPrivate{
        private Character character = 'A';
        private Integer integer = 5;
        private void test(){
            System.out.println("inside inner private");
        }
    }

    private static class ClassInnerPrivateStatic{
        private static Character character = 'A';
        private static Integer integer = 5;
        private static void test(){
            System.out.println("inside inner private static");
        }
    }


    public static void main(String[] args) {
        // all classes visible here
//        ClassInner

    }
}
