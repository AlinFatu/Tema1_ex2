package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n=30;
        int nr=1;
        do{
            if(n%2==0){
                n=n/2;
                nr++;
            }
            else {
                n = 3 * n + 1;
            nr++;}
        }while(n!=1);
        System.out.println(nr);
    }
}
