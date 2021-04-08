package 소수;

import java.util.Scanner;

public class 암호화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("p : ");
		long p = input.nextLong();
		System.out.print("q : ");
		long q = input.nextLong();
		System.out.print("a : ");
		long a = input.nextLong();
		
		long N = p*q, e = 0, x;
		int intN = Long.valueOf(N).intValue();
		boolean [] arr = new boolean [intN];
		
		for(int i = 0; i <= N-1; i++)
		{
			arr [i] = false;
		}
		int j;
		for(int i = 2; i<=N; i++) 
		{
			j = 0;
			for(int k = 2; k <= i; k++) 
			{
				if(i % k == 0) 
				{
					j++;
				}		    
			}
			if(j == 1) 
			{
		    	arr[i] = true;
		    }
		}
		boolean b = false;
        while(b == false)
        {
        	for(int i = 2; b == false; i++)
        	{
        		if(arr[i] == true)
        		{
        			if((p-1)%i != 0 && (q-1)%i != 0)
        			{
        				e = i;
        				b = true;
        			}
        		}
        	}
        }
		
		
		x = (long)(Math.pow(a, e)) % N;
		
		System.out.println("N : " + N + "\ne : " + e + "\n암호 : " + x);
	}

}
