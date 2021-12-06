package Examples;


import java.io.IOException;

public class RunTimeTop {

    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        try{
            run.exec("explorer.exe");
        }catch (IOException ee){}
    }
}
