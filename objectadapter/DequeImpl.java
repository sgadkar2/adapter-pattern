package objectadapter;

public class DequeImpl<E> implements Deque<E>{

    DLlist<E> dLlist;

    public DequeImpl(DLlist<E> dLlist) {
        this.dLlist = dLlist;
    }

    @Override
    public void addLast(E e) {

        dLlist.insertList(e, dLlist.length()); 
    }

    @Override
    public void addFirst(E e) {

        dLlist.insertList(e, 0);
    }

    @Override
    public E peek() {

        if(dLlist.length() == 0){
            return null;
        }

        return dLlist.get(0);
    }

    @Override
    public E poll() {
        
        if(dLlist.length() == 0){
            return null;
        }

        E e = dLlist.get(0);
        dLlist.delete(0);

        return e;
    }

    @Override
    public E peekLast() {

        if(dLlist.length() == 0){
            return null;
        }

        return dLlist.get(dLlist.length() - 1);
    }

    @Override
    public E pollLast() {
       
        if(dLlist.length() == 0){
            return null;
        }
        
        E e = dLlist.get(dLlist.length() - 1);
        dLlist.delete(dLlist.length() - 1);

        return e;
    }

    @Override
    public int size() {
       
        return dLlist.length();
    }
    
}
