package main;

import java.util.Scanner; 
public class MainApp 
{ 	
	public static void main(String[] args) 
	{ 		
		Scanner sc=new Scanner(System.in); 		
		Sim sim[]=new Sim[4]; 		
		for(int i=0;i<4;i++) { 			
			int ID=sc.nextInt();sc.nextLine(); 
			String name=sc.nextLine(); 		
			double balance=sc.nextDouble();sc.nextLine(); 		
			double rate=sc.nextDouble();sc.nextLine(); 		
			String circle=sc.nextLine(); 			 
			
			sim[i]=new Sim(ID,name,balance,rate,circle); 
		} 		
		
		String inputCircle=sc.nextLine(); 		
		double inputRate=sc.nextDouble(); 
		
		Sim simNew[] = getAnswer(sim,inputCircle,inputRate); 
		
		for(int i=0;i<simNew.length;i++) {
			System.out.println(simNew[i].getID());
		}
		
	} 	
	public static Sim[] getAnswer(Sim[] obj, String inputCircle, double inputRate) 
	{ 		
		Sim[] temp=new Sim[4];	 		
		int j=0; 		
		for(int i=0;i<4;i++) { 			
			if(obj[i].getCircle().equalsIgnoreCase(inputCircle) && obj[i].getRate()<inputRate) { 			
				temp[j++]=obj[i]; 		
				} 		
			} 		
		for(int i=0;i<j-1;i++) { 			
			for(int k=0;k<j-i-1;k++) { 				
				if(temp[k].getBalance()<temp[k+1].getBalance()) { 	
					Sim swap=temp[k]; 					
					temp[k]=temp[k+1]; 				
					temp[k+1]=swap; 	
				} 			
			} 	
		} 		
		
		return temp; 
	} 	
} 	
class Sim
{ 
	private int ID;
	private String name; 	
	private double balance; 
	private double rate; 	
	private String circle; 	
	
	public Sim(int ID, String name, double balance, double rate, String circle) { 		
		this.ID=ID; 		
		this.name=name; 		
		this.balance=balance; 		
		this.rate=rate; 		
		this.circle=circle; 		 
	} 	
	
	public int getID() { 		return ID; 	} 	
	public void setID(int iD) { 		ID = iD; 	} 	
	public String getName() { 		return name; 	} 	
	public void setName(String name) { 		this.name = name; 	} 	
	public double getBalance() { 		return balance; 	} 	
	public void setBalance(double balance) { 		this.balance = balance; 	} 	
	public double getRate() { 		return rate; 	} 	
	public void setRate(double rate) { 		this.rate = rate; 	} 
	public String getCircle() { 		return circle; 	} 
	public void setCircle(String circle) { 		this.circle = circle; 	} }
