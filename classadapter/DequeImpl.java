package classadapter;

public class DequeImpl<E> extends DLlist<E> implements Deque<E> {

    @Override
    public void addLast(E e) {
        
        insertList(e, length());
    }

    @Override
    public void addFirst(E e) {
        
        insertList(e, 0);
    }

    @Override
    public E peek() {
        
        if(length() == 0){
            return null;
        }

        return get(0);
    }

    @Override
    public E poll() {
        
        if(length() == 0){
            return null;
        }

        E e = get(0);
        delete(0);

        return e;
    }

    @Override
    public E peekLast() {
        
        if(length() == 0){
            return null;
        }

        return get(length() - 1);
    }

    @Override
    public E pollLast() {
        
        if(length() == 0){
            return null;
        }
        
        E e = get(length() - 1);
        delete(length() - 1);

        return e;
    }

    @Override
    public int size() {
        
        return length();
    }
    
}
