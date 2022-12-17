package thread5;

public class Test {
public static void main(String[] args) {
	  Nombre Nombre = new Nombre();
      CalculCarre thread1 = new CalculCarre(Nombre);
      Resultat thread2 = new Resultat(Nombre);
      thread1.start();
      thread2.start();
}
}
