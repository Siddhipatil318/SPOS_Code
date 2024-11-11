import java.util.*;
public class SJF
{
public static void sjf()
{
System.out.println("SJF....");
Scanner sc =new Scanner(System.in); 
System.out.println("Enter a number of process: "); 
int sum=0;
float WT_avg=0,TAT_avg=0;
 
int n=sc.nextInt(); 
int p[]=new int[n]; 
int AT[]=new int[n]; 
int BT[]=new int[n]; 
int CT[]=new int[n];
int TAT[]=new int[n]; 
int WT[]=new int[n];
for(int i=0;i<p.length;i++)
{
System.out.println("Enter process ["+i+"]: "); 
p[i]=sc.nextInt();
System.out.println("Enter Arrival Time: "); 
AT[i]=sc.nextInt(); 
System.out.println("Enter Burst Time: "); 
BT[i]=sc.nextInt();
}
for(int i=0;i<p.length;i++)
{
for(int j=i+1;j<p.length;j++)
{
if(BT[i]>BT[j])
{
int tempBT=BT[i]; 
BT[i]=BT[j];
BT[j]=tempBT; 
int tempP=p[i]; 
p[i]=p[j]; 
p[j]=tempP;
int tempAT=AT[i]; 
AT[i]=AT[j];
AT[j]=tempAT;
}
}
}
//to display
System.out.println("-----------------------------------------------"); 
System.out.println("Process\tAT\tBT\tCT\tTAT\tWT"); 
System.out.println("-----------------------------------------------"); 
for(int i=0;i<p.length;i++)
{
sum+=BT[i]; 
CT[i]=sum;
TAT_avg+=TAT[i]=CT[i]-AT[i]; 
WT_avg+=WT[i]=TAT[i]-BT[i];
System.out.println("P"+p[i]+"\t\t"+AT[i]+"\t"+BT[i]+"\t"+CT[i]+"\t"+TAT[i]+"\t"+WT[i]);
}
System.out.println("-----------------------------------------------"); 
System.out.println("Average Waitng Time: "+WT_avg/n); 
System.out.println("Average Turnaround time: "+TAT_avg/n);

}
 
public static void main(String args[]) 
{ 
System.out.println("Sheduling Algorithms.....");
Scanner sc=new Scanner(System.in); 
sjf();
 
}
}
