package proyectocine;

import java.io.*;

/**
 *
 * @author Juan Diego Suarez Londoño
 */
public class ReadWriteData {
    DataOutputStream out;
    DataInputStream in;

    public ReadWriteData() {}

    public void writeInt(File archivo, boolean overwrite,int[] counters) throws IOException {
        out=new DataOutputStream(new FileOutputStream(archivo,overwrite));
        for(int i=0;i<counters.length;i++) {
            out.writeInt(counters[i]);              
        }
        out.close();
    }

    public int[] readInt(File archivo, int[] counters) throws FileNotFoundException, IOException {
        in=new DataInputStream(new FileInputStream(archivo));
        try {
            for(int i=0;;i++) {
                counters[i]=in.readInt();
            }
        }
        catch(EOFException e) {}
        in.close();
        return counters;
    }    
}
