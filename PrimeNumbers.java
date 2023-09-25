import java.util.Scanner;

public class PrimeNumbers{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String PrimeNumber="";
        for(int i=1; i<=100; i++){
            int counter=0;
            for(int n=i; n>=1; n--){
                if(i%n==0)
                {
                    counter=counter+1;
                }
            }
            if(counter==2){
            PrimeNumber=PrimeNumber+i+"\n";
            
        }
        
        }
        System.out.println(PrimeNumber);
    }
}