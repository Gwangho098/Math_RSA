package 소수;

import java.util.Scanner;

public class 해독기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("N : ");
		int N = input.nextInt();
		System.out.print("e : ");
		long e = input.nextInt();
		System.out.print("x : ");
		long x = input.nextInt();
		
		boolean [] arr = new boolean[N];
		
		
		for(int i = 0; i <= N-1; i++)
		{
			arr [i] = false;
		}
		
		long p = 0, q = 0, d = 0, a, j;
		
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
		for(int n = 2; n <= N; n++)
		{
			if(arr [n] == true)
			{
				if(N % n == 0)
				{
					p = n;
					q = N / n;
					n = N + 1;
				}
			}
			
		}
		for(int m = 2; m > 0 ;m++)
		{
			if((e*m)%((p-1)*(q-1)) == 1)
			{
				d = m;
				m = -1;
			}
		}
		a = (long)(Math.pow(x, d)) % N;
		
		System.out.println("d : " + d + "\n해독결과 : " + a);
		
		

	}

}
