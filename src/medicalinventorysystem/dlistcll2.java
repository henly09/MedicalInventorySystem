/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalinventorysystem;

/**
 *
 * @author Henz Montera
 * @param <E>
 */
public class dlistcll2<E> implements dcll<E> {
    
    DList2<E> list;
    
    public dlistcll2(){
        list = new DList2<>();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public E head() throws EmptyListException {
        if (isEmpty()){
            throw new EmptyListException("The List is Empty!");
        } 
        return list.first();
    }

    @Override
    public E tail() throws EmptyListException {
        if (isEmpty()){
            throw new EmptyListException("The List is Empty!");
        } 
        return list.last();
    }

    @Override
    public E rotatedB() throws EmptyListException {
        if (isEmpty()){
            throw new EmptyListException("There's nothing to be rotated!");
        } 
        return list.rotatedB();
    }

    @Override
    public E rotateB() throws EmptyListException {
        if (isEmpty()){
            throw new EmptyListException("There's nothing to be rotated!");
        } 
        return list.rotateB();
    }

    @Override
    public void addlast(E element) {
        list.addLast(element);
    }

    @Override
    public void addfirst(E element) {
        list.addFirst(element);
    }

    @Override
    public E rotatedA() throws EmptyListException {
        if (isEmpty()){
            throw new EmptyListException("There's nothing to be rotated!");
        } 
        return list.rotatedA();
    }

    @Override
    public E rotateA() throws EmptyListException {
        if (isEmpty()){
            throw new EmptyListException("There's nothing to be rotated!");
        } 
        return list.rotateA();
    }

    @Override
    public E removefirst() throws EmptyListException {
        if (isEmpty()){
            throw new EmptyListException("There's nothing to be removed");
        }
        return list.removeFirst();
    }

    @Override
    public E removelast() throws EmptyListException {
        if (isEmpty()){
            throw new EmptyListException("There's nothing to be removed");
        }
        return list.removeLast();
    }
    
}
