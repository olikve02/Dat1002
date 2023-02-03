package Databaser;

public class Person {
    int alder;
    String navn;
    Person(int alder, String navn){
        this.alder = alder;
        this.navn = navn;
    }

    public String getNavn(){
        return navn;
    }
}
