/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despertador;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import static despertador.Alarma.hour;
import static despertador.Alarma.minute;
import static despertador.Alarma.on;
import static despertador.Botones.stop;

/**
 *
 * @author pnocedalopez
 */
public class Despertador {

    Timer timer;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Alarma alarm = new Alarma(0, 0);
        new Despertador();
        Botones.menu(alarm);
    }

    public Despertador() {
        //creamos un Timer
        timer = new Timer();
        //con el Timer ejecutamos la tarea TicTac, con un retardo de 0sg y repetimos cada 1sg
        timer.schedule(new TicTac(), 0, 1000);
    }

    public class TicTac extends TimerTask {

        @Override

        public void run() {
            Calendar calendar = Calendar.getInstance();
            int hora = calendar.get(Calendar.HOUR_OF_DAY);
            int minuto = calendar.get(Calendar.MINUTE);
            if (stop == true) {
                timer.cancel();
                timer.purge();
            }
            if (hora == hour && minuto == minute && on == true) {
                Display.ring(hora, minuto);

            } else {
                Display.reloj(hora, minuto, on);
            }
        }
    }

}
