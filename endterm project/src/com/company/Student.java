package com.company;

import java.sql.Connection;
import java.util.Scanner;

public class Student {
    Scanner sc=new Scanner(System.in);
    Scanner sc1=new Scanner(System.in);
    private int ID;
    public int choose;
    public void getPerson(){
            System.out.println("What do you want to see?\n"+"1:Grade\n"+"2:Attendance");
        choose= sc1.nextInt();
        System.out.println("Which ID do you have?\n");
        ID=sc.nextInt();
    }

    public int getChoose() {
        return choose;
    }

    public void setChoose(int choose) {
        this.choose = choose;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
