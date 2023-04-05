/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package organization;
import java.sql.Date;
import java.util.*;

// line 93 "../umple_project.ump"
public abstract class Staff extends Person
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Staff Attributes
  private Date joined;
  private List<String> education;
  private List<String> certification;
  private List<String> languages;

  //Staff Associations
  private Department department;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Staff(String aGivenName, String aMiddleName, String aFamilyName, Gender aGender, Phone aPhone, String aTitle, Date aBirthDate, String aCityName, String aDistrictName, String aStreetName, String aBuildingName, Date aJoined, Department aDepartment)
  {
    super(aGivenName, aMiddleName, aFamilyName, aGender, aPhone, aTitle, aBirthDate, aCityName, aDistrictName, aStreetName, aBuildingName);
    joined = aJoined;
    education = new ArrayList<String>();
    certification = new ArrayList<String>();
    languages = new ArrayList<String>();
    boolean didAddDepartment = setDepartment(aDepartment);
    if (!didAddDepartment)
    {
      throw new RuntimeException("Unable to create staff due to department. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /**
   * Sets the "joined" attribute of the object to the specified value.
   *
   * @param aJoined The value to set for the "joined" attribute.
   * @return true if the "joined" attribute was successfully set, false otherwise.
   */
  public boolean setJoined(Date aJoined)
  {
    boolean wasSet = false;
    joined = aJoined;
    wasSet = true;
    return wasSet;
  }
  
  /* Code from template attribute_SetMany */
  /**
   * Adds a new education to the "education" attribute of the object.
   *
   * @param aEducation The education to be added to the "education" attribute.
   * @return true if the education was successfully added, false otherwise.
   */
  public boolean addEducation(String aEducation)
  {
    boolean wasAdded = false;
    wasAdded = education.add(aEducation);
    return wasAdded;
  }
  /**
   * Removes the specified education from the "education" attribute of the object.
   *
   * @param aEducation The education to be removed from the "education" attribute.
   * @return true if the education was successfully removed, false otherwise.
   */
  public boolean removeEducation(String aEducation)
  {
    boolean wasRemoved = false;
    wasRemoved = education.remove(aEducation);
    return wasRemoved;
  }
  /**
   * Sets the value of 'joined' attribute.
   *
   * @param aJoined The new value for 'joined' attribute.
   * @return true if the value was set successfully, false otherwise.
   */
  public boolean addCertification(String aCertification)
  {
    boolean wasAdded = false;
    wasAdded = certification.add(aCertification);
    return wasAdded;
  }
  /**
   * Removes a value from the 'certification' attribute.
   *
   * @param aCertification The value to be removed from 'certification' attribute.
   * @return true if the value was removed successfully, false otherwise.
   */
  public boolean removeCertification(String aCertification)
  {
    boolean wasRemoved = false;
    wasRemoved = certification.remove(aCertification);
    return wasRemoved;
  }
  
  /* Code from template attribute_SetMany */
  /**
   * Adds a new value to the 'languages' attribute.
   *
   * @param aLanguage The value to be added to 'languages' attribute.
   * @return true if the value was added successfully, false otherwise.
   */
  public boolean addLanguage(String aLanguage)
  {
    boolean wasAdded = false;
    wasAdded = languages.add(aLanguage);
    return wasAdded;
  }
  /**
   * @brief Removes a language from the list of languages.
   *
   * This method removes the specified language from the list of languages.
   *
   * @param aLanguage The language to be removed.
   * @return True if the language was successfully removed, false otherwise.
   */
  public boolean removeLanguage(String aLanguage)
  {
    boolean wasRemoved = false;
    wasRemoved = languages.remove(aLanguage);
    return wasRemoved;
  }
  /**
   * @brief Returns the "joined" date of the operations staff.
   *
   * This method retrieves the "joined" date of the operations staff.
   *
   * @return The "joined" date of the operations staff.
   */
  public Date getJoined()
  {
    return joined;
  }
  /* Code from template attribute_GetMany */
  public String getEducation(int index)
  {
    String aEducation = education.get(index);
    return aEducation;
  }
  /**
   * @brief Returns the education at the specified index.
   *
   * This method retrieves the education at the specified index in the list of educations.
   *
   * @param index The index of the education to retrieve.
   * @return The education at the specified index.
   */
  public String[] getEducation()
  {
    String[] newEducation = education.toArray(new String[education.size()]);
    return newEducation;
  }
  /**
   * @brief Returns the number of educations.
   *
   * This method retrieves the number of educations in the list of educations.
   *
   * @return The number of educations.
   */
  public int numberOfEducation()
  {
    int number = education.size();
    return number;
  }
  /**
   * Adds a certification to the list of certifications.
   * 
   * @param aCertification The certification to be added.
   * @return True if the certification was added successfully, false otherwise.
   */
  public boolean hasEducation()
  {
    boolean has = education.size() > 0;
    return has;
  }
  /**
   * Gets the index of the specified education in the list of educations.
   * 
   * @param aEducation The education to find the index of.
   * @return The index of the specified education, or -1 if not found.
   */
  public int indexOfEducation(String aEducation)
  {
    int index = education.indexOf(aEducation);
    return index;
  }
  /* Code from template attribute_GetMany */
  /**
   * Gets the certification at the specified index from the list of certifications.
   * 
   * @param index The index of the certification to be retrieved.
   * @return The certification at the specified index.
   */
  public String getCertification(int index)
  {
    String aCertification = certification.get(index);
    return aCertification;
  }
  /**
   * Gets all certifications as an array from the list of certifications.
   * 
   * @return An array of all certifications.
   */
  public String[] getCertification()
  {
    String[] newCertification = certification.toArray(new String[certification.size()]);
    return newCertification;
  }
  /**
   * @brief Returns the number of certifications.
   *
   * @return The number of certifications.
   */
  public int numberOfCertification()
  {
    int number = certification.size();
    return number;
  }
  /**
   * @brief Checks if there are any certifications.
   *
   * @return True if there are certifications, false otherwise.
   */
  public boolean hasCertification()
  {
    boolean has = certification.size() > 0;
    return has;
  }
  /**
   * @brief Returns the index of a specific certification.
   *
   * @param aCertification The certification to find the index of.
   * @return The index of the certification, or -1 if not found.
   */
  public int indexOfCertification(String aCertification)
  {
    int index = certification.indexOf(aCertification);
    return index;
  }
  /**
   * Retrieves the language at the specified index in the 'languages' list.
   *
   * @param index The index of the language to retrieve.
   * @return The language at the specified index.
   **/
  
  public String getLanguage(int index)
  {
    String aLanguage = languages.get(index);
    return aLanguage;
  }
  /**
   * Retrieves an array of all languages in the 'languages' list.
   *
   * @return An array of all languages in the 'languages' list.
   */
  public String[] getLanguages()
  {
    String[] newLanguages = languages.toArray(new String[languages.size()]);
    return newLanguages;
  }
  /**
   * Retrieves the number of languages in the 'languages' list.
   *
   * @return The number of languages in the 'languages' list.
   */
  public int numberOfLanguages()
  {
    int number = languages.size();
    return number;
  }

  public boolean hasLanguages()
  {
    boolean has = languages.size() > 0;
    return has;
  }

  public int indexOfLanguage(String aLanguage)
  {
    int index = languages.indexOf(aLanguage);
    return index;
  }
  /* Code from template association_GetOne */
  public Department getDepartment()
  {
    return department;
  }
  /* Code from template association_SetOneToMany */
  /**
   * @brief Set the department of this staff member.
   *
   * @param aDepartment The department to set for this staff member.
   * @return true if the department was successfully set, false otherwise.
   *
   * This method sets the department of this staff member to the provided department.
   * existing department and added to the new department.
   * This method returns true if the department was successfully set, and false otherwise.
   */
  public boolean setDepartment(Department aDepartment)
  {
    boolean wasSet = false;
    if (aDepartment == null)
    {
      return wasSet;
    }

    Department existingDepartment = department;
    department = aDepartment;
    if (existingDepartment != null && !existingDepartment.equals(aDepartment))
    {
      existingDepartment.removeStaff(this);
    }
    department.addStaff(this);
    wasSet = true;
    return wasSet;
  }
  /**
   * @brief Delete this staff member.
   *
   * This method deletes this staff member and removes it from the department it belongs to.
   * 
   * This method should be called when the staff member is no longer needed or should be removed
   * from the system.
   */
  public void delete()
  {
    Department placeholderDepartment = department;
    this.department = null;
    if(placeholderDepartment != null)
    {
      placeholderDepartment.removeStaff(this);
    }
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "joined" + "=" + (getJoined() != null ? !getJoined().equals(this)  ? getJoined().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "department = "+(getDepartment()!=null?Integer.toHexString(System.identityHashCode(getDepartment())):"null");
  }
}