public class ExceptionRunner {
    public static void main(String[] args) {
        method2();
        System.out.println("Main ended");
    }

    private static void method2() {
        method1();
        System.out.println("Method2 ended");
    }

    private static void method1() {
        try {
//            String str = null;
//            str.length();
            int[] i = {2,3};
            int number = i[3];
            System.out.println("Method1 ended"); // not executed
        } catch (NullPointerException ex){ //more specific exeption
            System.out.println("NullPointer Exception");
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("General Exception");
            ex.printStackTrace(); //shows exception
        }

    }
}
