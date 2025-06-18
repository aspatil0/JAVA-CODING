import java.util.Scanner;
class Dup{
    public static void main(String args[]){
        int[] num ={1,2,3,1,1,5,5};

        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    System.out.println(num[i]);
                }
            }
        }
    }
}