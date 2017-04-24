//ATeam(Federico Tondolo, Mohamed Tamara, Shaikat Islam)
//APCS2 pd05
//LAB #03: RUVIP?
//2017-04-23

public class Ticket{
  private static int VIPlvl;
  private static String problem;
  private static int ID;
  private static boolean solved;
  private static String name;
  private static String solution;

  public Ticket(){
    VIPlvl=5;
    problem ="unknown";
    ID = 0;
    solved =false;
    name = "unknown";
    solution ="youtellme";
  }

  public static void setSolved(boolean f){
    solved = f;
  }

  public static boolean getSolved(){
    return solved;
  }

  public static void setSolution(String f){
    solution=f;
  }

  public static String getSolution(){
    return solution;
  }

  public static void setVIP(int f){
    VIPlvl=f;
  }

  public static int getVIP(){
    return VIPlvl;
  }

  public static void setName(String f){
    name = f;
  }

  public static String getName(){
    return name;
  }

  public static String getProb(){
    return problem;
  }

  public static void setProb(String f){
    problem = f;
  }

  public static int getID(){
    return ID;
  }

  public static void setID(int f){
    ID = f;
  }
}
