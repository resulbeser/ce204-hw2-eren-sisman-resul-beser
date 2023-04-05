/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package organization;
import java.util.*;

// line 2 "../umple_project.ump"
public class Hospital
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Hospital Attributes
  private String name;
  private Phone phone;
  private Address address;
  private String cityName;
  private String districtName;
  private String streetName;
  private String buildingName;

  //Hospital Associations
  private List<Person> persons;
  private List<Department> departments;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Hospital(String aName, Phone aPhone, String aCityName, String aDistrictName, String aStreetName, String aBuildingName)
  {
    cachedHashCode = -1;
    canSetName = true;
    name = aName;
    phone = aPhone;
    address = new Address (cityName, districtName, streetName, buildingName);
    cityName = aCityName;
    districtName = aDistrictName;
    streetName = aStreetName;
    buildingName = aBuildingName;
    persons = new ArrayList<Person>();
    departments = new ArrayList<Department>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  
  /**
   * Sets the name of an object.
   *
   * @param aName The name to be set.
   * @return true if the name was successfully set, false otherwise.
   *
   * @note The name will not be set if the object's canSetName flag is false.
   * 
   */

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    if (!canSetName) { return false; }
    name = aName;
    wasSet = true;
    return wasSet;
  }
  
  /**
   * @brief Sets the phone object for an object.
   *
   * @param aPhone The phone object to be set.
   * @return true if the phone object was successfully set, false otherwise.
   */

  public boolean setPhone(Phone aPhone)
  {
    boolean wasSet = false;
    phone = aPhone;
    wasSet = true;
    return wasSet;
  }
  /**
   * Sets the address object for an object.
   *
   * @param aAddress The address object to be set.
   * @return true if the address object was successfully set, false otherwise.
   */
  public boolean setAddress(Address aAddress)
  {
    boolean wasSet = false;
    address = aAddress;
    wasSet = true;
    return wasSet;
  }
  /**
   * Sets the name of the city for an object.
   *
   * @param aCityName The name of the city to be set.
   * @return true if the city name was successfully set, false otherwise.
   */
  public boolean setCityName(String aCityName)
  {
    boolean wasSet = false;
    cityName = aCityName;
    wasSet = true;
    return wasSet;
  }
  /**
   * Sets the name of the district for an object.
   *
   * @param aDistrictName The name of the district to be set.
   * @return true if the district name was successfully set, false otherwise.
   */
  public boolean setDistrictName(String aDistrictName)
  {
    boolean wasSet = false;
    districtName = aDistrictName;
    wasSet = true;
    return wasSet;
  }
  /**
   * Sets the name of the street for an object.
   *
   * @param aStreetName The name of the street to be set.
   * @return true if the street name was successfully set, false otherwise.
   */
  public boolean setStreetName(String aStreetName)
  {
    boolean wasSet = false;
    streetName = aStreetName;
    wasSet = true;
    return wasSet;
  }
  /**
   * Sets the building name for an address.
   *
   * @param aBuildingName The building name to set.
   * @return True if the building name was successfully set, false otherwise.
   */
  public boolean setBuildingName(String aBuildingName)
  {
    boolean wasSet = false;
    buildingName = aBuildingName;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public Phone getPhone()
  {
    return phone;
  }

  public Address getAddress()
  {
    return address;
  }

  public String getCityName()
  {
    return cityName;
  }

  public String getDistrictName()
  {
    return districtName;
  }

  public String getStreetName()
  {
    return streetName;
  }

  public String getBuildingName()
  {
    return buildingName;
  }
  /* Code from template association_GetMany */
  /**
   * Retrieves a Person object from the list of persons at the given index.
   *
   * @param index The index of the Person to retrieve.
   * @return The Person object at the specified index.
   */
  public Person getPerson(int index)
  {
    Person aPerson = persons.get(index);
    return aPerson;
  }
  /**
   * Retrieves an unmodifiable list of Person objects.
   *
   * @return An unmodifiable list of Person objects.
   */
  public List<Person> getPersons()
  {
    List<Person> newPersons = Collections.unmodifiableList(persons);
    return newPersons;
  }
  /**
   * Retrieves the number of Person objects in the list of persons.
   *
   * @return The number of Person objects in the list.
   */
  public int numberOfPersons()
  {
    int number = persons.size();
    return number;
  }
  /**
   * Check if the list of persons is not empty.
   *
   * @return true if the list of persons is not empty, false otherwise.
   */
  public boolean hasPersons()
  {
    boolean has = persons.size() > 0;
    return has;
  }
  /**
   * Get the index of the specified person in the list of persons.
   *
   * @param aPerson The person to find the index of.
   * @return The index of the specified person, or -1 if not found.
   */
  public int indexOfPerson(Person aPerson)
  {
    int index = persons.indexOf(aPerson);
    return index;
  }
  /* Code from template association_GetMany */
  /**
   * Get the department at the specified index from the list of departments.
   *
   * @param index The index of the department to get.
   * @return The department at the specified index.
   */
  public Department getDepartment(int index)
  {
    Department aDepartment = departments.get(index);
    return aDepartment;
  }
  /**
   * Get an unmodifiable list of departments.
   *
   * @return An unmodifiable list of departments.
   */
  public List<Department> getDepartments()
  {
    List<Department> newDepartments = Collections.unmodifiableList(departments);
    return newDepartments;
  }
  /**
   * @brief Returns the number of departments in this object.
   *
   * @return The number of departments.
   */
  public int numberOfDepartments()
  {
    int number = departments.size();
    return number;
  }
  /**
   * @brief Checks if this object has any departments.
   *
   * @return True if this object has at least one department, false otherwise.
   */

  public boolean hasDepartments()
  {
    boolean has = departments.size() > 0;
    return has;
  }
  /**
   * @brief Returns the index of the given department in the list of departments.
   *
   * @param aDepartment The department to find the index of.
   * @return The index of the department, or -1 if the department is not found.
   */
  public int indexOfDepartment(Department aDepartment)
  {
    int index = departments.indexOf(aDepartment);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPersons()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  /**
   * Adds a Person object to the list of persons associated with this Hospital.
   * 
   * @param aPerson The Person object to be added.
   * @return true if the Person object was successfully added, false otherwise.
   * @see Person#addHospital(Hospital)
   */
  public boolean addPerson(Person aPerson)
  {
    boolean wasAdded = false;
    if (persons.contains(aPerson)) { return false; }
    persons.add(aPerson);
    if (aPerson.indexOfHospital(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aPerson.addHospital(this);
      if (!wasAdded)
      {
        persons.remove(aPerson);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  /**
   * @brief Removes a Person from the list of persons associated with this Hospital.
   *
   * @param aPerson The Person to be removed.
   * @return true if the Person was successfully removed, false otherwise.
   */
  public boolean removePerson(Person aPerson)
  {
    boolean wasRemoved = false;
    if (!persons.contains(aPerson))
    {
      return wasRemoved;
    }

    int oldIndex = persons.indexOf(aPerson);
    persons.remove(oldIndex);
    if (aPerson.indexOfHospital(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aPerson.removeHospital(this);
      if (!wasRemoved)
      {
        persons.add(oldIndex,aPerson);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  /**
   * Adds a Person object to the list of persons at the specified index.
   *
   * @param aPerson The Person object to be added.
   * @param index The index at which the Person object should be added.
   * @return True if the Person object was added successfully, false otherwise.
   */
  public boolean addPersonAt(Person aPerson, int index)
  {  
    boolean wasAdded = false;
    if(addPerson(aPerson))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPersons()) { index = numberOfPersons() - 1; }
      persons.remove(aPerson);
      persons.add(index, aPerson);
      wasAdded = true;
    }
    return wasAdded;
  }
  /**
   * Adds a Person object to the list of persons at the specified index, or moves it to the specified index if it already exists in the list.
   *
   * @param aPerson The Person object to be added or moved.
   * @param index The index at which the Person object should be added or moved.
   * @return True if the Person object was added or moved successfully, false otherwise.
   */
  public boolean addOrMovePersonAt(Person aPerson, int index)
  {
    boolean wasAdded = false;
    if(persons.contains(aPerson))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPersons()) { index = numberOfPersons() - 1; }
      persons.remove(aPerson);
      persons.add(index, aPerson);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPersonAt(aPerson, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfDepartments()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Department addDepartment()
  {
    return new Department(this);
  }
  /**
   * 
   * Adds a department to the hospital.
   * 
   * @param aDepartment The department to be added.
   * @return true if the department was added successfully, false otherwise.
   * 
   */
  public boolean addDepartment(Department aDepartment)
  {
    boolean wasAdded = false;
    if (departments.contains(aDepartment)) { return false; }
    Hospital existingHospital = aDepartment.getHospital();
    boolean isNewHospital = existingHospital != null && !this.equals(existingHospital);
    if (isNewHospital)
    {
      aDepartment.setHospital(this);
    }
    else
    {
      departments.add(aDepartment);
    }
    wasAdded = true;
    return wasAdded;
  }
  /**
   * 
   * Removes a department from the hospital.
   * 
   * @param aDepartment The department to be removed.
   * @return true if the department was removed successfully, false otherwise.
   *         Note: This method will always return false, as a department must always have a hospital.
   */
  public boolean removeDepartment(Department aDepartment)
  {
    boolean wasRemoved = false;
    //Unable to remove aDepartment, as it must always have a hospital
    if (!this.equals(aDepartment.getHospital()))
    {
      departments.remove(aDepartment);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  /**
   * Adds a Department object to the list of departments at the specified index.
   *
   * 
   * @param aDepartment The Department object to be added.
   * @param index The index at which the Department object should be added.
   * @return True if the Department object was successfully added, false otherwise.
   */
  public boolean addDepartmentAt(Department aDepartment, int index)
  {  
    boolean wasAdded = false;
    if(addDepartment(aDepartment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDepartments()) { index = numberOfDepartments() - 1; }
      departments.remove(aDepartment);
      departments.add(index, aDepartment);
      wasAdded = true;
    }
    return wasAdded;
  }
  
  /**
   * Adds a Department object to the list of departments at the specified index, or moves it to the index if it already exists.
   * 
   * 
   * @param aDepartment The Department object to be added or moved.
   * @param index The index at which the Department object should be added or moved.
   * 
   * @return True if the Department object was successfully added or moved, false otherwise.
   */
  public boolean addOrMoveDepartmentAt(Department aDepartment, int index)
  {
    boolean wasAdded = false;
    if(departments.contains(aDepartment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDepartments()) { index = numberOfDepartments() - 1; }
      departments.remove(aDepartment);
      departments.add(index, aDepartment);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDepartmentAt(aDepartment, index);
    }
    return wasAdded;
  }
  
  /**
   * @brief Checks if this Hospital object is equal to the provided object.
   * @param The object to compare to.
   * 
   * @return Returns true if the objects are equal, false otherwise.
   */
  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    Hospital compareTo = (Hospital)obj;
  
    if (getName() == null && compareTo.getName() != null)
    {
      return false;
    }
    else if (getName() != null && !getName().equals(compareTo.getName()))
    {
      return false;
    }

    return true;
  }
  /**
   * 
   * @brief Calculates the hash code of this Hospital object.
   * 
   * @return Returns the hash code of the object.
   * 
   */
  public int hashCode()
  {
    if (cachedHashCode != -1)
    {
      return cachedHashCode;
    }
    cachedHashCode = 17;
    if (getName() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getName().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetName = false;
    return cachedHashCode;
  }
  
  /**
   * @brief Deletes this Hospital object and associated Persons and Departments.
   * 
   * @details Removes this Hospital from the Persons' list of hospitals and deletes all Departments
   * associated with this Hospital.
   **/
  
  public void delete()
  {
    ArrayList<Person> copyOfPersons = new ArrayList<Person>(persons);
    persons.clear();
    for(Person aPerson : copyOfPersons)
    {
      aPerson.removeHospital(this);
    }
    while (departments.size() > 0)
    {
      Department aDepartment = departments.get(departments.size() - 1);
      aDepartment.delete();
      departments.remove(aDepartment);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "cityName" + ":" + getCityName()+ "," +
            "districtName" + ":" + getDistrictName()+ "," +
            "streetName" + ":" + getStreetName()+ "," +
            "buildingName" + ":" + getBuildingName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "phone" + "=" + (getPhone() != null ? !getPhone().equals(this)  ? getPhone().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "address" + "=" + (getAddress() != null ? !getAddress().equals(this)  ? getAddress().toString().replaceAll("  ","    ") : "this" : "null");
  }
}