/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package wards_and_teams;
import java.util.*;
import java.sql.Date;

// line 2 "../wards_and_teams.ump"
public class Ward
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ward Attributes
  private String name;
  private Gender patientsGender;
  private int capacity;

  //Ward Associations
  private List<Patient> patient;
  private Hospital hospital;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ward(String aName, Gender aPatientsGender, int aCapacity, Hospital aHospital)
  {
    cachedHashCode = -1;
    canSetName = true;
    name = aName;
    patientsGender = aPatientsGender;
    capacity = aCapacity;
    patient = new ArrayList<Patient>();
    boolean didAddHospital = setHospital(aHospital);
    if (!didAddHospital)
    {
      throw new RuntimeException("Unable to create ward due to hospital. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    if (!canSetName) { return false; }
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setPatientsGender(Gender aPatientsGender)
  {
    boolean wasSet = false;
    patientsGender = aPatientsGender;
    wasSet = true;
    return wasSet;
  }

  public boolean setCapacity(int aCapacity)
  {
    boolean wasSet = false;
    capacity = aCapacity;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public Gender getPatientsGender()
  {
    return patientsGender;
  }

  public int getCapacity()
  {
    return capacity;
  }
  /* Code from template association_GetMany */
  public Patient getPatient(int index)
  {
    Patient aPatient = patient.get(index);
    return aPatient;
  }

  public List<Patient> getPatient()
  {
    List<Patient> newPatient = Collections.unmodifiableList(patient);
    return newPatient;
  }

  public int numberOfPatient()
  {
    int number = patient.size();
    return number;
  }

  public boolean hasPatient()
  {
    boolean has = patient.size() > 0;
    return has;
  }

  public int indexOfPatient(Patient aPatient)
  {
    int index = patient.indexOf(aPatient);
    return index;
  }
  /* Code from template association_GetOne */
  public Hospital getHospital()
  {
    return hospital;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPatient()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Patient addPatient(String aId, Gender aGender, int aAge, Date aAccepted, History aSickness, Team aTeam, ConsultantDoctor aConsultantDoctor)
  {
    return new Patient(aId, aGender, aAge, aAccepted, aSickness, this, aTeam, aConsultantDoctor);
  }

  public boolean addPatient(Patient aPatient)
  {
    boolean wasAdded = false;
    if (patient.contains(aPatient)) { return false; }
    Ward existingWard = aPatient.getWard();
    boolean isNewWard = existingWard != null && !this.equals(existingWard);
    if (isNewWard)
    {
      aPatient.setWard(this);
    }
    else
    {
      patient.add(aPatient);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePatient(Patient aPatient)
  {
    boolean wasRemoved = false;
    //Unable to remove aPatient, as it must always have a ward
    if (!this.equals(aPatient.getWard()))
    {
      patient.remove(aPatient);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPatientAt(Patient aPatient, int index)
  {  
    boolean wasAdded = false;
    if(addPatient(aPatient))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPatient()) { index = numberOfPatient() - 1; }
      patient.remove(aPatient);
      patient.add(index, aPatient);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePatientAt(Patient aPatient, int index)
  {
    boolean wasAdded = false;
    if(patient.contains(aPatient))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPatient()) { index = numberOfPatient() - 1; }
      patient.remove(aPatient);
      patient.add(index, aPatient);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPatientAt(aPatient, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOneToMany */
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
      existingHospital.removeWard(this);
    }
    hospital.addWard(this);
    wasSet = true;
    return wasSet;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    Ward compareTo = (Ward)obj;
  
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

  public void delete()
  {
    for(int i=patient.size(); i > 0; i--)
    {
      Patient aPatient = patient.get(i - 1);
      aPatient.delete();
    }
    Hospital placeholderHospital = hospital;
    this.hospital = null;
    if(placeholderHospital != null)
    {
      placeholderHospital.removeWard(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "capacity" + ":" + getCapacity()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "patientsGender" + "=" + (getPatientsGender() != null ? !getPatientsGender().equals(this)  ? getPatientsGender().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "hospital = "+(getHospital()!=null?Integer.toHexString(System.identityHashCode(getHospital())):"null");
  }
}