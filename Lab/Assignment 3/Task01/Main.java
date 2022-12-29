package task01;

public class Main {
    public static void main(String args[]){
        threadOne object0 = new threadOne(1, 10);
        threadTwo object1 = new threadTwo(11, 20);
        threadOne object2 = new threadOne(21, 30);
        object0.start();
        try{
            object0.join();
        }catch (Exception e){}
        object1.start();
        try{
            object1.join();
        }catch (Exception e){}
        object2.start();
    }
}
