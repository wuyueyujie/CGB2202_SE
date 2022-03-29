package IO;import java.io.FileOutputStream;import java.io.IOException;import java.nio.charset.StandardCharsets;import java.util.Scanner;/** * 完成一个建议记事本工具 * 要求：程序启动后，将用户在控制台上输入的每一行字符串都写入文件note.txt中 * 当用户单独输入exit时程序推出。 */public class NoteDemo {    public static void main(String[] args) throws IOException {        FileOutputStream fos=new FileOutputStream("note.txt") ;        Scanner scan=new Scanner(System.in) ;       /*        String str;        while(!((str=scan.nextLine()).equals("exit"))) {            str=str+"\n" ;            byte[] data = str.getBytes(StandardCharsets.UTF_8);            fos.write(data);        }         */        while (true) {            //先获取控制台输入的一行字符串            String line = scan.nextLine();            //判断用户输入的是否为exit            if ("exit".equals(line)) {                break;            }            //写入文件            //1先将字符串转换为一组字节            byte[] data = line.getBytes(StandardCharsets.UTF_8);            //2将这组字节写入文件            fos.write(data);            //判断用户输入的是否为exit            }            System.out.println("已退出");            fos.close();    }}