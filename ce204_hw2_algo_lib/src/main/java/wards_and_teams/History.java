/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package wards_and_teams;

// line 76 "../wards_and_teams.ump"
public class History
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //History Attributes
  private String sicknesses;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public History(String aSicknesses)
  {
    sicknesses = aSicknesses;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setSicknesses(String aSicknesses)
  {
    boolean wasSet = false;
    sicknesses = aSicknesses;
    wasSet = true;
    return wasSet;
  }

  public String getSicknesses()
  {
    return sicknesses;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "sicknesses" + ":" + getSicknesses()+ "]";
  }
}