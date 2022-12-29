package task01;

public class threadTwo extends Thread{
    public int s;
    public int e;
    public threadTwo(int a, int b){
        this.s = a;
        this.e = b;
    }
    public void run(){
        for(int i = s; i <= e; i++){
            System.out.println(i);
        }
    }
}
