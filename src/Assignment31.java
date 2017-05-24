class Assignment31 implements Runnable {

	public static void main(String[] args)
	{
		
	}
    private static final int LIMIT = 20;
    private static volatile int counter = 0;
    private int id;

    public Assignment31(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        outer:
        while(counter < LIMIT) {
            //while (counter % NB_THREADS != id) {
                if(counter == LIMIT) break outer;
            }
            System.out.println("Thread "+Thread.currentThread().getName()+ " printed " + counter);
            counter += 1;
        }
    }
