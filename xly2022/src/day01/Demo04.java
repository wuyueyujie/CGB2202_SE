package day01;public class Demo04 {    public static void main(String[] args) {        /*         *测试整数类型         */        //定义字节类型的变量b1,初始化为5        byte b1= 5;        System.out.println(b1);        //字节范围：-128——127，不能超过范围赋值        //byte b2=128;        short s1=32754;        System.out.println(s1);        //不能超过范围赋值        //short v5=-32769;错误表示        int w1=225454554;        int w5=541548545;        System.out.println(w1);        System.out.println(w5);        //int w9=154154545454;错误表示,不能超过赋值        long q1=4568;        /*        *java中默认的整数“字面量”是int类型，如果超过int范围，就会出现编译错误        *long类型的字面量后缀为l，L为了避免和1混合建议使用大写        */        long y1=999999999999999999L;        System.out.println(y1);        //变量不能重复定义        //计算：太阳到地球的距离（km）        //提示：1真空中光速大约为30万公里每秒 2太阳光大概8分钟到达地球        int speed=300000;        long m1=8*60*30*10000;        System.out.println(m1);        //speed(光速）        //distance（距离）        //计算人类最早控制使用的电磁波，传播距离是多少        //提示:人类大约70年前使用电磁波通讯，电磁波在宇宙中按照光速传播        long l1=speed*60L*60*24*365*70;        System.out.println(l1);    }}