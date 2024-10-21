import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Actitvity_selection {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        //for the case when activities are not dorted a/c yo end time then we do 1st sorting 

        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));
         ArrayList<Integer> ans=new ArrayList<>();  
         int maxAct=0;

        //1st activity 
        maxAct=1;
        ans.add(activities[0][0]);
        int lastEnd =activities[0][2];
        for(int i=1;i<end.length-1;i++){
            if(activities[i][1]>=lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
            }
        }
    System.out.println("No. of max Activites that can be done is "+ maxAct);
    System.out.println(ans);
    }
}