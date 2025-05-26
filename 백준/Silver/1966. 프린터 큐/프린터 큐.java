import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());


        StringBuilder sb = new StringBuilder();

        for (int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); //문서의 개수 N
            int M = Integer.parseInt(st.nextToken()); //몇번째로 인쇄 되었는지 궁금한 문서 M

            Queue<Document> q = new ArrayDeque<>();

            st = new StringTokenizer(br.readLine()); //중요도들
            for (int j=0; j<N; j++){
                q.offer(new Document(j, Integer.parseInt(st.nextToken())));
            }
            int order = 0;
            while (!q.isEmpty()) {
                Document currentDoc = q.poll(); // Queue의 가장 앞에 있는 문서를 꺼냄
                boolean canPrint = true;

                for (Document d : q) { // 큐에 남아있는 다른 문서들과 비교
                    if (d.priority > currentDoc.priority) {
                        canPrint = false;
                        break;
                    }
                }

                if (canPrint) { // 중요도가 가장 높다면 인쇄
                    order++;
                    if (currentDoc.originalIndex == M) {
                        sb.append(order).append("\n");
                        break; // 
                    }
                } else { //
                    q.offer(currentDoc);
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
    static class Document{
        int originalIndex; // 원래 위치
        int priority;      // 중요도

        public Document(int originalIndex, int priority) {
            this.originalIndex = originalIndex;
            this.priority = priority;
        }

    }
}