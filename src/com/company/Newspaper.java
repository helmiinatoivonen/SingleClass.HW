package com.company;

public class Newspaper
{
    private String name;
    private int year;
    private int month;
    private int dayOfMonth;
    private boolean isFinnish;

    public Newspaper (String var1, int var2, int var3, int var4, boolean var5)
    {
        this.name = var1;
        this.year = var2;
        this.month = var3;
        this.dayOfMonth = var4;
        this.isFinnish = var5;
    }

    public String toString ()
    {
        return name + " (" + year + "/" + month + "/" + dayOfMonth + ")" + ";" +" Is the newspaper Finnish: " + isFinnish;
    }
}
