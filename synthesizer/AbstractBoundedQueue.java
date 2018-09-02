package synthesizer;

/**
 * Created by zhangjinrong on 2018/6/21.
 */
public abstract class AbstractBoundedQueue<T> implements BoundedQueue<T> {
    protected int fillCount;
    protected int capacity;

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public int fillCount() {
        return fillCount;
    }

    @Override
    public void enqueue(T x) {
    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

}
