package com.company;

import java.util.Arrays;

/**
 * Created by Андрей on 24.01.2016.
 */
public class Binom {
    protected int size = 500;
    protected int mod = 500;
    protected int[][] ints;

    public Binom(int size, int mod) {
        this.size = size;
        this.mod = mod;
        rebuild();
    }

    public void rebuild() {
        ints = new int[size][];
        for(int i = 0; i < size; i++) {
            ints[i] = new int[i + 1];
            for(int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    ints[i][j] = 1 % mod;
                } else {
                    ints[i][j] = (ints[i - 1][j - 1] + ints[i - 1][j]) % mod;
                }
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMod() {
        return mod;
    }

    public void setMod(int mod) {
        this.mod = mod;
    }

    public int[][] getInts() {
        return ints;
    }

    public void printArray() {
        for (int i = 0; i < ints.length; i++) {
            for(int s = size - i; s > 0; s--) {
                System.out.print(" ");
            }
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < ints.length; i++) {
            for(int s = size - i; s > 0; s--) {
                buffer.append(" ");
            }
            for (int j = 0; j < ints[i].length; j++) {
                buffer.append(ints[i][j]).append(" ");
            }
            buffer.append("\n");
        }
        return buffer.toString();
    }
}
