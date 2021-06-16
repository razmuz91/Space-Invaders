package SpacePackage.Klasser;

import javax.swing.*;

public class Aliens extends Sprite {

    private Bombe bombe;

    public Aliens(int x, int y) {

        lagAlien(x, y);
    }

    private void lagAlien(int x, int y) {

        this.x = x;
        this.y = y;

        bombe = new Bombe(x, y);

        var alienBilde = "src/images/alien.png";
        var alienIcon = new ImageIcon(alienBilde);

        setBilde(alienIcon.getImage());
    }

    public void act(int direction) {

        this.x += direction;
    }

    public Bombe getBomb() {

        return bombe;
    }


    public class Bombe extends Sprite {

        private boolean odelagt;

        public void setOdelagt(boolean odelagt) {

            this.odelagt = odelagt;
        }

        public boolean isOdelagt() {

            return odelagt;
        }

        public Bombe(int x, int y) {

            lagBombe(x, y);
        }

        private void lagBombe(int x, int y){

            setOdelagt(true);

            this.x = x;
            this.y = y;

            var bombeBilde = "src/images/bomb.png";
            var bombeIcon = new ImageIcon(bombeBilde);
            setBilde(bombeIcon.getImage());

        }

    }
}