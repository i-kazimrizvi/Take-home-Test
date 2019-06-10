package com.company;

public class Main {

    public static void main(String[] args) {

        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        int c = Integer.valueOf(args[2]);
        int d = Integer.valueOf(args[3]);

        System.out.println(addAndMatch(a, b, c, d));
    }

    private static Boolean addAndMatch(int a, int b, int c, int d){
        if((a+b==c&&b==d)||(a==c&&a+b==d)){
            return  true;
        }
        else if(a+b>c && a+b>d){
            return false;
        }
        else {
            return(addAndMatch(a+b,b,c,d) || addAndMatch(a,a+b,c,d));
        }
    }
}
