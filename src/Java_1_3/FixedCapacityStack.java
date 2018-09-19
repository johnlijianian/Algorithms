package Java_1_3;

public class FixedCapacityStack<Item>{
    private Item [] a;
    private int N;
    FixedCapacityStack(int cap){
        a = (Item[]) new Object[cap];
//        N = 0;// 初始化值为0
    }
    public int size() {return N;}
    public boolean isEmpty() {return N==0;}
    public void push(Item item){
        a[N++] = item;
    }
    public Item pop(){
        return a[--N];
    }
    public boolean isFull() {return N==a.length;}
}