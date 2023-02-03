package Databaser;

public class Filmarkiv implements FilmarkivADT{
    Film[] filmer;

    public Filmarkiv(int antall){
        Film[] filmer = new Film[antall];
    }

    @Override
    public Film finnFilm(int nr) {
        return null;
    }

    @Override
    public void leggTilFilm(Film nyFilm) {

    }

    @Override
    public boolean slettFilm(int filmnr) {
        return false;
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
        return 0;
    }

    public void utvid(){
        Film[] nyFilmer = new Film[filmer.length * 2];
    }

    public void trim(){
        int antallNull = 0;
        for (int i = 0; i < filmer.length; i++) {
            if(filmer[i] == null){
                antallNull++;
            }
        }

        Film[] nyFilmer = new Film[filmer.length-antallNull];
        int teller = 0;

        for (int i = 0; i < filmer.length; i++) {
            if(filmer[i] == null){
                teller++;
            }else{
                nyFilmer[i-teller] = filmer[i];
            }


        }
    }
}
