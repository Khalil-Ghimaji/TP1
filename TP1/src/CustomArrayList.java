import java.util.ArrayList;

public class CustomArrayList {
    private int[] list;
    private int capacity;
    public CustomArrayList(){
        this.list= new int[10];
        this.capacity=10
    }
    public CustomArrayList(int initialSize){
        this.capacity=initialSize;
        this.list=new int[initialSize];
    }
    public void add(int x){
        if (list.length==capacity)
            CustomArrayList list1=new CustomArrayList(capacity*2);
            for (int i=0;i<capacity;i++){

            }
    }
}
