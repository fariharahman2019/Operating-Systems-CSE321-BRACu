public class Assignment
{
       public static void main (String [] args){
        int alloc [][] = new int[13][6];
        for (int i = 1 ; i<13 ; i++){
            //System.out.print(i + " ") ;
            for(int j =1; j<6 ; j++){
                alloc[i][j] = (2*i*(j+1)%7);
                System.out.println("i= "+i+" j= "+j);
                System.out.println(alloc[i][j]=(2*i*(j+1)%7));
            }
            System.out.println(" ");
        }
        
    }
}