package assign;

import java.util.*;

class Runner{
	int slNum;
	String time;
}

class ProfRunner extends Runner{
	int rank;
	ProfRunner(int no, int r, String t){
		slNum = no;
		time = t;
		rank = r;
	}
}

class AmRunner extends Runner{
	Sponser[] sponsList; 
	AmRunner(int no, String t, Sponser[] sp){
		slNum = no;
		time = t;
		sponsList = sp;
	}
	//Sponsers sobj = new Sponsers();
}

class Sponser{
	String name;
	float amount;
	Sponser(String nam, float amoun){
		amount = amoun;
		name = nam;
	}
}

class FancyRunner extends AmRunner{
	String costume;
	FancyRunner(int no, String c, String t, Sponser[] sp){
		super(no,t,sp);
		costume = c;
	}	
}

class q1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<ProfRunner> profList = new ArrayList<ProfRunner>();
		ArrayList<AmRunner> amList = new ArrayList<AmRunner>();
		ArrayList<FancyRunner> fList = new ArrayList<FancyRunner>();
		
		while(true) {
			System.out.println("1.Add runner details"+"\n"+"2.Display runner details"+"\n"+"3.Exit");
			int choice = in.nextInt();
			
			if (choice == 1) {
				System.out.println("1.Professional"+"\n"+"2.Amatuer"+"\n"+"3.Fancy Dress Runner");
				int type = in.nextInt();
				
				if (type==1) {
					System.out.println("Enter runnner details (Number, ranking and finish time in hh:mm:ss format)");
					ProfRunner pobj = new ProfRunner(in.nextInt(),in.nextInt(),in.next());
					profList.add(pobj);
				}
				
				if (type==2) {
					System.out.println("Enter runnner details (Number, finish time in hh:mm:ss format)");
					int no = in.nextInt();
					String t = in.next();
					System.out.println("Enter the number of Sponsers:");
					int noOfSpons = in.nextInt();
					Sponser[] sp = new Sponser[noOfSpons];
					System.out.println("Enter sponsorship details (Name of sponsor and amount)");
					for (int i=0; i<noOfSpons; i++) {
						sp[i]=new Sponser(in.next(),in.nextFloat());
					}
					
					AmRunner aobj = new AmRunner(no,t,sp);
					amList.add(aobj);
				}
				
				if (type==3) {
					System.out.println("Enter runnner details (Number, costume and finish time in hh:mm:ss format)");
					int no = in.nextInt();
					String c = in.next();
					String t = in.next();
					System.out.println("Enter the number of Sponsers:");
					int noOfSpons = in.nextInt();
					Sponser[] sp = new Sponser[noOfSpons];
					System.out.println("Enter sponsorship details (Name of sponsor and amount)");
					for (int i=0; i<noOfSpons; i++) {
						sp[i]=new Sponser(in.next(),in.nextFloat());
					}
					
					FancyRunner fobj = new FancyRunner(no,c,t,sp);
					fList.add(fobj);
					continue;
				}
			}
				
			if (choice==2) {
				Iterator profIter = profList.iterator();
				while(profIter.hasNext()) {
					ProfRunner pf = (ProfRunner) profIter.next();
					if((pf.time).compareTo("0:0:0")==0) {
						System.out.println("Runner"+pf.slNum+" "+"(Ranking"+pf.rank+")"+"Not Finished");
					}
					else {
						System.out.println("Runner"+pf.slNum+" "+"(Ranking"+pf.rank+")"+"Finished "+pf.time);
					}
					
				}
				
				Iterator amIter = amList.iterator();
				while(amIter.hasNext()) {
					AmRunner am = (AmRunner) amIter.next();
					System.out.print("Runner "+am.slNum+" sponsers ");
					Sponser[] Slst = am.sponsList;
					int len = Slst.length;
					float total=0;
					for (int i=0;i<len;i++) {
						System.out.print(Slst[i].name+"-"+Slst[i].amount+",");
						total=total+Slst[i].amount;
					}
					if((am.time).compareTo("0:0:0")!=0) {
						System.out.println("Total: "+total+" Finished "+am.time);}
						else {
							System.out.println("Total: "+total+"Not Finished ");
						}
					}
				
				Iterator fIter = fList.iterator();
				while(fIter.hasNext()) {
					FancyRunner f = (FancyRunner) fIter.next();
					System.out.print("Runner "+f.slNum+"("+f.costume+")"+" sponsers ");
					Sponser[] fSlst = f.sponsList;
					int len = fSlst.length;
					float total=0;
					for (int i=0;i<len;i++) {
						System.out.print(fSlst[i].name+"-"+fSlst[i].amount+",");
						total=total+fSlst[i].amount;
					}
					if((f.time).compareTo("0:0:0")!=0) {
						System.out.println("Total: "+total+" Finished "+f.time);}
						else {
							System.out.println("Total: "+total+"Not Finished ");
						}
					}
				
				
			}
			
			if (choice==3) {
				break;
			}
		}
	}

}
