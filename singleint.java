import java.util.*;
public class singleint
{
public static void main(String[] args)
{
int n;
int count=0;
Scanner q=new Scanner(System.in);
n=q.nextInt();
int a[]=new int[n];
for(int i=0;i>n;i++)
{
a[i]=q.nextInt();
}
for(int j=o;j<n;j++)
{
for(int k=j+1;k<n;k++)
{
if(a[j]==a[k])
{
count=count++;
}
}
}
if(count==0)
{
for(int h=0;h<n;h++)
{
system.out.println(a[h]);
}
}
}
