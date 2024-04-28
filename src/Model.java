import java.security.SecureRandom;

public class Model {
    SecureRandom gen = new SecureRandom();
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

    public void setResult(int result) {
        this.result = result;
    }

    public int getEven() {
        return even;
    }

    public void setEve(int even) {
        this.even = even;
    }

    public int getOdd() {
        return odd;
    }

    public void setOdd(int odd) {
        this.odd = odd;
    }

    public int throwDice()
    {
        return Math.abs(gen.nextInt()%6+1);
    }

    public void reset()
    {
        this.odd = 0;
        this.even = 0;
        this.result = 0;
    }
}
