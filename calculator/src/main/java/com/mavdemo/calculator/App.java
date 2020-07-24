package com.mavdemo.calculator;

import java.util.Scanner;


interface opns
{
	public int add(int n1,int n2);
	public int sub(int n1,int n2);
	public int mul(int n1,int n2);
	public int div(int n1,int n2);
	public void print(int ch,int res);
}

public class App implements opns{
	public int add(int n1,int n2)
	{
		return n1+n2;
	}
	
	public int sub(int n1,int n2)
	{
		return n1-n2;
	}
	
	public int mul(int n1,int n2)
	{
		return n1*n2;
	}
	
	public int div(int n1,int n2)
	{
		return n1/n2;
	}
	
	public void print(int ch,int res)
	{
		switch(ch)
		{
		case 1:System.out.println("Sum = "+res);break;
		case 2:System.out.println("Difference = "+res);break;
		case 3:System.out.println("Product = "+res);break;
		case 4:System.out.println("Quotient = "+res);break;
		}
	}
	
	public static void main(String[] args) {
		int res=0,ch,n1,n2;
		Scanner in=new Scanner(System.in);
		opns o=new App();
		System.out.println("Enter 1st number :");
		n1=in.nextInt();
		System.out.println("Enter 2nd number :");
		n2=in.nextInt();
		do
		{
		System.out.println("Menu for simple calculations :\n");
		System.out.println("Choose any option:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\n");
		ch=in.nextInt();
		switch(ch)
		{
		case 1:res=o.add(n1,n2);o.print(1,res);break;
		case 2:res=o.sub(n1,n2);o.print(2,res);break;
		case 3:res=o.mul(n1,n2);o.print(3,res);break;
		case 4:res=o.div(n1,n2);o.print(4,res);break;
		case 5:System.out.println("Exit");break;
		}
		}while(ch!=5);
		in.close();
	}

}
