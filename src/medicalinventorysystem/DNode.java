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
public class DNode<E> {
    
    private DNode<E> prev;
    private E element;
    private DNode<E> next;

    public DNode(DNode<E> prev, E element, DNode<E> next){
        this.prev = prev;
        this.element = element;
        this.next = next;
    }
    
    public DNode<E> getPrev() {
        return prev;
    }

    public void setPrev(DNode<E> prev) {
        this.prev = prev;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public DNode<E> getNext() {
        return next;
    }

    public void setNext(DNode<E> next) {
        this.next = next;
    }
    
    
}
