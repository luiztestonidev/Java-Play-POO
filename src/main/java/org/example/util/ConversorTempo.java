package org.example.util;

public class ConversorTempo {

    public static String formatarMinutos(int minutos) {

        int horas = minutos / 60;
        int minRestantes = minutos % 60;

        String minutosFormatados;

        if (minRestantes < 10) {
            minutosFormatados = "0" + minRestantes;
        } else {
            minutosFormatados = "" + minRestantes;
        }

        return horas + "h " + minutosFormatados + "min";

    }
}