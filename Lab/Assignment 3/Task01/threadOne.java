package task01;

public class threadOne extends Thread{
    public int s;
    public int e;
    public threadOne(int a, int b){
        this.s = a;
        this.e = b;
    }
    public void run(){
        for(int i = s; i <= e; i++){
            System.out.println(i);
        }
    }
}
