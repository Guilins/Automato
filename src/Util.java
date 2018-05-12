import java.util.StringTokenizer;

public class Util {
    public boolean isLowerCase(char chr){
        if (chr == Character.toLowerCase(chr))
            return true;
    }

    public String[] lineSeparate(String str){
        String[] row = new String[];
        row = str.split("/n");

        return row;
    }
}
