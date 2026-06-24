import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TrafficLightSimulation extends JFrame implements ActionListener {
    JButton redButton, yellowButton, greenButton;
    String light = "";
    public TrafficLightSimulation() {
        setTitle("Traffic Light Simulation");
        setSize(300, 450);
        setLayout(new FlowLayout());
        redButton = new JButton("Red");
        yellowButton = new JButton("Yellow");
        greenButton = new JButton("Green");
        add(redButton);
        add(yellowButton);
        add(greenButton);
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton)
            light = "RED";
        else if (e.getSource() == yellowButton)
            light = "YELLOW";
        else if (e.getSource() == greenButton)
            light = "GREEN";
        repaint();
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.drawRect(100, 100, 80, 200);
        if (light.equals("RED"))
            g.setColor(Color.RED);
        else
            g.setColor(Color.LIGHT_GRAY);
        g.fillOval(115, 120, 50, 50);
        if (light.equals("YELLOW"))
            g.setColor(Color.YELLOW);
        else
            g.setColor(Color.LIGHT_GRAY);
        g.fillOval(115, 180, 50, 50);
        if (light.equals("GREEN"))
            g.setColor(Color.GREEN);
        else
            g.setColor(Color.LIGHT_GRAY);
        g.fillOval(115, 240, 50, 50);
    }
    public static void main(String[] args) {
        new TrafficLightSimulation();
    }
}
