import java.util.Arrays;
class cs  
{ 
  
    static void countSort(int[] a)  
    { 
        int max = Arrays.stream(a).max().getAsInt(); 
        int min = Arrays.stream(a).min().getAsInt(); 
        int range = max - min + 1; 
        int count[] = new int[range]; 
        int output[] = new int[a.length]; 
        for (int i = 0; i < a.length; i++)  
        { 
            count[a[i] - min]++; 
        } 
  
        for (int i = 1; i < count.length; i++)  
        { 
            count[i] += count[i - 1]; 
        } 
  
        for (int i = a.length - 1; i >= 0; i--)  
        { 
            output[count[a[i] - min] - 1] = a[i]; 
            count[a[i] - min]--; 
        } 
  
        for (int i = 0; i < a.length; i++) 
        { 
            a[i] = output[i]; 
        } 
    } 
  
    static void printArray(int[] a)  
    { 
        for (int i = 0; i < a.length; i++)  
        { 
            System.out.print(a[i] + " "); 
        } 
        System.out.println(""); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int[] a = {8,3,9,2,6,2,5,7,3}; 
        countSort(a); 
        printArray(a); 
    } 
}  