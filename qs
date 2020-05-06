import java.util.Arrays;
public class Main
{
public static void main(String args[])
{
int[] a={168,179,181,120,142,204};
for(int i=a.length-1;i>0;i--)
{
int j,t=a[i];
for(j=i+1;j<=a.length-1 && t>a[j];j++)
{
a[j-1]=a[j];
}
a[j-1]=t;
}
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}
