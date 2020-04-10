import java.io.BufferedWriter;
import java.io.IOException;
import java.io.*;

public class TxtWriter{
    public void writeAt(String path, String str, int ln_no){
        try {
            BufferedReader file = new BufferedReader(new FileReader(path));
            String line;
            String input = "";
            int counter=1;
            while((line = file.readLine()) != null)
            {
                if(counter==ln_no){
                    input+=str+"\n";
                }
                input+=line+"\n";
                counter++;
            }
            
            file.close();
            FileOutputStream out = new FileOutputStream(path);
            out.write(input.getBytes());
            out.close();

            }
            catch (IOException e) {
                  e.printStackTrace();
            }
        }
    public void replaceAttxt(String path, String rp_str, String str){
        try
        {
        BufferedReader file = new BufferedReader(new FileReader(path));
        String line;
        String input = "";
        
        while((line = file.readLine()) != null)
        {
            if(line.equals(rp_str+"\n")){
                input+=rp_str+"\n";
            }
            else{
                input+=line+"\n";
            }
        }
        
            file.close();
            input = input.replace(rp_str, str);
            FileOutputStream out = new FileOutputStream(path);
            out.write(input.getBytes());
            out.close();
        }
        catch(IOException e)
        {
        e.printStackTrace();
        }
    }
}