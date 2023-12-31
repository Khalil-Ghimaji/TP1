import java.util.ArrayList;

public class CustomArrayList {
    private int[] list;
    private int capacity;
    public CustomArrayList(){
        this.list= new int[10];
        this.capacity=10;
    }
    public CustomArrayList(int initialSize){
        this.capacity=initialSize;
        this.list=new int[initialSize];
    }
    public void add(int x){
        if (list.length==capacity){
            int[] list1=new int[capacity*2];
            for (int i=0;i<capacity;i++) {
                list1[i]=list[i];
            }
            list=list1;
        }
        list[list.length]=x;
    }
    public int get(int index){
        return list[index];
    }
    public int size(){
        return list.length;
    }
    public boolean isEmpty(){
        return list.length==0;
    }
    public boolean isIn(int x){
        for (int item: list){
            if (item==x){
                return true;
            }
        }
        return false;
    }
    public int find(int x){
        for(int i=0;i<list.length;i++){
            if(list[i]==x){
                return i;
            }
        }
        return -1;
    }
    public void remove(int x){
        if (isIn(x)){
            for (int i=find(x)+1;i<list.length;i++){
                list[i-1]=list[i];
            }
        }
    }
}