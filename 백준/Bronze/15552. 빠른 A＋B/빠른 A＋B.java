import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
        
        while(num>0){
            num--;
            
            String line = br.readLine();
            int pos = line.indexOf(" ");
            int a = Integer.parseInt(line.substring(0,pos));
            int b = Integer.parseInt(line.substring(pos+1));
            int result = a+b;
            
            bw.write(Integer.toString(result));
            bw.newLine();
        }
        
        bw.close();
    }
}