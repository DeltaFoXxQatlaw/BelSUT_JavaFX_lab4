package com.example.lab4_var11;
/**
 * This class describes a set of variables and methods for working with objects of the lecture type and their descriptions, which is an inherited class from the audience
 * @author Evgeny Litvinov
 * @version 1.0.0
 * The prefix g_ describes functions of the getter type
 * The prefix s_ describes functions of the setter type
 */
public class computer extends audience{
    private int P;
    public void s_P(int P) {
        this.P = P;
    }
    public int g_P() {
        return this.P;
    }

    public computer(int P) {
        this.P = P;
    }
    public computer() {
        this.P = 0;
    }

    public int calc_pl() {
        return (P-1);
    }
    public String g_full() {
        return super.g_full() + "\n" +
                "Количество компьютеров: " + this.g_P() + "\n";
    }
}

