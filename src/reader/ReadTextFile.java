package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {

        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("/Users/peoplentech/develop/SeleniumMarch2018/file1");
        }catch(Exception ex){
            System.out.println("file is not located in given path");
        }
        try {
            if(fr != null) {
                br = new BufferedReader(fr);
                String st = "";
                while ((st = br.readLine()) != null) {
                    System.out.println(st);
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }finally{
            if(fr != null){
                try {
                    fr.close();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
            if(br != null){
                try {
                    br.close();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        }

    }
}
