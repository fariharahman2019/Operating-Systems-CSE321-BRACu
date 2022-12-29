import java.util.*;

public class SJF {
  public static void main (String args[])
  {
    int n=4;
    String pid[] = new String[] {"p1", "p2", "p3", "p4"};
    int at[] = {0,1,2,3}; 
    int bt[] = {8,4,9,5}; 
    int bt1[] = {8,4,9,5}; 
    int ct[] = new int[n];
    int ta[] = new int[n];
    int wt[] = new int[n];  
    int f[] = new int[n]; 
    int k[]= new int[n];   
    int i; 
    int st=0; 
    int tot=0;
    float avgwt=0;
    float avgta=0;
    
    while(true){
      int min=99,c=n;
      if (tot==n)
        break;
      
      for ( i=0;i<n;i++)
      {
        if ((at[i]<=st) && (f[i]==0) && (bt[i]<min))
        { 
          min=bt[i];
          c=i;
        }
      }
      
      if (c==n)
        st++;
      else
      {
        bt[c]--;
        st++;
        if (bt[c]==0)
        {
          ct[c]= st;
          f[c]=1;
          tot++;
        }
      }
    }
    
    for(i=0;i<n;i++)
    {
      ta[i] = ct[i] - at[i];
      wt[i] = ta[i] - bt1[i];
      avgwt+= wt[i];
      avgta+= ta[i];
    }
    
    System.out.println("PROCESS ArrivalTime BurstTime FinishingTime  TurnAroundTime  WaitingTime");
    
    for(i=0;i<n;i++){
      System.out.println(pid[i] +"\t\t"+ at[i]+"\t\t"+ bt1[i] +"\t\t"+ ct[i] +"\t\t\t"+ ta[i] +"\t\t\t"+ wt[i]);
    }
    
    System.out.println("\nAverage Turnaround Time Is : "+ (float)(avgta/n));
    System.out.println("Average Waiting Time Is : "+ (float)(avgwt/n));
  }
}