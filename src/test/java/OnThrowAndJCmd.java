public class OnThrowAndJCmd {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        try {
            throw new Ex("");
        } catch (Ex e) {
            System.out.println("Caught");
        }
        try {
            throw new Ex("");
        } catch (Ex e) {
            System.out.println("Caught");
        }
        for (int i = 0; i < 1000; i++) {
            System.out.print(i + " ");
            Thread.sleep(2000);
        }
    }
}

class Ex extends RuntimeException {
    public Ex(String msg) {
        super(msg);
    }
}