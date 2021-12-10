package UseOfFiles;

import java.io.*;

public class Exam_03 {

    public static void main(String[] args) {
        File ff = new File("C:\\Users\\SJW-HOME\\ideaProjects");
        String[] s = ff.list();
        for(int i = 0; i < s.length; i++){
            System.out.println(i + "  : " + s[i] );
        }

        File file = new File("Exam_01.java");
        System.out.println("name : " + file.getName());
        System.out.println("parent  : " + file.getParent());
        System.out.println("path  : " + file.getPath());
        System.out.println("can read ? " + file.canRead());
        System.out.println("can write ? " + file.canWrite());

        File file2 = new File("aaa.txt");

        try{
            boolean bool = file2.createNewFile();
            System.out.println("bool = " + bool);

        } catch (Exception e) {
            e.printStackTrace();
        }

        File now = new File(".");

        try{
            File file3 = File.createTempFile("temp", ".ksh", now );
            System.out.println("f2 = " + file3);
            file3.delete();
            // file3.deleteOnExit();
        }catch (IOException e){}

        boolean bool2 = file2.delete();
        System.out.println("bool = " + bool2);
    }
}
