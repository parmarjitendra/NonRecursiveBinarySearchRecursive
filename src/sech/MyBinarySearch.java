package sech;

public class MyBinarySearch
{
    private int[] arr;

    public MyBinarySearch(int[] arr) {
        this.arr = arr;
    }

    public boolean BinarySearch(int searchElement,int low,int high) {
        boolean response = false;
        if (low <= high) {
            int mid = (low + high) / 2;
            if (searchElement == arr[mid]) {
                response = true;
            } else if (searchElement < arr[mid]) {
                response = BinarySearch(searchElement, low, mid - 1);
            } else {
                response = BinarySearch(searchElement, mid + 1, high);
            }
        }
        return response;
    }

    public static void main(String[] args) {
        int [] sortedarray = {10,20,30,40,50,60,70,80};
        int searchElement = 10;
        MyBinarySearch obj = new MyBinarySearch(sortedarray);
        boolean result = obj.BinarySearch(searchElement,0,sortedarray.length-1);
        if(result)
        {
            System.out.println("found");
        }
        else
        {
            System.out.println("result is not found");
        }
    }
}
