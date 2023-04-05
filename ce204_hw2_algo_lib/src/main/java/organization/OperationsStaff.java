/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package organization;
import java.util.*;
import java.sql.Date;

// line 76 "../umple_project.ump"
public abstract class OperationsStaff extends Staff
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //OperationsStaff Associations
  private List<Patient> patients;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public OperationsStaff(String aGivenName, String aMiddleName, String aFamilyName, Gender aGender, Phone aPhone, String aTitle, Date aBirthDate, String aCityName, String aDistrictName, String aStreetName, String aBuildingName, Date aJoined, Department aDepartment)
  {
    super(aGivenName, aMiddleName, aFamilyName, aGender, aPhone, aTitle, aBirthDate, aCityName, aDistrictName, aStreetName, aBuildingName, aJoined, aDepartment);
    patients = new ArrayList<Patient>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /**
   * Retrieves the Patient at the specified index in the list of patients.
   * @param index The index of the Patient to retrieve.
   * @return The Patient at the specified index, or null if the index is out of bounds.
   */
  public Patient getPatient(int index)
  {
    Patient aPatient = patients.get(index);
    return aPatient;
  }
  
  /**
   * Retrieves an unmodifiable list of patients.
   * @return An unmodifiable list of patients.
   */
  public List<Patient> getPatients()
  {
    List<Patient> newPatients = Collections.unmodifiableList(patients);
    return newPatients;
  }
  /**
   * Retrieves the number of patients in the list.
   * @return The number of patients.
   * 
   */
  public int numberOfPatients()
  {
    int number = patients.size();
    return number;
  }
  /**
   * Check if the hospital has any patients.
   *
   * @return true if the hospital has patients, false otherwise.
   */
  
  public boolean hasPatients()
  {
    boolean has = patients.size() > 0;
    return has;
  }
  
  /**
   * Get the index of the given patient in the list of patients.
   *
   * @param aPatient The patient to search for.
   * @return The index of the patient in the list, or -1 if not found.
   */
  
  public int indexOfPatient(Patient aPatient)
  {
    int index = patients.indexOf(aPatient);
    return index;
  }
  
  /**
   * Get the minimum number of patients for the hospital.
   *
   * @return The minimum number of patients (which is always 0).
   */

  public static int minimumNumberOfPatients()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  /**
   * Adds a Patient to the list of patients associated with this OperationsStaff.
   * 
   * @param aPatient The Patient to be added.
   * @return true if the Patient was added successfully, false otherwise.
   */
  public boolean addPatient(Patient aPatient)
  {
    boolean wasAdded = false;
    if (patients.contains(aPatient)) { return false; }
    patients.add(aPatient);
    if (aPatient.indexOfOperationsStaff(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aPatient.addOperationsStaff(this);
      if (!wasAdded)
      {
        patients.remove(aPatient);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  /**
   * Removes a Patient from the list of patients associated with this OperationsStaff.
   * 
   * @param aPatient The Patient to be removed.
   * @return true if the Patient was removed successfully, false otherwise.
   */
  public boolean removePatient(Patient aPatient)
  {
    boolean wasRemoved = false;
    if (!patients.contains(aPatient))
    {
      return wasRemoved;
    }

    int oldIndex = patients.indexOf(aPatient);
    patients.remove(oldIndex);
    if (aPatient.indexOfOperationsStaff(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aPatient.removeOperationsStaff(this);
      if (!wasRemoved)
      {
        patients.add(oldIndex,aPatient);
      }
    }
    return wasRemoved;
  }
  
  
  /* Code from template association_AddIndexControlFunctions */
  /**
   * Adds a patient to the list of patients at the specified index. 
   * 
   *
   * @param aPatient The patient to be added.
   * @param index The index at which the patient is to be added.
   * @return True if the patient was added successfully, false otherwise.
   */
  public boolean addPatientAt(Patient aPatient, int index)
  {  
    boolean wasAdded = false;
    if(addPatient(aPatient))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPatients()) { index = numberOfPatients() - 1; }
      patients.remove(aPatient);
      patients.add(index, aPatient);
      wasAdded = true;
    }
    return wasAdded;
  }
  /**
   * Adds a patient to the list of patients at the specified index if the patient
   * is not already in the list.
   *
   * @param aPatient The patient to be added or moved.
   * @param index The index at which the patient is to be added or moved.
   * @return True if the patient was added or moved successfully, false otherwise.
   */
  public boolean addOrMovePatientAt(Patient aPatient, int index)
  {
    boolean wasAdded = false;
    if(patients.contains(aPatient))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPatients()) { index = numberOfPatients() - 1; }
      patients.remove(aPatient);
      patients.add(index, aPatient);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPatientAt(aPatient, index);
    }
    return wasAdded;
  }
  /**
   * Deletes the OperationsStaff object, removing all associated patients and removing this OperationsStaff
   * from the list of operations staff in each associated patient.
   *
   * @post All associated patients are removed from this OperationsStaff and this OperationsStaff is removed
   *       from the list of operations staff in each associated patient.
   */
  public void delete()
  {
    ArrayList<Patient> copyOfPatients = new ArrayList<Patient>(patients);
    patients.clear();
    for(Patient aPatient : copyOfPatients)
    {
      aPatient.removeOperationsStaff(this);
    }
    super.delete();
  }
}