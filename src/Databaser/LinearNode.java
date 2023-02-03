package Databaser;

public class LinearNode <T>{
    T element;
    private LinearNode<T> neste;

    LinearNode(){
        element = null;
        neste = null;
    }

    LinearNode(T element){
        this.element = element;
        neste = null;
    }

    public LinearNode<T> getNeste(){
        return neste;
    }

    public void setNeste(LinearNode<T> neste){
        this.neste = neste;
    }

    public T getElement(){
        return element;
    }

    public void setElement(T element){
        this.element = element;
    }
}
