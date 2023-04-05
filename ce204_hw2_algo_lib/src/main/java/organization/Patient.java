/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package organization;
import java.util.*;
import java.sql.Date;

// line 47 "../organization.ump"
public class Patient extends Person
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Patient Attributes
  private String id;
  private int age;
  private List<String> prescriptions;
  private List<String> allergies;
  private List<String> specialReqs;
  private Date accepted;
  private History sickness;

  //Patient Associations
  private List<OperationsStaff> operationsStaffs;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetId;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Patient(String aGivenName, String aMiddleName, String aFamilyName, Gender aGender, Phone aPhone, String aTitle, Date aBirthDate, String aCityName, String aDistrictName, String aStreetName, String aBuildingName, String aId, int aAge, Date aAccepted, History aSickness)
  {
    super(aGivenName, aMiddleName, aFamilyName, aGender, aPhone, aTitle, aBirthDate, aCityName, aDistrictName, aStreetName, aBuildingName);
    cachedHashCode = -1;
    canSetId = true;
    id = aId;
    age = aAge;
    prescriptions = new ArrayList<String>();
    allergies = new ArrayList<String>();
    specialReqs = new ArrayList<String>();
    accepted = aAccepted;
    sickness = aSickness;
    operationsStaffs = new ArrayList<OperationsStaff>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setId(String aId)
  {
    boolean wasSet = false;
    if (!canSetId) { return false; }
    id = aId;
    wasSet = true;
    return wasSet;
  }

  public boolean setAge(int aAge)
  {
    boolean wasSet = false;
    age = aAge;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addPrescription(String aPrescription)
  {
    boolean wasAdded = false;
    wasAdded = prescriptions.add(aPrescription);
    return wasAdded;
  }

  public boolean removePrescription(String aPrescription)
  {
    boolean wasRemoved = false;
    wasRemoved = prescriptions.remove(aPrescription);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  public boolean addAllergy(String aAllergy)
  {
    boolean wasAdded = false;
    wasAdded = allergies.add(aAllergy);
    return wasAdded;
  }

  public boolean removeAllergy(String aAllergy)
  {
    boolean wasRemoved = false;
    wasRemoved = allergies.remove(aAllergy);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  public boolean addSpecialReq(String aSpecialReq)
  {
    boolean wasAdded = false;
    wasAdded = specialReqs.add(aSpecialReq);
    return wasAdded;
  }

  public boolean removeSpecialReq(String aSpecialReq)
  {
    boolean wasRemoved = false;
    wasRemoved = specialReqs.remove(aSpecialReq);
    return wasRemoved;
  }

  public boolean setAccepted(Date aAccepted)
  {
    boolean wasSet = false;
    accepted = aAccepted;
    wasSet = true;
    return wasSet;
  }

  public boolean setSickness(History aSickness)
  {
    boolean wasSet = false;
    sickness = aSickness;
    wasSet = true;
    return wasSet;
  }

  public String getId()
  {
    return id;
  }

  public int getAge()
  {
    return age;
  }
  /* Code from template attribute_GetMany */
  public String getPrescription(int index)
  {
    String aPrescription = prescriptions.get(index);
    return aPrescription;
  }

  public String[] getPrescriptions()
  {
    String[] newPrescriptions = prescriptions.toArray(new String[prescriptions.size()]);
    return newPrescriptions;
  }

  public int numberOfPrescriptions()
  {
    int number = prescriptions.size();
    return number;
  }

  public boolean hasPrescriptions()
  {
    boolean has = prescriptions.size() > 0;
    return has;
  }

  public int indexOfPrescription(String aPrescription)
  {
    int index = prescriptions.indexOf(aPrescription);
    return index;
  }
  /* Code from template attribute_GetMany */
  public String getAllergy(int index)
  {
    String aAllergy = allergies.get(index);
    return aAllergy;
  }

  public String[] getAllergies()
  {
    String[] newAllergies = allergies.toArray(new String[allergies.size()]);
    return newAllergies;
  }

  public int numberOfAllergies()
  {
    int number = allergies.size();
    return number;
  }

  public boolean hasAllergies()
  {
    boolean has = allergies.size() > 0;
    return has;
  }

  public int indexOfAllergy(String aAllergy)
  {
    int index = allergies.indexOf(aAllergy);
    return index;
  }
  /* Code from template attribute_GetMany */
  public String getSpecialReq(int index)
  {
    String aSpecialReq = specialReqs.get(index);
    return aSpecialReq;
  }

  public String[] getSpecialReqs()
  {
    String[] newSpecialReqs = specialReqs.toArray(new String[specialReqs.size()]);
    return newSpecialReqs;
  }

  public int numberOfSpecialReqs()
  {
    int number = specialReqs.size();
    return number;
  }

  public boolean hasSpecialReqs()
  {
    boolean has = specialReqs.size() > 0;
    return has;
  }

  public int indexOfSpecialReq(String aSpecialReq)
  {
    int index = specialReqs.indexOf(aSpecialReq);
    return index;
  }

  public Date getAccepted()
  {
    return accepted;
  }

  public History getSickness()
  {
    return sickness;
  }
  /* Code from template association_GetMany */
  public OperationsStaff getOperationsStaff(int index)
  {
    OperationsStaff aOperationsStaff = operationsStaffs.get(index);
    return aOperationsStaff;
  }

  public List<OperationsStaff> getOperationsStaffs()
  {
    List<OperationsStaff> newOperationsStaffs = Collections.unmodifiableList(operationsStaffs);
    return newOperationsStaffs;
  }

  public int numberOfOperationsStaffs()
  {
    int number = operationsStaffs.size();
    return number;
  }

  public boolean hasOperationsStaffs()
  {
    boolean has = operationsStaffs.size() > 0;
    return has;
  }

  public int indexOfOperationsStaff(OperationsStaff aOperationsStaff)
  {
    int index = operationsStaffs.indexOf(aOperationsStaff);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfOperationsStaffs()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addOperationsStaff(OperationsStaff aOperationsStaff)
  {
    boolean wasAdded = false;
    if (operationsStaffs.contains(aOperationsStaff)) { return false; }
    operationsStaffs.add(aOperationsStaff);
    if (aOperationsStaff.indexOfPatient(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aOperationsStaff.addPatient(this);
      if (!wasAdded)
      {
        operationsStaffs.remove(aOperationsStaff);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeOperationsStaff(OperationsStaff aOperationsStaff)
  {
    boolean wasRemoved = false;
    if (!operationsStaffs.contains(aOperationsStaff))
    {
      return wasRemoved;
    }

    int oldIndex = operationsStaffs.indexOf(aOperationsStaff);
    operationsStaffs.remove(oldIndex);
    if (aOperationsStaff.indexOfPatient(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aOperationsStaff.removePatient(this);
      if (!wasRemoved)
      {
        operationsStaffs.add(oldIndex,aOperationsStaff);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addOperationsStaffAt(OperationsStaff aOperationsStaff, int index)
  {  
    boolean wasAdded = false;
    if(addOperationsStaff(aOperationsStaff))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOperationsStaffs()) { index = numberOfOperationsStaffs() - 1; }
      operationsStaffs.remove(aOperationsStaff);
      operationsStaffs.add(index, aOperationsStaff);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveOperationsStaffAt(OperationsStaff aOperationsStaff, int index)
  {
    boolean wasAdded = false;
    if(operationsStaffs.contains(aOperationsStaff))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOperationsStaffs()) { index = numberOfOperationsStaffs() - 1; }
      operationsStaffs.remove(aOperationsStaff);
      operationsStaffs.add(index, aOperationsStaff);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addOperationsStaffAt(aOperationsStaff, index);
    }
    return wasAdded;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    Patient compareTo = (Patient)obj;
  
    if (getId() == null && compareTo.getId() != null)
    {
      return false;
    }
    else if (getId() != null && !getId().equals(compareTo.getId()))
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
    if (getId() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getId().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetId = false;
    return cachedHashCode;
  }

  public void delete()
  {
    ArrayList<OperationsStaff> copyOfOperationsStaffs = new ArrayList<OperationsStaff>(operationsStaffs);
    operationsStaffs.clear();
    for(OperationsStaff aOperationsStaff : copyOfOperationsStaffs)
    {
      aOperationsStaff.removePatient(this);
    }
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "id" + ":" + getId()+ "," +
            "age" + ":" + getAge()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "accepted" + "=" + (getAccepted() != null ? !getAccepted().equals(this)  ? getAccepted().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "sickness" + "=" + (getSickness() != null ? !getSickness().equals(this)  ? getSickness().toString().replaceAll("  ","    ") : "this" : "null");
  }
}