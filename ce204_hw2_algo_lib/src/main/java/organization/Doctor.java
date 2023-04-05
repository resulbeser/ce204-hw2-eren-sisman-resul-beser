/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package organization;
import java.util.*;
import java.sql.Date;

// line 67 "../umple_project.ump"
public class Doctor extends OperationsStaff
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Doctor Attributes
  private List<String> specialty;
  private List<String> locations;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Doctor(String aGivenName, String aMiddleName, String aFamilyName, Gender aGender, Phone aPhone, String aTitle, Date aBirthDate, String aCityName, String aDistrictName, String aStreetName, String aBuildingName, Date aJoined, Department aDepartment)
  {
    super(aGivenName, aMiddleName, aFamilyName, aGender, aPhone, aTitle, aBirthDate, aCityName, aDistrictName, aStreetName, aBuildingName, aJoined, aDepartment);
    specialty = new ArrayList<String>();
    locations = new ArrayList<String>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template attribute_SetMany */
  
  /**
   * @brief Adds a specialty to the list of specialties of this Department.
   * 
   * This method adds the specified specialty to the list of specialties of this Department. If the
   * specialty is already present in the list, it will not be added again, and false will be returned.
   * 
   * @param aSpecialty The specialty to be added to the list of specialties.
   * @return true if the specialty was added successfully, false if it already exists in the list.
   * 
   * @see specialty
   * 
   */
  
  public boolean addSpecialty(String aSpecialty)
  {
    boolean wasAdded = false;
    wasAdded = specialty.add(aSpecialty);
    return wasAdded;
  }
  
  /**
   * @brief Removes a specialty from the list of specialties of this Department.
   * 
   * This method removes the specified specialty from the list of specialties of this Department. 
   * 
   * @param aSpecialty The specialty to be removed from the list of specialties.
   * @return true if the specialty was removed successfully, false if it does not exist in the list.
   * 
   * @see specialty
   * 
   */
  
  public boolean removeSpecialty(String aSpecialty)
  {
    boolean wasRemoved = false;
    wasRemoved = specialty.remove(aSpecialty);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  
  /**
   * @brief Adds a location to the list of locations of this Department.
   * 
   * This method adds the specified location to the list of locations of this Department. 
   * 
   * @param aLocation The location to be added to the list of locations.
   * @return true if the location was added successfully, false if it already exists in the list.
   * 
   * @see locations
   * 
   **/
  
  public boolean addLocation(String aLocation)
  {
    boolean wasAdded = false;
    wasAdded = locations.add(aLocation);
    return wasAdded;
  }
  
  /**
   * @brief Removes a location from the list of locations of this Department.
   * 
   * This method removes the specified location from the list of locations of this Department. 
   * 
   * @param aLocation The location to be removed from the list of locations.
   * @return true if the location was removed successfully, false if it does not exist in the list.
   * 
   * @see locations
   * 
   **/
  
  public boolean removeLocation(String aLocation)
  {
    boolean wasRemoved = false;
    wasRemoved = locations.remove(aLocation);
    return wasRemoved;
  }
  
  /**
   * @brief Retrieves the specialty at the specified index in the list of specialties of this Department.
   * 
   * This method retrieves the specialty at the specified index in the list of specialties of this Department.
   * 
   * @param index The index of the specialty to retrieve.
   * @return The specialty at the specified index, or null if the index is out of bounds.
   * 
   * @see specialty
   * 
   **/
  
  public String getSpecialty(int index)
  {
    String aSpecialty = specialty.get(index);
    return aSpecialty;
  }
  
  /**
   * 
   * @brief Retrieves the list of specialties of this Department as an array of strings.
   * 
   * This method retrieves the list of specialties of this Department as an array of strings. The order
   * of specialties in the returned array is the same as the order in the internal list.
   * 
   * @return An array of strings representing the list of specialties of this Department.
   * 
   * @see specialty
   * 
   **/
  
  public String[] getSpecialty()
  {
    String[] newSpecialty = specialty.toArray(new String[specialty.size()]);
    return newSpecialty;
  }
  
  /**
   * 
   * @brief Retrieves the number of specialties in this Department.
   * 
   * This method retrieves the number of specialties in this Department by querying the size of the internal
   * list of specialties.
   * 
   * @return An integer representing the number of specialties in this Department.
   * 
   * @see specialty
   * 
   **/
  
  public int numberOfSpecialty()
  {
    int number = specialty.size();
    return number;
  }
  
  /**
   * @brief Checks if this Department has any specialties.
   * 
   * This method checks if this Department has any specialties by querying the size of the internal list
   * of specialties and determining if it is greater than 0.
   * 
   * @return true if this Department has any specialties, false otherwise.
   * 
   * @see specialty
   * 
   **/
  
  public boolean hasSpecialty()
  {
    boolean has = specialty.size() > 0;
    return has;
  }
  
  /**
   * 
   * @brief Returns the index of the given specialty in the list of specialties.
   *
   * @param aSpecialty The specialty to find the index of.
   * @return The index of the specialty in the list, or -1 if not found.
   *
   *
   **/
  
  public int indexOfSpecialty(String aSpecialty)
  {
    int index = specialty.indexOf(aSpecialty);
    return index;
  }
  
  /**
   * 
   * Retrieves the location at the specified index from the list of locations.
   *
   * @param index The index of the location to retrieve.
   * 
   * @return The location at the specified index.
   * 
   * 
   **/
  
  public String getLocation(int index)
  {
    String aLocation = locations.get(index);
    return aLocation;
  }
  
  /**
   * 
   * @brief Retrieve an array of all the locations.
   *
   * @return A string array containing all the locations.
   * 
   */
  
  public String[] getLocations()
  {
    String[] newLocations = locations.toArray(new String[locations.size()]);
    return newLocations;
  }
  /**
   * Returns the number of locations in the collection.
   *
   * @return The number of locations.
   */
  
  public int numberOfLocations()
  {
    int number = locations.size();
    return number;
  }
  
  /**
   * 
   * @brief Checks if the "locations" list has any elements.
   * 
   * @return true if the "locations" list has at least one element, false otherwise.
   * 
   */
  
  public boolean hasLocations()
  {
    boolean has = locations.size() > 0;
    return has;
  }
  
  /**
*
*  Returns the index of the specified location in the locations list.
*  
*  @param aLocation The location to be searched for in the locations list.
*  @return The index of the specified location in the locations list, or -1 if the location is not found.
*  
*  
**/
  
  public int indexOfLocation(String aLocation)
  {
    int index = locations.indexOf(aLocation);
    return index;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}