import java.io.*; 
import java.util.*; 
  
class Radix { 
    public static int getMax(int a[], int n) 
    { 
        int mx = a[0]; 
        for (int i = 1; i < n; i++) 
            if (a[i] > mx) 
                mx = a[i]; 
        return mx; 
    }  
    public static void countSort(int a[], int n, int exp) 
    { 
        int output[] = new int[n]; 
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count,0); 
        for (i = 0; i < n; i++)
        {
            count[ (a[i]/exp)%10 ]++;  
        }
        for (i = 1; i < 10; i++) 
        {
            count[i] += count[i - 1]; 
        }
        for (i = n - 1; i >= 0; i--) 
        { 
            output[count[ (a[i]/exp)%10 ] - 1] = a[i]; 
            count[ (a[i]/exp)%10 ]--; 
        } 
        for (i = 0; i < n; i++) 
            a[i] = output[i]; 
    } 
    public static void radixsort(int a[], int n) 
    {
        int m = getMax(a, n); 
        for (int exp = 1; m/exp > 0; exp *= 10) 
            countSort(a, n, exp); 
    } 
    static void print(int a[], int n) 
    { 
        for (int i=0; i<n; i++) 
            System.out.print(a[i]+" "); 
    } 

    public static void main (String[] args) 
    { 
        int a[] = {170, 45, 75, 90, 802, 24, 2, 66}; 
        int n = a.length; 
        radixsort(a, n); 
        print(a, n); 
    } 
} 