public class Ticket{
  private int VIPlvl;
  private String prob;
  private int IDnum;
  private boolean solv;
  private String name;
  private String solutionz;

  public Ticket(){
    VIPlvl=5;
    prob="unknown";
    IDnum=9999;
    solv=false;
    name="whatevs";
    solutionz="howshouldiknow";
  }

  public void setSolv(boolean f){
    solv=f;
  }

  public boolean getSolv(){
    return solv;
  }

  public void setSolutionz(String f){
    solutionz=f;
  }

  public String getSolutionz(){
    return solutionz;
  }

  public void setVIP(int f){
    VIPlvl=f;
  }

  public int getVIP(){
    return VIPlvl;
  }

  public String getProb(){
    return prob;
  }

  public int getIDnum(){
    return IDnum;
  }
}
