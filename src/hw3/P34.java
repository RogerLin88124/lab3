package hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class P34 {
		public static void main(String[] args) throws IOException
		{
			System.out.println("�п�J�@�Ӿ��");
			
			BufferedReader br1=	
					new BufferedReader(new InputStreamReader(System.in));
			
			String str1=br1.readLine();
			int num=Integer.parseInt(str1);
			
			System.out.println("�A��J���Ʀr�O"+num);
			
		}
	}