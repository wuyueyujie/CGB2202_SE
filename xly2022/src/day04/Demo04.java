package day04;import java.util.Scanner;public class Demo04 {    public static void main(String[] args) {        /*        * 多路分支         */        Scanner scanner = new Scanner(System.in);        System.out.print("输入总价！");        double total = scanner.nextDouble();        if (total<200) {            System.out.println("95折");            total *= 0.95;        }else if (total<500) {            System.out.println("9折");            total *= 0.9;        }else if (total<1000) {            System.out.println("8折");            total *= 0.8;        }else {            System.out.println("7折");            total *= 0.7;        }        System.out.printf("付款金额 %.2f元",total);        }    }