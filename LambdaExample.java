public class LambdaExample {
    private static final String HELLO = "Hello World!";

    public static void main(String[] args) throws Exception {
        Runnable r = () -> {
			int i = 0;
			while( i++ < 10){
			    System.out.println(""+i+". "+HELLO);
			}
		};
        Thread t = new Thread(r);
        t.start();
        t.join();
        System.out.println("ljshdjkaehd");


    }
}