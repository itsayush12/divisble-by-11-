import java.util.*;
class divisible2{
    static Scanner scn = new Scanner(System.in);

    public static void input(int []arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
    }

    public static int reverse(int num){
        int ans = 0;
        while(num!=0){
            int rem = num % 10;
            num = num / 10;
            ans = (ans * 10) + rem;
        }
        return ans;
    }

    public static void divisible(int []arr){
        int div = arr.length / 2;
        int odd = 0;
        int even = 0;
        for(int i=0; i<arr.length;i++){
            if(i<div){
                int rev = reverse(arr[i]);
                int rem = rev % 10;
                if(i % 2==0){
                    even+= rem;
                }else{
                    odd+= rem;
                }
            }else{
                int rem2 = arr[i] % 10;
                if(i % 2==0){
                    even+= rem2;
                }else{
                    odd += rem2;
                }
            }
        }

        if(even - odd==0 || even - odd==11){
            System.out.println("OUI");
        }else{
            System.out.println("NON");
        }
    }
    public static void main(String []args){
        int num = scn.nextInt();
        int []arr = new int[num];
        input(arr);
        divisible(arr);
    }
}