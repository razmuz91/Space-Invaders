package SpacePackage.Klasser;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SpaceInvaders extends JFrame {

    public SpaceInvaders(){

        startUI();
    }

    private  void startUI(){

        add(new Brett());
        setTitle("Rasmus's Space Invaders");
        //setSize()

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new SpaceInvaders();
            ex.setVisible(true);
        });
    }
}
