/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package organization;
import java.util.*;
import java.sql.Date;

// line 73 "../umple_project.ump"
public class Department
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Department Associations
  private Hospital hospital;
  private List<Staff> staffs;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Department(Hospital aHospital)
  {
    boolean didAddHospital = setHospital(aHospital);
    if (!didAddHospital)
    {
      throw new RuntimeException("Unable to create department due to hospital. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    staffs = new ArrayList<Staff>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public Hospital getHospital()
  {
    return hospital;
  }
  /* Code from template association_GetMany */
  public Staff getStaff(int index)
  {
    Staff aStaff = staffs.get(index);
    return aStaff;
  }

  public List<Staff> getStaffs()
  {
    List<Staff> newStaffs = Collections.unmodifiableList(staffs);
    return newStaffs;
  }
  /**
   * @brief Returns the number of staffs.
   *
   * This method returns the current number of staffs in the staffs list.
   *
   * @return The number of staffs as an integer.
   */
  public int numberOfStaffs()
  {
    int number = staffs.size();
    return number;
  }
  /**
   * @brief Checks if the administrative staffs list is not empty.
   * 
   * This method checks if the list of administrative staffs has at least one element.
   * 
   * @return true if the list has at least one staff, false otherwise.
   */
  
  public boolean hasStaffs()
  {
    boolean has = staffs.size() > 0;
    return has;
  }

  public int indexOfStaff(Staff aStaff)
  {
    int index = staffs.indexOf(aStaff);
    return index;
  }
  /* Code from template association_SetOneToMany */
  /**
   * @brief Sets the Hospital object associated with this Department.
   * 
   * This method sets the Hospital object associated with this Department.  
   *
   * 
   * @param aHospital The Hospital object to be set as the associated Hospital.
   * @return true if the Hospital object was set successfully, false if the provided Hospital object is null.
   * 
   * @see Hospital
   * @see hospital
   * @see Hospital#addDepartment(Department)
   * @see Hospital#removeDepartment(Department)
   * @see Department#equals(Object)
   * 
   */
  public boolean setHospital(Hospital aHospital)
  {
    boolean wasSet = false;
    if (aHospital == null)
    {
      return wasSet;
    }

    Hospital existingHospital = hospital;
    hospital = aHospital;
    if (existingHospital != null && !existingHospital.equals(aHospital))
    {
      existingHospital.removeDepartment(this);
    }
    hospital.addDepartment(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfStaffs()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */

  /**
   * @brief Adds a Staff object to the staffs list of the Department.
   * 
   * This method adds the specified Staff object to the staffs list of the Department. 
   * 
   * @param aStaff The Staff object to be added to the staffs list.
   * @return true if the Staff object was added successfully, false if it already exists in the list.
   * 
   * @see Staff
   * @see staffs
   * @see Department#equals(Object)
   * @see Staff#getDepartment()
   * @see Staff#setDepartment(Department)
   * 
   **/
  
  public boolean addStaff(Staff aStaff)
  {
    boolean wasAdded = false;
    if (staffs.contains(aStaff)) { return false; }
    Department existingDepartment = aStaff.getDepartment();
    boolean isNewDepartment = existingDepartment != null && !this.equals(existingDepartment);
    if (isNewDepartment)
    {
      aStaff.setDepartment(this);
    }
    else
    {
      staffs.add(aStaff);
    }
    wasAdded = true;
    return wasAdded;
  }
  
  /**
   * @brief Removes a Staff object from the staffs list of the Department.
   * 
   * This method removes the specified Staff object from the staffs list of the Department, if and only
   * if the Department associated with the Staff object is not equal to this Department object. In other
   * words, a Staff object can only be removed if it currently belongs to a different Department.
   * 
   * @param aStaff The Staff object to be removed from the staffs list.
   * @return true if the Staff object was removed successfully, false otherwise.
   * 
   * @see Staff
   * @see staffs
   * @see Department#equals(Object)
   * @see Staff#getDepartment()
   **/
  
  public boolean removeStaff(Staff aStaff)
  {
    boolean wasRemoved = false;
    //Unable to remove aStaff, as it must always have a department
    if (!this.equals(aStaff.getDepartment()))
    {
      staffs.remove(aStaff);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addStaffAt(Staff aStaff, int index)
  {  
    boolean wasAdded = false;
    if(addStaff(aStaff))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStaffs()) { index = numberOfStaffs() - 1; }
      staffs.remove(aStaff);
      staffs.add(index, aStaff);
      wasAdded = true;
    }
    return wasAdded;
  }
  /**
   * @brief Adds or moves a Staff object at the specified index in the staffs list.
   * 
   * This method either adds a new Staff object at the specified index in the staffs list, or moves
   * an existing Staff object to the specified index. 
   * 
   * @param aStaff The Staff object to be added or moved.
   * @param index The index where the Staff object should be added or moved.
   * @return true if the Staff object was added or moved successfully, false otherwise.
   * 
   * @see Staff
   * @see staffs
   */
  
  public boolean addOrMoveStaffAt(Staff aStaff, int index)
  {
    boolean wasAdded = false;
    if(staffs.contains(aStaff))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStaffs()) { index = numberOfStaffs() - 1; }
      staffs.remove(aStaff);
      staffs.add(index, aStaff);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addStaffAt(aStaff, index);
    }
    return wasAdded;
  }
  
  /**
   * @brief Deletes the Department object and associated staff.
   * 
   * This method sets the associated hospital to null, removes the department from the hospital's
   * list of departments, and deletes all the staff objects associated with this department.
   * 
   * @note Caller's responsibility to properly dispose the Department object after calling this method.
   * 
   * @see Staff#delete()
   */
  
  public void delete()
  {
    Hospital placeholderHospital = hospital;
    this.hospital = null;
    if(placeholderHospital != null)
    {
      placeholderHospital.removeDepartment(this);
    }
    while (staffs.size() > 0)
    {
      Staff aStaff = staffs.get(staffs.size() - 1);
      aStaff.delete();
      staffs.remove(aStaff);
    }
    
  }

}