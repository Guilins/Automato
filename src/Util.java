import java.util.StringTokenizer;

public class Util {
    public boolean isLowerCase(char chr){
        if (chr == Character.toLowerCase(chr))
            return true;
    }

    public String[] lineSeparate(String str){
        String[] row = new String[];
        StringTokenizer st = new StringTokenizer(str);

        for(int i = 0; i < st.countTokens(); i++){
            row[i] = st.nextToken();
        }

        return row;
    }
}
