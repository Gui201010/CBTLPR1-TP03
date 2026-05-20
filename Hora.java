// TP03 - Exercício 01
// Classe Hora
// Nomes: Guilherme Silvestre de Farias e Igo Lima Borges

import java.util.Scanner;

public class Hora {

    private int hora;
    private int min;
    private int seg;

    Scanner sc = new Scanner(System.in);
 
    public Hora() {

        setHor();
        setMin();
        setSeg();
    }

    public Hora(int h, int m, int s) {

        setHor(h);
        setMin(m);
        setSeg(s);
    }

    public void setHor(int h) {

        if (h >= 0 && h <= 23) {
            hora = h;
        }
    }

    public void setMin(int m) {

        if (m >= 0 && m <= 59) {
            min = m;
        }
    }

    public void setSeg(int s) {

        if (s >= 0 && s <= 59) {
            seg = s;
        }
    }

    public void setHor() {

        do {
            System.out.print("Digite a hora (0 a 23): ");
            hora = sc.nextInt();

        } while (hora < 0 || hora > 23);
    }

    public void setMin() {

        do {
            System.out.print("Digite os minutos (0 a 59): ");
            min = sc.nextInt();

        } while (min < 0 || min > 59);
    }

    public void setSeg() {

        do {
            System.out.print("Digite os segundos (0 a 59): ");
            seg = sc.nextInt();

        } while (seg < 0 || seg > 59);
    }

    public int getHor() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    public String getHora1() {

        return String.format("%02d:%02d:%02d", hora, min, seg);
    }
    public String getHora2() {

        int h;

        if (hora == 0) {
            h = 12;
        } else if (hora > 12) {
            h = hora - 12;
        } else {
            h = hora;
        }

        String periodo;

        if (hora < 12) {
            periodo = "AM";
        } else {
            periodo = "PM";
        }

        return String.format("%02d:%02d:%02d %s", h, min, seg, periodo);
    }

    public int getSegundos() {

        return (hora * 3600) + (min * 60) + seg;
    }
}
