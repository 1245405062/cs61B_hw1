package synthesizer;

/**
 * Created by zhangjinrong on 2018/6/21.
 */
public interface BoundedQueue<T> {

    int capacity();
    int fillCount();
    void enqueue(T x);
    T dequeue();
    T peek();
    default boolean isEmpty(){
        return fillCount()==0;
    }
    default boolean isFull(){
        return fillCount()==capacity();
    }
}
