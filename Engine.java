package exp;

/**
 * Created by RogueBoy on 04.12.2016.
 */
public class Engine {

    int[] tr;
    int top;
    int mSize;

    public void addElement(int element){
        tr[++top] = element;
    }
    public int deleteElement(){
        return tr[top--];
    }
    public int readTop(){
        return tr[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == mSize - 1);
    }
}
