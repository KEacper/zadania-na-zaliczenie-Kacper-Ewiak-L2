import java.lang.*;
import java.util.*;
import java.math.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Wybierz program:");
    System.out.println("1) Konwerter prędkośći z systemu metrecznego i imperialnego");
    System.out.println("2) Kalkulator opłacalności pizzy");
    
    int s = scan.nextInt();

    
    switch(s){
      case 1:
      System.out.println("Wybierz sposób zamiany:");
      System.out.println("1) km/h->mp/h");
      System.out.println("2) mp/h->km/h");

         int q = scan.nextInt();

        switch(q){
          case 1:
            System.out.println("Wpisz prędkość w km/h:");
            double w = scan.nextDouble();
            double e = Math.round(w / 1.609344);
            System.out.println("Prędkość: "+w+" km/h to: "+e+"mp/h");
          break;
            case 2:
            System.out.println("Wpisz prędkość w mp/h:");
            double r = scan.nextDouble();
            double t = Math.round(r * 1.609344);
            System.out.println("Prędkość: "+r+" mp/h to: "+t+"km/h");
          break;
            default:
        System.out.println("Wybierz funkcje 1 lub 2");
      break;
        }
    break;
      case 2:

        System.out.println("Kalkulator opłacalności pizzy. Sprawdź którą lepiej zamówić");
        System.out.println("Wpisz średnicy pizzy 1:");
        float srpizza1 = scan.nextFloat();
        System.out.println("Wpisz cenę pizzy 1:");
        float cenpizza1 = scan.nextFloat();
        System.out.println("Wpisz średnicę pizzy 2:");
        float srpizza2 = scan.nextFloat();
        System.out.println("Wpisz cenę pizzy 2:");
        float cenpizza2 = scan.nextFloat();

        double powpizza1 = (3.14*(srpizza1/2)*(srpizza1/2));
        double powpizza2 = (3.14*(srpizza2/2)*(srpizza2/2));
        double oplpizza1 = (powpizza1/cenpizza1);
        double oplpizza2 = (powpizza2/cenpizza2);

        System.out.println("Opłacalność pizzy 1 to: "+oplpizza1+" cm2/zł");
        System.out.println("Opłacalność pizzy 1 to: "+oplpizza2+" cm2/zł");

        if(oplpizza1>oplpizza2){
          System.out.println("Bardziej opłacalna jest pizza 1");
        } else{
          System.out.println("Bardziej opłacalna jest pizza 2");
        }
      break;
      default:
        System.out.println("Wybierz program 1 lub 2");
      break;
    }
  }
}