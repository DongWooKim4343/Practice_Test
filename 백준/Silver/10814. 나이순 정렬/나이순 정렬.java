import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        List<Member> list = new ArrayList<>();

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            Member mm = new Member(Integer.parseInt(st.nextToken()),st.nextToken());
            list.add(mm);
        }

        Comparator<Member> ageCom = new Comparator<Member>(){
            @Override
            public int compare(Member m1, Member m2){
                if(m1.age==m2.age){
                    return 0; //순서 유지
                }else{
                    return m1.age - m2.age;
                }
            }
        };

        Collections.sort(list, ageCom);
        for(Member mm : list){
            bw.write(mm.age+" "+mm.name+"\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }

    static class Member{
        int age;
        String name;

        Member(int age, String name){
            this.age = age;
            this.name = name;
        }
    }
}