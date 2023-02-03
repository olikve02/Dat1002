package Databaser;

import javax.sound.sampled.Line;

public class FIlmarkiv2 implements FilmarkivADT{
    private int antall;
    LinearNode<Film> start;

    FIlmarkiv2(){
        start = null;
        antall = 0;
    }

    @Override
    public Film finnFilm(int nr) {
        LinearNode<Film> aktuell = start;
        Film funnetFilm = null;
        try{
            for (int i = 0; i < antall; i++) {
                if(aktuell.getElement().getFilmnr() == nr){
                    funnetFilm = aktuell.getElement();
                }
                aktuell = aktuell.getNeste();
            }
        }catch (Exception e){
            System.out.println(e);
        }

        return funnetFilm;
    }

    @Override
    public void leggTilFilm(Film nyFilm) {
        LinearNode<Film> node = new LinearNode(nyFilm);
        node.setNeste(start);
        start = node;
        antall++;
    }

    @Override
    public boolean slettFilm(int filmnr) {
        LinearNode<Film> før = null;
        LinearNode<Film> etter = null;
        LinearNode<Film> aktuell = start;

        for (int i = 0; i < antall; i++) {
            if(aktuell.getNeste().getElement().getFilmnr() == filmnr){
                før = aktuell;
                etter = aktuell.getNeste();
            }
            aktuell = aktuell.getNeste();
        }
        før.setNeste(etter);
        aktuell.setNeste(null);


        return true;
    }

    @Override
    public Film[] soekTittel(String delstreng) {
        return new Film[0];
    }

    @Override
    public Film[] soekProdusent(String delstreng) {
        return new Film[0];
    }

    @Override
    public int antall(Sjanger sjanger) {
        return 0;
    }

    @Override
    public int antall() {
        return antall;
    }
}
