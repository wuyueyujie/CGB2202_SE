package file;import java.io.File;import java.io.FileFilter;/** * 有条件的获取一个目录中的子项 * filter:过滤器 *accept:接受 *contains:包含 * File有一个重载的ListFiles方法，允许我们传入一个文件过滤器，并在该过滤器上定义过滤 * 条件，之后ListFiles执行完毕会将目录中所有满足过滤器要求的子项进行返回 */public class ListFilesDemo2 {    public static void main(String[] args) {        //获取当前目录中名字里含有字母”o“的子项        File dir = new File(".");        if (dir.isDirectory()){            /*            File listFiles(FilesFilter filer)             */            FileFilter filter = new FileFilter() {                @Override                public boolean accept(File file) {                    System.out.println("正在过滤："+file.getName());                    return file.getName().contains("o");                }            };            File[] subs = dir.listFiles(filter);            System.out.println("共："+subs.length+"个子项");            for (int i=0;i< subs.length;i++){                File sub  = subs[i];                System.out.println(sub.getName());            }        }    }}