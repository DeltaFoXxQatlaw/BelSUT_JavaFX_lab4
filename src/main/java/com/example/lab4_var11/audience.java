package com.example.lab4_var11;

/**
 * This class describes a set of variables and methods for working with and describing objects of the audience type
 * @author Evgeny Litvinov
 * @version 1.0.0
 * The prefix g_ describes functions of the getter type
 * The prefix s_ describes functions of the setter type
 */
public class audience {
    /**
     * @param num is the number of the audience
     * @param square is the square of the audience
     */
    private int num;
    private float square;

    public audience(int num, float square) {
        this.num = num;
        this.square = square;
    }

    public audience() {
        this.num = 0;
        this.square = 0;
    }

    public void s_num(int num) {
        this.num = num;
    }

    public void s_square(float square) {
        this.square = square;
    }

    public int  g_num() {
        return num;
    }

    public float g_square() {
        return square;
    }

    public String g_full() {
        return "Номер аудитории: " + this.g_num() + "\n"+
                "Площадь м*м: " + this.g_square() + "\n";
    }
    public int calc_pl () {
        return (int) (this.square/1.2);
    }

}

