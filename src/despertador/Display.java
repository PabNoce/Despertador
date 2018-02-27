/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despertador;

import java.awt.Toolkit;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author pnocedalopez
 */
public class Display {

    static Toolkit toolkit = Toolkit.getDefaultToolkit();

    public static void pantalla(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void reloj(int hora, int minuto, boolean on) {
        String activa;

        if (on == true) {
            activa = "Alarma activa";
        } else {
            activa = "Alarma desactivada";
        }
        System.out.println(hora + ":" + minuto + " ; " + activa);
    }

    public static void ring(int hora, int minuto) {
        toolkit.beep();
        System.out.println(hora + ":" + minuto + " ; "+"ALARMA");
    }
}
