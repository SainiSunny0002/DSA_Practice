package Arrays;

public class Search_Insert_Delete_Unsorted {
    public static int searchElement(int[] search,int key){
        for (int i=0;i<search.length;i++){
            if (search[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int insertElementAtEnd(int[] insert,int n,int key){
        if (n >= insert.length) return n;
        insert[n] = key;
        return (n+1);
    }
    public static void insertAtIndex(int[] insert,int index,int key,int n){
        for (int i=n-1;i>=index;i--){
            insert[i+1] = insert[i];
        }
        insert[index] = key;
    }
    public static int deleteElement(int[] delete,int element){
        int size = delete.length;
        int position = 0;
        //find element
        for (int i=0;i<size;i++){ // 1 3 5 7 9
            if (delete[i] == element) {
                position = i;
                break;
            }
            else position = -1;
        }
        if (position == -1) System.out.print("Element not found!");
        else {
            for (int i=position;i<size-1;i++){
                delete[i] = delete[i+1];
            }
        }
        return (size-1);
    }
    public static void main(String[] args) {
        //search element
        int search[] = {5,1,3,4,2,6};
        int key = 3;
        System.out.println("search index : "+searchElement(search,key));

        //insert element at the end
        int insert[] = new int[20];
        insert[0] = 12; insert[1] = 16; insert[2] = 20; insert[3] = 40; insert[4] = 50; insert[5] = 70;
        int n = 6; key = 26;
        n = insertElementAtEnd(insert,n,key);
        System.out.print("Insert at the end : ");
        for (int i=0;i<n;i++) System.out.print(insert[i] + " ");
        System.out.println();

        //insert element at a particular index and shift the array
        int index = 2;
        insertAtIndex(insert,index,key,n);
        System.out.print("Insert at index : ");
        for (int i=0;i<insert.length;i++) System.out.print(insert[i] + " ");
        System.out.println();

        //delete element at a particular index and shift the array
        int delete[] = {7,3,5,1,9};
        int element = 5;
        element = deleteElement(delete,element);
        System.out.print("Delete element : ");
        for (int i=0;i<element;i++){
            System.out.print(delete[i] + " ");
        }
    }
}
