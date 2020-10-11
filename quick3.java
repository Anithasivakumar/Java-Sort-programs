public class quick3
{
	public static void main(String[] args) {
	    
	    int a[] = {168,121,142,181,179,142,181};
	    int low = 0;
	    int high = a.length -1;
	    quicksort(a,low,high);
	    for(int i=0;i <a.length;i++){
	    System.out.print(a[i] + " ");
	    }
	}
	
	public static void quicksort(int[] a, int low, int high)  {
		 if (low>=high) //1 or 0 elements  
            return;  
        IrefValues iobject = new IrefValues(0);
        JrefValues jobject = new JrefValues(0);
        partition(a, low, high, iobject,jobject); 
        quicksort(a, low, iobject.i);  
        quicksort(a, jobject.j, high);
	}
	public static void partition(int[] a, int low, int high,IrefValues iobj, JrefValues jobj)  
    {  
        if (high - low <= 1)  
        {  
            if (a[high] < a[low])  
                {
                    int temp = a[high];
                    a[high]= a[low];
                    a[low]= temp;
                }  
       iobj.i = low; jobj.j = high;  return;  
        }  
        int mid = low;  int pivot = a[high];  
        while (mid <= high)  
        {  
            if (a[mid]<pivot)  
            {
                int temp = a[low];
                a[low]=a[mid];
                a[mid] = temp;
                low++;mid++;
            }
            else if (a[mid]==pivot) 
            {
                mid++;  
            }
            else if (a[mid]>pivot)  
            {
                int temp = a[mid];
                a[mid]=a[high];
                a[high]= temp;
                high--;
            }
        }   
        iobj.i = low-1;  jobj.j = mid; //or high-1  
    }
}

 class IrefValues{
    int i=0;
    public IrefValues(int i ){
    this.i =i;
                }
            }
class JrefValues{
    int j = 0;
    public JrefValues(int j){
        this.j =j;
    }
}

