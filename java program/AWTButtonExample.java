
import java.awt.*;  
import java.awt.event.*;

public class AWTButtonExample {
    public AWTButtonExample() {
        // Create a new frame
        Frame frame = new Frame("AWT Button Example");

        // Create a button
        Button button = new Button("Click Me");

        // Set button position on frame
        button.setBounds(100, 100, 80, 30);

        // Add button to frame
        frame.add(button);

        // Frame properties
        frame.setSize(300, 200); // width and height
        frame.setLayout(null);   // no layout manager
        frame.setVisible(true);  // make frame visible

        // Close the frame when window is closed
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose(); // close the frame
            }
        });
    }

    public static void main(String[] args) {
        new AWTButtonExample();
    }
}
