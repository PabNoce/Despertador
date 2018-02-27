/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despertador;

/**
 * Alarma almacena los datos de la programacion del despertador
 * @author pnocedalopez
 */
public class Alarma {

    public static int hour, minute;
    public static boolean on = false;

    public Alarma() {
    }

    public Alarma(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

}
