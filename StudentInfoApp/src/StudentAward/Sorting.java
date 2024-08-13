package StudentAward;

//SelectionSort

public class Sorting
{
    //-----------------------------------------------------------------
    //  Sorts the specified array of objects using the selection
    //  sort algorithm.
    //-----------------------------------------------------------------
    public static void selectionSort(Comparable[] list)
    {        
        for (int i = 0; i < list.length - 1; i++) {
        	int min_gpa = i;
        	
        	for (int scan = i + 1; scan < list.length; scan++) {
        		if (list[scan].compareTo(list[min_gpa]) > 0) {
        			min_gpa = scan;
        		}
        	}
        	Comparable temp = list[min_gpa];
        	list[min_gpa] = list[i];
        	list[i] = temp;
        }
    }

}
