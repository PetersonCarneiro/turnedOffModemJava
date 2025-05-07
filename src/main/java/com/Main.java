package com;

public class Main {
    public static void main(String[] args) {
        String urlMolem ="http://192.168.1.254/" ;
        String name = "userAdmin";
        String pass = "3f68SPTDKp";

        TurnOff conn = new TurnOff();
        conn.login(urlMolem,name,pass);
        conn.rebootModem();

    }
}