import java.util.LinkedList;
import java.util.*;

public class PriorityScheduling {
 public String process;
 public  int burstTime;
 public  int priority;
 public  int arrivalTime;
 
 public PriorityScheduling(String ps, int bt, int pr, int at) {
  process=ps;
  this.burstTime=bt;
  this.priority=pr;
  this.arrivalTime=at;
 }
 
 public static void main(String []args) {
  LinkedList<PriorityScheduling> list = new LinkedList<PriorityScheduling>();
  LinkedList<WaitingTime> out = new LinkedList<WaitingTime>();
  LinkedList<TurnaroundTime> ta = new LinkedList<TurnaroundTime>();
  LinkedList<FinishingTime> ct = new LinkedList<FinishingTime>();
  LinkedList<Integer> temp = new LinkedList<Integer>();
  PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
  
  int end=0;
  
  list.add(new PriorityScheduling("p1", 10, 3, 0));
  list.add(new PriorityScheduling("p2", 1, 1, 0));
  list.add(new PriorityScheduling("p3", 2, 4, 0));
  list.add(new PriorityScheduling("p4", 1, 5, 0));
  list.add(new PriorityScheduling("p5", 5, 2, 0));
  
  //storing values in pl & temp 
  for(int i=0;i<list.size();i++) {
   pq.add(list.get(i).priority);
   temp.add(list.get(i).priority);
  }
  
  while (!pq.isEmpty()) {
   int x = pq.poll();
   int idx = temp.indexOf(x);
   out.add(new WaitingTime(list.get(idx).process, end-list.get(idx).arrivalTime));
   end+=list.get(idx).burstTime;
   ta.add(new TurnaroundTime(list.get(idx).process, end));
   ct.add(new FinishingTime(list.get(idx).process, end));
  }
  
  int sum=0, sum1 =0;
  System.out.println("Process\t"+"Waiting Time\t"+"Turnaround Time\t"+"Finishing Time");
  for(int i=0;i<out.size();i++) { 
   System.out.println(out.get(i).pro+"\t\t"+out.get(i).wt+"\t\t\t" +ta.get(i).tat+"\t\t\t" +ct.get(i).ct);
   sum+=out.get(i).wt;
   sum1+=ta.get(i).tat;
  }
  System.out.println("\nAverage waiting time: "+(float)sum/out.size());
  System.out.println("\nAverage turn around time: "+(float)sum1/ta.size());
 }
}
