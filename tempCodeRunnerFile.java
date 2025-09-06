

public class cost{
    static int N = 5;
    static int[] A = {4,2,1,3,5};
    static int i;
    public static void main(String[] args) {
        int cost = 0;
        for(i=0;i<N;i++){
            cost+=(i+1)*A[i];
        }
        System.out.println(cost);
    }
}