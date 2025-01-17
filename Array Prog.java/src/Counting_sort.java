public class Counting_sort {
    public static void Counting_sorting(int a[]){
        int largest= Integer.MIN_VALUE;
        for(int i=0 ; i< a.length; i++){
            largest = Math.max(largest, a[i]); 
        }
        int count[]= new int[largest+1];
        for(int i=0; i<a.length; i++){
            count[a[i]]++; // for frequency array / counting array 
        }
        int j=0; // for updating elements index in sorted array
        for(int i=0 ; i<count.length ; i++){
            while(count[i]>0){
                a[j]=i;
                j++;
                count[i]--;
            }
        }
    } 
   public static void main(String[] args) {
    int a[]={1,4,1,3,2,4,3,7};
    Counting_sorting(a);
    for(int i=0 ; i<a.length ;i++){
        System.out.print(a[i] + " ");
    }
   }
}
