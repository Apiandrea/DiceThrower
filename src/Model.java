import java.security.SecureRandom;

public class Model {
    SecureRandom gen = new SecureRandom();

    private int counter = 0;
    private int result;
    private int even;
    private int odd;

    public Model(int result, int even, int odd){
        this.result = result;
        this.even = even;
        this.odd = odd;
    }

    public int getResult() {
        return result;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getEven() {
        return even;
    }

    public void setEven(int even) {
        this.even = even;
    }

    public int getOdd() {
        return odd;
    }

    public void setOdd(int odd) {
        this.odd = odd;
    }

    public void throwDice()
    {
        int x = Math.abs((gen.nextInt(6))+1);

        if(x % 2 == 0)
            this.even++;
        else
            this.odd++;

        this.counter++;
        this.result = x;
    }

    public void reset()
    {
        this.odd = 0;
        this.even = 0;
        this.result = 0;
        this.counter = 0;
    }
}
