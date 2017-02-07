/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversepolishnotationcalculator;

import java.util.Iterator;

/**
 *
 * @author philliphbrink
 */
public class ArrayStack<T> implements Iterable<T> {

    private T[] data = null;
    private int top = 0;

    //---------------------------
    public ArrayStack() {
        data = (T[]) new Object[1];
    }

    public void push(T element) {
        if (data.length == top){
            T[] dataTemp = data;
            data = (T[]) new Object[data.length * 2];
            for (int i = 0; i < dataTemp.length; i++) {
                data[i] = dataTemp[i];
            }
        }
        data[top] = element;
        top++;
    }
   
   public T pop() {
       top--;
       T result = data[top];
       data[top] = null;
       return result;
    }

    public boolean isEmpty() {
        return top == 0;
    }
    
    public int length() {
        return data.length;
    }
    
    public int getTop(){
        return top;
    }
    
    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < data.length && data[currentIndex] != null;
            }

            @Override
            public T next() {
                return data[currentIndex++];
            }
            
            /*@Override
            public void remove() {
                data[currentIndex]
            }*/
        };
        return it;
    }

}
