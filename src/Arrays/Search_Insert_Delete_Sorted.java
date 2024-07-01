package Arrays;

public class Search_Insert_Delete_Sorted {
    public static int searchElement(int[] search,int searchElement){
        int low = 0,high = search.length;
        while (low<=high){
            int mid = (low+high)/2;
            if (search[mid] == searchElement) return mid;
            if (search[mid] < searchElement) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
    public static int insertElement(int[] insert,int insertElement,int NoOfElement){
        int size = insert.length,i;
        if (NoOfElement >= size) return NoOfElement;
        for (i=NoOfElement-1;(i >= 0 && insert[i] > insertElement);i--)
            insert[i+1] = insert[i];
        insert[i+1] = insertElement;
        return (NoOfElement+1);
    }
    public static int deleteElement(int[] delete,int deleteElement){
        int size = delete.length;
        int deleteIndex = searchElement(delete,deleteElement);
        if (deleteIndex == -1) System.out.println("Element not found!");
        for (int i=deleteIndex;i<size-1;i++) delete[i] = delete[i+1];
        return (size-1);
    }
    public static void main(String[] args) {
        //search element with binary search
        int[] search = {1,3,5,7,9};
        int searchElement = 5;
        System.out.print("Search Element Index : "+searchElement(search,searchElement));
        System.out.println();

        //insert element at a particular index
        int insert[] = {1,2,3,5,6,0};
        int insertElement = 4, NoOfElement = 5;
        NoOfElement = insertElement(insert,insertElement,NoOfElement);
        System.out.print("Insert at index : ");
        for (int i=0;i<NoOfElement;i++){
            System.out.print(insert[i] + " ");
        }
        System.out.println();

        //delete element at a particular index
        int delete[] = {10,20,30,40,50};
        int deleteElement = 30;
        deleteElement = deleteElement(delete,deleteElement);
        System.out.print("Delete at index : ");
        for (int i=0;i<deleteElement;i++){
            System.out.print(delete[i] + " ");
        }
    }
}
