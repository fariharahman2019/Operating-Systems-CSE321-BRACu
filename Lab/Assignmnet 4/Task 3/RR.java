public class RR
{ 
    static void waitingTime(int p[], int n, int bt[], int wt[], int quantum) 
    { 
        int rbt[] = new int[n]; 
        for (int i = 0 ; i < n ; i++){
            rbt[i] =  bt[i]; 
        }  
        int t = 0; 
        while(true) 
        { 
            boolean done = true; 
            for (int i = 0 ; i < n; i++) 
            { 
                if (rbt[i] > 0) 
                { 
                    done = false;
       
                    if (rbt[i] > quantum) 
                    { 
                        t += quantum; 
                        rbt[i] -= quantum; 
                    } 
                    else
                    {
                        t = t + rbt[i]; 
                        wt[i] = t - bt[i]; 
                        rbt[i] = 0; 
                    } 
                } 
            } 
       
            if (done == true) 
              break; 
        } 
    } 
    static void turnAroundTime(int p[], int n, int bt[], int wt[], int tat[]) 
    { 
        for (int i = 0; i < n ; i++) 
            tat[i] = bt[i] + wt[i]; 
    } 
    static void avgTime(int p[], int n, int bt[], int quantum){     
        int wt[] = new int[n], tat[] = new int[n]; 
        int total_wt = 0, total_tat = 0; 
       String p1[] = new String[] {"p1", "p2", "p3"};
        waitingTime(p, n, bt, wt, quantum); 
        turnAroundTime(p, n, bt, wt, tat); 
        System.out.println("Process " + " Burst " + " Waiting " + " Turnaround " + "FinishingTime");
        for (int i=0; i<n; i++){ 
            total_wt = total_wt + wt[i]; 
            total_tat = total_tat + tat[i]; 
            System.out.println(" " + p1[i] + "\t\t" + bt[i] +"\t " + wt[i] +"\t\t " + tat[i]+"\t\t" + tat[i]); 
        }
       
        System.out.println("Average Waiting Time : " +(float)total_wt / (float)n); 
        System.out.println("Average Turnaround Time : " +(float)total_tat / (float)n); 
    }
      
    public static void main(String[] args) 
    { 
        int process[] = { 1, 2, 3}; 
        String process1[] = new String[] {"p1", "p2", "p3"};
        int n = process.length; 
        int burst_time[] = {24, 3, 3}; 
        int quantum = 4; 
        avgTime(process, n, burst_time, quantum); 
    } 
} 