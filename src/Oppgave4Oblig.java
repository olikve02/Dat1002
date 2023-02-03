public class Oppgave4Oblig {
    public static void main(String[] args) {
        int sumA = 0;
        int sumB = 0;

        for (int i = 1; i <= 3000; i++) {
            if(i % 7 == 0 || i % 3 == 0){
                sumA += i;
            }
        }
        System.out.println(sumA);

        int sumaids = 0;
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j < i; j++) {
                sumaids += i*j;
            }
        }
        System.out.println(sumaids);
    }
    
}
