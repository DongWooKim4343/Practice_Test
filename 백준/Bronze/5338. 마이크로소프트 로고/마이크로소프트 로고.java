import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringBuilder sb = new StringBuilder();


        sb.append("       _.-;;-._").append("\n");
        sb.append("'-..-'|   ||   |").append("\n");
        sb.append("'-..-'|_.-;;-._|").append("\n");
        sb.append("'-..-'|   ||   |").append("\n");
        sb.append("'-..-'|_.-''-._|").append("\n"); 

  
        bw.write(sb.toString());
        bw.flush();


    }
}