import java.util.Scanner;

public class PedraPaperTissores
{
    static int idioma = 0;
	public int catala = 1;
	public int castellano = 2;
    public int english = 3;
    static int cont = 1;
    static int tu = 0;
    static int tm = 0;
    static int vu = 0;
    static int vm = 0;
    static int Pedra = 0;
    static int Paper = 1;
    static int Tissores = 2;
    static boolean Guanyador = false;
    static boolean GuanyaUsuari = false;
    static String TiradaU;
    static String TiradaM;

    public static void Instrucciones() throws InterruptedException
    {
        if (idioma == 1)
        {
          Hola
        }
        else if (idioma == 2)
        {
            System.out.println("\n----------------------------------------------------------------------------");
            System.out.println("| + Partida al mejor de 3                                                  |");
            System.out.println("----------------------------------------------------------------------------");
            Thread.sleep(1500);
            System.out.println("| + Quien tenga 2 victorias gana                                           |");
            System.out.println("----------------------------------------------------------------------------");
            Thread.sleep(1500);
            System.out.println("| + En caso de empate nadie suma puntos                                    |");
            System.out.println("----------------------------------------------------------------------------");
            Thread.sleep(1500);
            System.out.println("| + Si despues de 3 turnos no hay ganador, gana quien gane la ronda        |");
            System.out.println("----------------------------------------------------------------------------");
            Thread.sleep(1500);
        }
        else
        {
            System.out.println("\n----------------------------------------------------------------------------");
            System.out.println("| + Game at best of 3.                                                     |");
            System.out.println("----------------------------------------------------------------------------");
            Thread.sleep(1500);
            System.out.println("| + The first one to have 2 victories wins.                                |");
            System.out.println("----------------------------------------------------------------------------");
            Thread.sleep(1500);
            System.out.println("| + In a tie case nobody gets points.                                      |");
            System.out.println("----------------------------------------------------------------------------");
            Thread.sleep(1500);
            System.out.println("| + If after 3 turns anybody has won, the first on to have a victory wins  |");
            System.out.println("----------------------------------------------------------------------------");
            Thread.sleep(1500);
        }
    }
  }
