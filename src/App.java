import java.util.List;
import java.util.Stack;

public class App {
    static int [][] adjM={
        {0,0,1,1,0},
        {1,0,0,0,0},
        {0,1,0,0,0},
        {0,0,0,0,1},
        {1,0,0,0,0}};
    static boolean[] visited=new boolean[5];

        static void dfsIterative(int start){
            Stack<Integer> stack=new Stack<>();
            stack.push(start);
            while(!stack.isEmpty()){
                int currentNode=stack.pop();
                visited[currentNode]=true;
                System.out.print(currentNode+" ");
                for(int i=0;i<adjM[currentNode].length;i++){
                    if(adjM[currentNode][i]==1 && !visited[i])
                        stack.push(i);
                }
            }
        }

        static void dfsRecursive(int start){
            visited[start]=true;
            System.out.print(start+" ");
            for(int i=0;i<adjM[start].length;i++){
                if(adjM[start][i]==1 && !visited[i])
                dfsRecursive(i);
            }
            

        }
    public static void main(String[] args) throws Exception {
        for(int i=0;i<5;i++){
                visited[i]=false;
        }
        dfsIterative(0);
        for(int i=0;i<5;i++){
                visited[i]=false;
        }
        dfsRecursive(0);

    }
}
