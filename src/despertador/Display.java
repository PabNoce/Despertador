/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despertador;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *Display se encarga de las salidas de audio y texto por pantalla
 * @author pnocedalopez
 */
public class Display {

    static Toolkit toolkit = Toolkit.getDefaultToolkit();
/**
 * pantalla imprime los mensajes que recive
 * @param mensaje es un string que contiene lo que se requiere imprimir
 */
    public static void pantalla(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
/**
 * metodo que muestra el reloj cada segundo junto con el estado de la alarma
 * @param hora hora actual del ordenador
 * @param minuto minuto actual
 * @param on está a true si la alarma está activada
 */
    public static void reloj(int hora, int minuto, boolean on) {
        String activa;

        if (on == true) {
            activa = "Alarma activa";
        } else {
            activa = "Alarma desactivada";
        }
        System.out.println(hora + ":" + minuto + " ; " + activa);
    }
/**
 * este metodo es llamado cuando la hora actual se corresponde con la alarma
 * @param hora hora actual del ordenador
 * @param minuto minuto actual
 */
    public static void ring(int hora, int minuto) {
        toolkit.beep();
        System.out.println(hora + ":" + minuto + " ; "+"ALARMA");
    }
}
