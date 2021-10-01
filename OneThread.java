public class OneThread {
    static int books = 10000;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        Sister Alice = new Sister();
//        Thread myThread = new Thread(Alice);

//        myThread.start();
        while (books >= 0) {
            System.out.println("Я взял книгу");

            Test3.getBook();
            if (books == 0) break;
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }
    static void getBook() {
        if (books > 0) books--;
        else System.out.println("Все книги собраны!");

    }

//    static class Sister implements Runnable {
//
//        @Override
//        public void run() {
//
//            while (!interrupted()) {
//
//                System.out.println("Алиса взяла книгу");
//                getBook();
//                if (books == 0) break;
//            }
//        }
//    }
}
