/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package organization;

// line 34 "../organization.ump"
public class Gender
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Gender Attributes
  private String male;
  private String female;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Gender(String aMale, String aFemale)
  {
    male = aMale;
    female = aFemale;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setMale(String aMale)
  {
    boolean wasSet = false;
    male = aMale;
    wasSet = true;
    return wasSet;
  }

  public boolean setFemale(String aFemale)
  {
    boolean wasSet = false;
    female = aFemale;
    wasSet = true;
    return wasSet;
  }

  public String getMale()
  {
    return male;
  }

  public String getFemale()
  {
    return female;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "male" + ":" + getMale()+ "," +
            "female" + ":" + getFemale()+ "]";
  }
}