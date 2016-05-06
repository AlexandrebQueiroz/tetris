package br.com.radar.tetrisb.engine;

import java.util.Timer;
import java.util.TimerTask;

public class Relogio {

    private static final int SEGUNDO = 1000;

    private int start= 0;
    private int evento;
    private Timer timer;

    public Relogio(){
        evento = 0;
        timer = new Timer();
        timer.schedule(new RemindTask(),0, 1 * SEGUNDO);
    }

    public boolean isEvento() {
        return evento != 0;
    }
    public void descreceEvento(){
        if(evento>0){
            evento--;
        }
    }

    class RemindTask extends TimerTask {
        public void run() {

            start++;
            if(start>3){
                evento++;
            }

        }
    }
}
