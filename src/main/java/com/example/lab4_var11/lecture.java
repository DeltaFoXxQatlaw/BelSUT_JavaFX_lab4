package com.example.lab4_var11;
/**
 * This class describes a set of variables and methods for working with objects of the computer type and their descriptions, which is an inherited class from the audience
 * @author Evgeny Litvinov
 * @version 1.0.0
 * The prefix g_ describes functions of the getter type
 * The prefix s_ describes functions of the setter type
 */
public class lecture extends audience{
    private int K;
    public void s_K(int K) {
        this.K = K;
    }
    public int g_K() {
        return this.K;
    }

    public lecture(int K) {
        this.K = K;
    }
    public lecture() {
        this.K = 0;
    }

    public int mult_K() {
        return (super.calc_pl()+(this.K*2));
    }
    public String g_full() {
        return super.g_full() + "\n" +
                "Количество ярусов: " + this.g_K() + "\n";
    }

}

