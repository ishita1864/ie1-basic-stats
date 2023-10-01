
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class MaxView implements View {

    // Instance variables
    double max;
    JTextField jtfMax;
    String name;

    public MaxView() {
        max = 0;
        jtfMax = new JTextField(5);
        jtfMax.setEditable(false);
        name = "Maximum";
    }

    @Override
    public void update(ArrayList<Double> numbers) {
        if (!numbers.isEmpty()) {
            max = MinMaxCalculation.max(BasicStats.getArrayDouble(numbers));
            jtfMax.setText("" + max);
        }
    }

    @Override
    public void reset() {
        jtfMax.setText("");
    }

    @Override
    public JTextComponent show() {
        return jtfMax;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getMax() {
        return max;
    }
}
