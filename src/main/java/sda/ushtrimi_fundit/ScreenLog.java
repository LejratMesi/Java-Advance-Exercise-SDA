package sda.ushtrimi_fundit;


public class ScreenLog implements Runnable {

    public Rezultati result;

    public ScreenLog(Rezultati result) {
        this.result = result;
    }


    @Override
    public void run() {
        while (true) {
            System.out.println("Emri i Screenit :  " + Thread.currentThread().getName());
            int[] values = result.readResult();
            for (int i = 0; i < values.length; i++) {
                System.out.print("result -- " + i + "--" + values[i] );
            }
            System.out.println();
        }
    }
}