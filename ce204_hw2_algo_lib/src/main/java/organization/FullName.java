/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package organization;

// line 29 "../umple_project.ump"
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
  
  /**
   * @brief Sets the given name of an object.
   *
   * @param aGivenName The given name to be set.
   * @return <code>true</code> if the given name was set successfully, <code>false</code> otherwise.
   */
  
  public boolean setGivenName(String aGivenName)
  {
    boolean wasSet = false;
    givenName = aGivenName;
    wasSet = true;
    return wasSet;
  }
  
  /**
   * Sets the middle name of the object.
   *
   * @param aMiddleName The middle name to be set.
   * @return True if the middle name was set successfully, false otherwise.
   *
   * @post The middle name of the object will be updated with the new value.
   *
   * @note This method assumes that the "middleName" field is a valid field in the object.
   *       
   */
  public boolean setMiddleName(String aMiddleName)
  {
    boolean wasSet = false;
    middleName = aMiddleName;
    wasSet = true;
    return wasSet;
  }
  
  /**
   * Sets the family name of the object.
   *
   * @param aFamilyName The family name to be set.
   * @return True if the family name was set successfully, false otherwise.
   *
   * @post The family name of the object will be updated with the new value.
   *
   * @note This method assumes that the "familyName" field is a valid field in the object.
   *     
   */

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