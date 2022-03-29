package apiday01;/** * String和StringBuilder的演示 */public class StringStringBuilderDemo {    public static void main(String[] args) {        //用StringBuilder可以提高修改字符串的性能        StringBuilder builder = new StringBuilder("a");        for (int i=0; i<10000000;i++){            builder.append(i);        }        System.out.println("执行完毕");        /*        由于String是不变对象，每次修改内容都要创建新的对象        因此String不适做频繁操作修改，为了解决这个问题        java提供了StringBuilder的类         */        /*        String s = "a";        for (int i=0; i<10000000;i++){            s=s+i;        }        System.out.println("执行完毕");         */    }}