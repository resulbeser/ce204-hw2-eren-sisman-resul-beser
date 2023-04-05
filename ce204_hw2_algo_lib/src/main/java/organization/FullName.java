/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package organization;

// line 29 "../organization.ump"
public class FullName
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //FullName Attributes
  private String givenName;
  private String middleName;
  private String familyName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public FullName(String aGivenName, String aMiddleName, String aFamilyName)
  {
    givenName = aGivenName;
    middleName = aMiddleName;
    familyName = aFamilyName;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setGivenName(String aGivenName)
  {
    boolean wasSet = false;
    givenName = aGivenName;
    wasSet = true;
    return wasSet;
  }

  public boolean setMiddleName(String aMiddleName)
  {
    boolean wasSet = false;
    middleName = aMiddleName;
    wasSet = true;
    return wasSet;
  }

  public boolean setFamilyName(String aFamilyName)
  {
    boolean wasSet = false;
    familyName = aFamilyName;
    wasSet = true;
    return wasSet;
  }

  public String getGivenName()
  {
    return givenName;
  }

  public String getMiddleName()
  {
    return middleName;
  }

  public String getFamilyName()
  {
    return familyName;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "givenName" + ":" + getGivenName()+ "," +
            "middleName" + ":" + getMiddleName()+ "," +
            "familyName" + ":" + getFamilyName()+ "]";
  }
}