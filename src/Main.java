import java.util.Timer;
import java.util.TimerTask;
import Animal.*;

public class Main {
        public static void main(String[] args) {
                Timer timer = new Timer();

                Animal lion = new Animal("Leu");
                Animal tiger = new Animal("Tigru");
                Animal monkey = new Animal("Maimuță");

                timer.scheduleAtFixedRate(new TimerTask() {
                        @Override
                        public void run() {
                                lion.feed();
                        }
                }, 0, 180000);

                timer.scheduleAtFixedRate(new TimerTask() {
                        @Override
                        public void run() {
                                tiger.feed();
                        }
                }, 0, 180000);

                timer.scheduleAtFixedRate(new TimerTask() {
                        @Override
                        public void run() {
                                monkey.feed();
                        }
                }, 0, 180000);
        }
}