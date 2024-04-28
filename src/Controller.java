import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private View view;
    private Model model;

    public Controller(Model model, View view){
        this.view = view;
        this.model = model;
    }

    public void assingManagers()
    {
        view.getBtnReset().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.reset();
                view.setEven(model.getEven());
                view.setOdd(model.getOdd());
                view.setResult(model.getResult());
                view.getHistory().setText("History: ");
            }
        });

        view.getBtnThrow().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.throwDice();
                view.setResult(model.getResult());
                view.setOdd(model.getOdd());
                view.setEven(model.getEven());
                view.getHistory().append("\n" + "Throw n." + String.valueOf(model.getCounter()) + ": " + String.valueOf(model.getResult()));
            }
        });
    }
}
