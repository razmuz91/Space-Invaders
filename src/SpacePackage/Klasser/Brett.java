package SpacePackage.Klasser;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Brett extends JPanel {

    private Dimension d;
    private List<Aliens> alienListe;
    private int retning = -1;
    private int død = 0;
    private boolean iSpill = true;

    private Timer timer;

    public Brett(){

        startBrett();
        startSpill();
    }

    private void startBrett(){

        addKeyListener(new TAdapter());
        setFocusable(true);
        d = new Dimension(Lv1.BRETT_BREDDE, Lv1.BRETT_HØYDE);
        setBackground(Color.black);

        timer = new Timer(Lv1.DELAY, new GameCycle());
        timer.start();
    }

    private void startSpill(){

        alienListe = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {

                Aliens alien = new Aliens(Lv1.ALIEN_INIT_X + 18 * j,
                        Lv1.ALIEN_INIT_Y + 18 * i);
                alienListe.add((alien));
            }
        }
    }

    private void drawAliens(Graphics g) {

        for (Aliens alien : alienListe) {

            if (alien.isVisible()) {

                g.drawImage(alien.getBilde(), alien.getX(), alien.getY(), this);
            }

            if (alien.isDying()) {

                alien.die();
            }
        }
    }
}
