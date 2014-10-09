
package boletin04;


public class Boletin04 {

    public static void main(String[] args) {
        //instancio obxecto tipo semaforo
        Semaforo sema1= new Semaforo();
        String valor=sema1.dameCor();
        System.out.println("cor antes de derlle un valor: " + valor);
        sema1.poncor("verde");
        valor=sema1.dameCor();
        System.out.println("cor :"+valor);
        //outro xeito:
        System.out.println("cor: "+sema1.dameCor());
    
    }

    }

   

