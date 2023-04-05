/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package organization;
import java.sql.Date;
import java.util.*;

// line 129 "../organization.ump"
public class SurgicalTechnologist extends Technologist
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public SurgicalTechnologist(String aGivenName, String aMiddleName, String aFamilyName, Gender aGender, Phone aPhone, String aTitle, Date aBirthDate, String aCityName, String aDistrictName, String aStreetName, String aBuildingName, Date aJoined, Department aDepartment)
  {
    super(aGivenName, aMiddleName, aFamilyName, aGender, aPhone, aTitle, aBirthDate, aCityName, aDistrictName, aStreetName, aBuildingName, aJoined, aDepartment);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

}