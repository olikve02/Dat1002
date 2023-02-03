package Databaser;

public class Bag <T>{
    int antall;
    LinearNode<T> første;

    Bag(){
        antall = 0;
        første = null;
    }
    public void leggTil(T element){
        LinearNode<T> node = new LinearNode(element);
        node.setNeste(første);
        første = node;

        antall++;
    }

    public boolean søkEtterPerson(T element){
        boolean finnes = false;
        LinearNode<T> aktuell;
        aktuell = første;
        for (int i = 0; i < antall; i++) {
            if (aktuell.element.equals(element)) {
                finnes = true;
            }else{
                aktuell = aktuell.getNeste();
            }
        }

        return finnes;
    }

}

