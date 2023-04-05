/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package organization;

// line 62 "../umple_project.ump"
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
  
  /**
   * @brief Sets the value of the "sicknesses" field.
   *
   * @param aSicknesses A string representing the sicknesses to be set.
   * @return True if the value was successfully set, false otherwise.
   *
   * @note This method assumes that the "sicknesses" field is a valid field in the object and has corresponding getter and setter methods.
   *      
   */
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

  /**
   * 
   * @brief Returns a string representation of the object, including the value of the "sicknesses" field.
   *
   * @return A string representation of the object, including the value of the "sicknesses" field.
   *
   * @note This method assumes that the "sicknesses" field is a valid field in the object and has a corresponding getter method.
   *       
   *       
   */

  public String toString()
  {
    return super.toString() + "["+
            "sicknesses" + ":" + getSicknesses()+ "]";
  }
}