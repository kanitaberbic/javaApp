package ba.smoki.six;

import javax.swing.*;

public class TableDemo {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtilities.invokeLater(TableDemo::createAndShowGUI);
    }

    static void createAndShowGUI(){
       // PlayerPanel playerPanel = new PlayerPanel ();
        //JFrame frame = new JFrame(" ");
       // frame.setContentPane(playerPanel);
        JFrame frame = new JFrame(" TableDemo");
        TableDemo tableDemo = new TableDemo();
        frame.pack();
        frame.setVisible(true);
    }
}
