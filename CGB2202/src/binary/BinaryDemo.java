package binary;/** 二进制演示 */public class BinaryDemo {    public static void main(String[] args) {        /*        1)编译器编译时会将1日进制编译为2进制，然后按2进制来运算            .java(50)----编译后----.。class(110010)        2)int类型是32位2进制数，显示2进制时自动省略高位0        3)Integer.toBinaryString()可以将底层的2进制数显示出来          System.out.printZn()将2进制转换为10进制输出         */        int n = 50;//编译时被编译为：110010        System.out.println(Integer.toBinaryString(n));//以2进制输出        System.out.println(n);//以10进制输出        n++;//110011        System.out.println(Integer.toBinaryString(n));        System.out.println(n);    }}