
public class LetterPrinter {


    public void methodA() {
        for (int i = 0; i < 5; i++) {
            System.out.print("A ");
        }
        System.out.println();
    }


    public void methodB() {
        for (int i = 0; i < 5; i++) {
            System.out.print("B ");
        }
        System.out.println();
    }


    public void methodC() {
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                System.out.print("C ");
            } else {
                System.out.print("D ");
            }
        }
        System.out.println();
    }


    public void methodD() {
        for (char letter = 'Z'; letter >= 'V'; letter--) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }
}


