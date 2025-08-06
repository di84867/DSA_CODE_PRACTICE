public class subarray1 {
    public static void main(String[] xyz){
        int i,j,k,a[]={10,20,30};   
        for (i=0;i<a.length;i++){ // Outer loop: starting index of subarray
            for(j=i;j<a.length;j++){ // Middle loop: ending index of subarray
                for(k=i;k<=j;k++){ 
                    System.out.printf("%d ",a[k]); 
                }
                System.out.println();
            }
        }
    }
}