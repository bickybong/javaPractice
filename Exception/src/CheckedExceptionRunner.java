public class CheckedExceptionRunner {
    public static void main(String[] args) {
//        try {
//            Thread.sleep(1000);
//        } catch(InterruptedException e){
//            e.printStackTrace();
//        }
    }

    private static void otherMethod() throws InterruptedException {
        Thread.sleep(2000);
    }

}
