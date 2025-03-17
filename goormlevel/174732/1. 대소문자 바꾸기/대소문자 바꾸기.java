import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		String answer = "";
		
		for(int i=0; i<count; i++){
			char c = str.charAt(i);
			if(Character.isUpperCase(c)){
				answer+= Character.toLowerCase(c);
			}else{
				answer+= Character.toUpperCase(c);
			}
		}
		System.out.println(answer);
		
	}
}