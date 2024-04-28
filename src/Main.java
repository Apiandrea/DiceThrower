public class Main {
    public static void main(String[] args)
    {
        View v = new View();
        Model m = new Model(0, 0, 0);
        Controller c = new Controller(m, v);
        c.assingManagers();
    }
}