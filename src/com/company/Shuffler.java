package com.company;

public class Shuffler
{
    private static final int SHUFFLE_COUNT = 1;
    public static void main(String[] args) {
        System.out.println("Results of " + SHUFFLE_COUNT + " consecutive perfect shuffles:");
        int[] values1 = {0, 1, 2, 3};
        for (int j = 1; j <= SHUFFLE_COUNT; j++)
        {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++)
            {
                System.out.print(" " + values1[k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT + " consecutive efficient selection shuffles:");
        int[] values2 = {0, 1, 2, 3};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) {
                System.out.print(" " + values2[k]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void perfectShuffle(int[] values)
    {
        int[] shuffled = new int[values.length];
        int k = 0;
        for (int j = 0; j < values.length/2; j++)
        {
            shuffled[k] = values[j];
            k += 2;
        }
        k = 1;
        for (int j = values.length/2; j < values.length; j++)
        {
            shuffled[k] = values[j];
            k += 2;
        }
        for (int i = 0; i < shuffled.length; i++)
        {
            values[i] = shuffled[i];
        }
    }
    public static void selectionShuffle(int[] values)
    {
        for (int i = values.length-1; i > 0; i--)
        {
            int cards = (int)Math.random() * (i+1);
            int shuffled = values[cards];
            values[cards] = values[i];
            values[i] = shuffled;
        }
    }
}
