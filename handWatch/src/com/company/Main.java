package com.company;

public class Main {
    public String state= "NORMAL";
    public String state1="TIME";
    public int m=0,h=0, D=1,M=1, Y=2000;

    public String[] clock(char i){
        switch (state) {
            case "NORMAL":
                if (i == 'c') {
                    state = "UPDATE";
                    state1 = "min";
                } else if (i == 'b') {
                    state = "ALARM";
                    state1 = "Alarm";
                } else if (i =='a')
                {  if (state1 == "TIME")
                    state1="DATE";
                else
                    state1="TIME";
                }

            case "UPDATE":
                if (i == 'd' || (i == 'a' && state1=="year")) {
                    state = "NORMAL";
                    state1 = "TIME";
                } else if (i == 'a') {
                    switch (state1) {
                        case "min":
                            state1 = "hour";
                            break;
                        case "hour":
                            state1 = "day";
                            break;
                        case "day":
                            state1 = "month";
                            break;
                        case "month":
                            state1 = "year";
                    }
                } else if (i == 'b') {
                    switch (state1) {
                        case "min":
                            m = (m == 59) ? 0 : m+1;
                            break;
                        case "hour":
                            h = (h == 23) ? 0 : h+1;
                            break;
                        case "day":
                            D = (D == 31) ? 1 : D+1;
                            break;
                        case "month":
                            M = (M == 12) ? 1 : M+1;
                            break;
                        case "year":
                            Y++;
                    }
                }

            case "ALARM":
                if (i == 'd') {
                    state = "NORMAL";
                    state1 = "TIME";
                } else if (state1=="Alarm" && i == 'a') {
                    state1 = "Chime";
                }
        }


        return new String[]{state, state1, String.valueOf(D) + " / " + String.valueOf(M) + " / " + String.valueOf(Y), String.valueOf(h) + " : " + String.valueOf(m) };
    }

    public static void main(String[] args) {

        String x[]=new Main().clock('a');
        for (int i=0; i<x.length; i++){
            System.out.println(x[i]);
    }
}}