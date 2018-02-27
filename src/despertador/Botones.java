/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despertador;

import javax.swing.JOptionPane;

/**
 *
 * @author pnocedalopez
 */
public class Botones {
    
    public static void menu(Alarma alarm) {
        boolean rep = true;
      
        
        do {
            String opcion = JOptionPane.showInputDialog(""
                    + "1: Posponer\n"
                    + "2: Mostrar Alarma\n"
                    + "3: Programar Alarma\n"
                    + "4: Encender/Apagar alarma\n"
                    + "5: Apagar Reloj");
            switch (opcion) {
                case "1":
                    alarm.setMinute(alarm.getMinute() + 10);
                    if (alarm.getMinute() > 59) {
                        alarm.setMinute(alarm.getMinute() - 60);
                        alarm.setHour(alarm.getHour() + 1);
                    }
                    break;
                case "2":
                    Display.pantalla(alarm.getHour()+":"+alarm.getMinute());
                    break;
                case "3":
                    alarm.setHour(Integer.parseInt(JOptionPane.showInputDialog("Introduce hora: ")));
                    alarm.setMinute(Integer.parseInt(JOptionPane.showInputDialog("Introduce minuto: ")));
                    break;
                case "4":
                    if (alarm.isOn()) {
                        alarm.setOn(false);
                    } else {
                        alarm.setOn(true);
                    }
                    break;
                case "5":
                    
                    break;
                default:
                    break;
            }
        } while (rep == true);
    }
}
