package generics;

public class MyArrayList <T> {

    private T[] array;
    private int size;
    private int initialCapacity;
    
    @SuppressWarnings ("unchecked")
    MyArrayList(int initialCapacity){
        this.array = (T[]) new Object[initialCapacity];
        this.size = 0;
        this.initialCapacity = initialCapacity;
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size==0;
    }

    @SuppressWarnings ("unchecked")
    public void add(T elem){
        if(size==array.length){
            if(array!=null){
                T[] aux = array.clone();
                array = (T[])(new Object[size+this.initialCapacity]);
                for (int i = 0; i < aux.length; i++) {
                    array[i] = aux[i];
                }
            }else{
                array = (T[])(new Object[size+this.initialCapacity]);
            }
        }
        array[size++]=elem;

    }

    @SuppressWarnings ("unchecked")
    public void add(int index, T elem){
        if(index>=0 && index < size){
            T[] aux = array.clone();
            if(size==array.length){
            array = (T[])(new Object[size+this.initialCapacity]);
            }
            for (int i = 0; i < index; i++) {
                array[i] = aux[i];
            }
            array[index] = elem;
            for (int i = 0; i < size; i++) {
                array[i+1] = aux[i];
            }
        }else{
            throw new IndexOutOfBoundsException();
        }
    }

    public T get(int index){
        if(index>=0 && index < size){
            return array[index];
        }else{
            throw new IndexOutOfBoundsException();
        }
    }

    public T set(int index, T elem){
        if(index>=0 && index < size){
            T previous = array[index];
            array[index] = elem;
            return previous;
        }else{
            throw new IndexOutOfBoundsException();
        }
    }

    public T remove(int index, T elem){
        if(index >= 0 && index<size){
            T previous = array[index];
            for (int i = index; i < size; i++) {
                array[i] = array[i+1];
                
            }
            array[--size]=null;
            return previous;
        }else{
            throw new IndexOutOfBoundsException();
        }
    }

    public void clear(){
        array = null;
        size = 0;
    }
    
}