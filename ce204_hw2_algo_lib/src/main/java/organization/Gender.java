/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package organization;

// line 34 "../umple_project.ump"
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
  
  /**
   * Sets the gender of the object as male.
   *
   * @param aMale The gender to be set. Must be a valid value for male.
   * @return True if the gender was set to male successfully, false otherwise.
   *
   * @post The gender of the object will be updated with the value "male".
   *
   * @note This method assumes that the "male" field is a valid field in the object.
   *       
   */
  
  public boolean setMale(String aMale)
  {
    boolean wasSet = false;
    male = aMale;
    wasSet = true;
    return wasSet;
  }
  /**
   * Sets the gender of the object as female.
   *
   * @param aFemale The gender to be set. Must be a valid value for female.
   * @return True if the gender was set to female successfully, false otherwise.
   *
   * @post The gender of the object will be updated with the value "female".
   *
   * @note This method assumes that the "female" field is a valid field in the object.
   *       
   */
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

  /**
   * Returns a string representation of the object.
   *
   * @return A string containing the string representation of the object, including the values of the "male" and "female" fields.
   *
   * @note This method assumes that the "male" and "female" fields are valid fields in the object and have corresponding getter methods.
   *       
   */
  public String toString()
  {
    return super.toString() + "["+
            "male" + ":" + getMale()+ "," +
            "female" + ":" + getFemale()+ "]";
  }
}