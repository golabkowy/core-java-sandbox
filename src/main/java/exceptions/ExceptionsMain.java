package exceptions;

public class ExceptionsMain {

    //keywords:
    // throws - kiedy metoda w sygnaturze rzuca wyjątek
    // try catch - bloki do obsługi wyjątków
    // try witch resources


    // hierarchia jest taka

    // CHECKED exceptions:
    // to takie ktore rzucają jawnie metody za pomocą throws, da sie je obsłużyć i kontynuować działanie programu,
    // jeśli nie obsłużymy takiego wyjątku to program wysypie się juz na etapie kompilacji, w IDE podpowiada nam, ze musimy dodac throws do kolejnej metody, która uzywa tej rzucającej
    //lub otoczyć w try catch

    // UNCHECKED
    // wyjątki, które nie są sprawdzane na etapie kompilacji
    // Error oraz RuntimeExceptions są UNCHECKED, wszystko pozostałe pod "throwable jest checked

    // JAVA DOC GUIDE
    // If a client can reasonably be expected to recover from an exception, make it a checked exception. If a client cannot do anything to recover from the exception, make it an unchecked exception


    // TESTS:
    // so it has to be checked exception / a jednak niekoneicznie?
    public static void methodThrowsUncheckedException(int x) throws CustomUncheckedExceptionA {
        if (x == 0) {
            throw new CustomUncheckedExceptionA();
        } else {
            System.out.println("It works, so argument is fine");
        }
    }

    public static void methodThrowsException(int x) throws CustomCheckedException {
        if (x == 0) {
            throw new CustomCheckedException();
        } else {
            System.out.println("It works, so argument is fine");
        }
    }


    public static void main(String[] args) {
        try {
            methodThrowsUncheckedException(1);
        } catch (CustomUncheckedExceptionA e) {
            e.printStackTrace();
        }

        // Ok to może inaczej, która z metod wymaga try catch albo sygnatury throws w zalezności od wyjątku

        try {
            methodThrowsException(0);   // i to wymaga sprawdzania!!! try-catch or throws na maina
        } catch (CustomCheckedException e) {
            e.printStackTrace();
        }

        methodThrowsUncheckedException(0); //  a to już nie ;)
    }
}
