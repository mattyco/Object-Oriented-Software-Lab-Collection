package assign;

import java.util.Scanner;

class bus{
	int busno;
	String from;
	String to;
	int distance;
	String type;
	int fare;
	
	bus(int busno,String from,String to,int distance,String type){
		this.busno=busno;
		this.from=from;
		this.to=to;
		this.distance=distance;
		this.type=type;
	}
	
	bus(int busno,String from,String to,int distance){
		this.busno=busno;
		this.from=from;
		this.to=to;
		this.distance=distance;
		}
	
	static int CalcFare(int distance,String t){

		if(t.equals(" E"))
		{
			return(20*distance);
		}
		if(t.equals(" L"))
		{
			return(24*distance);
		}
		else{
			return (10*distance);}
		}
	
	static void show(int choice){
		bus[] bArray=new bus[10];
			
		Scanner in=new Scanner(System.in);
		int i=0;
		int k=0;
		while(choice<3){
			if(choice==1)
			{
			System.out.println("Enter bus details(Busno,from,to,distance,type)");
			int bn=in.nextInt();
			String f=in.next();
			String t=in.next();
			int d=in.nextInt();
			String type=in.nextLine();
			
			if(type.equals(" "))
			{
				bArray[i]=new bus(bn,f,t,d);
			}
			else
			{
				bArray[i]=new bus(bn,f,t,d,type);
			}
			i++;
			}
		
		
			if(choice==2)
			{
			for(k=0;k<i;k++)
			{
			System.out.print(bArray[k].busno+"  "+bArray[k].from+"  "+bArray[k].to+"  "+bArray[k].distance+"  "+CalcFare(bArray[k].distance,bArray[k].type));
			
			if((bArray[k].type)==null)
			{
			System.out.println("O"+"  ");
			}
			else{System.out.println(bArray[k].type+"  ");}
			
			
			}
			}
		
		
		System.out.println("\n\n1-Add details");
		System.out.println("2-Show details");
		System.out.println("3-Exit");
		System.out.println("Enter choice:");
		choice=in.nextInt();
		
		}   //while
		
		}   //show
	
		public static void main(String args[]){
			Scanner in=new Scanner(System.in);
		
			System.out.println("1-Add details");
			System.out.println("2-Show details");
			System.out.println("3-Exit");
			System.out.println("Enter choice:");
			int choice=in.nextInt();
			
			show(choice);
					
			
		} //main
		
	} //bus

