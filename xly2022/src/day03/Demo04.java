package day03;public class Demo04 {    public static void main(String[] args) {        char gender='男';//30007        int age=66;        //  30007==22899 && 66＞60        //       false   && true        //               false        //   pass=       false        boolean pass = gender =='女'&& age >60;        System.out.println(pass);//false    }}