/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package wards_and_teams;
import java.util.*;
import java.sql.Date;

// line 19 "../wards_and_teams.ump"
public class Patient
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Patient Attributes
  private String id;
  private Gender gender;
  private int age;
  private List<String> prescriptions;
  private List<String> allergies;
  private List<String> specialReqs;
  private Date accepted;
  private History sickness;

  //Patient Associations
  private Ward ward;
  private List<Doctor> doctors;
  private Team team;
  private ConsultantDoctor consultantDoctor;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetId;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Patient(String aId, Gender aGender, int aAge, Date aAccepted, History aSickness, Ward aWard, Team aTeam, ConsultantDoctor aConsultantDoctor)
  {
    cachedHashCode = -1;
    canSetId = true;
    id = aId;
    gender = aGender;
    age = aAge;
    prescriptions = new ArrayList<String>();
    allergies = new ArrayList<String>();
    specialReqs = new ArrayList<String>();
    accepted = aAccepted;
    sickness = aSickness;
    boolean didAddWard = setWard(aWard);
    if (!didAddWard)
    {
      throw new RuntimeException("Unable to create patient due to ward. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    doctors = new ArrayList<Doctor>();
    boolean didAddTeam = setTeam(aTeam);
    if (!didAddTeam)
    {
      throw new RuntimeException("Unable to create patient due to team. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    boolean didAddConsultantDoctor = setConsultantDoctor(aConsultantDoctor);
    if (!didAddConsultantDoctor)
    {
      throw new RuntimeException("Unable to create ultimateResponsibility due to consultantDoctor. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
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

  public boolean setGender(Gender aGender)
  {
    boolean wasSet = false;
    gender = aGender;
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

  public Gender getGender()
  {
    return gender;
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
  /* Code from template association_GetOne */
  public Ward getWard()
  {
    return ward;
  }
  /* Code from template association_GetMany */
  public Doctor getDoctor(int index)
  {
    Doctor aDoctor = doctors.get(index);
    return aDoctor;
  }

  public List<Doctor> getDoctors()
  {
    List<Doctor> newDoctors = Collections.unmodifiableList(doctors);
    return newDoctors;
  }

  public int numberOfDoctors()
  {
    int number = doctors.size();
    return number;
  }

  public boolean hasDoctors()
  {
    boolean has = doctors.size() > 0;
    return has;
  }

  public int indexOfDoctor(Doctor aDoctor)
  {
    int index = doctors.indexOf(aDoctor);
    return index;
  }
  /* Code from template association_GetOne */
  public Team getTeam()
  {
    return team;
  }
  /* Code from template association_GetOne */
  public ConsultantDoctor getConsultantDoctor()
  {
    return consultantDoctor;
  }
  /* Code from template association_SetOneToMany */
  public boolean setWard(Ward aWard)
  {
    boolean wasSet = false;
    if (aWard == null)
    {
      return wasSet;
    }

    Ward existingWard = ward;
    ward = aWard;
    if (existingWard != null && !existingWard.equals(aWard))
    {
      existingWard.removePatient(this);
    }
    ward.addPatient(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfDoctors()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addDoctor(Doctor aDoctor)
  {
    boolean wasAdded = false;
    if (doctors.contains(aDoctor)) { return false; }
    doctors.add(aDoctor);
    if (aDoctor.indexOfTreat(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDoctor.addTreat(this);
      if (!wasAdded)
      {
        doctors.remove(aDoctor);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeDoctor(Doctor aDoctor)
  {
    boolean wasRemoved = false;
    if (!doctors.contains(aDoctor))
    {
      return wasRemoved;
    }

    int oldIndex = doctors.indexOf(aDoctor);
    doctors.remove(oldIndex);
    if (aDoctor.indexOfTreat(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDoctor.removeTreat(this);
      if (!wasRemoved)
      {
        doctors.add(oldIndex,aDoctor);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addDoctorAt(Doctor aDoctor, int index)
  {  
    boolean wasAdded = false;
    if(addDoctor(aDoctor))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDoctors()) { index = numberOfDoctors() - 1; }
      doctors.remove(aDoctor);
      doctors.add(index, aDoctor);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDoctorAt(Doctor aDoctor, int index)
  {
    boolean wasAdded = false;
    if(doctors.contains(aDoctor))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDoctors()) { index = numberOfDoctors() - 1; }
      doctors.remove(aDoctor);
      doctors.add(index, aDoctor);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDoctorAt(aDoctor, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOneToMany */
  public boolean setTeam(Team aTeam)
  {
    boolean wasSet = false;
    if (aTeam == null)
    {
      return wasSet;
    }

    Team existingTeam = team;
    team = aTeam;
    if (existingTeam != null && !existingTeam.equals(aTeam))
    {
      existingTeam.removePatient(this);
    }
    team.addPatient(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToMany */
  public boolean setConsultantDoctor(ConsultantDoctor aConsultantDoctor)
  {
    boolean wasSet = false;
    if (aConsultantDoctor == null)
    {
      return wasSet;
    }

    ConsultantDoctor existingConsultantDoctor = consultantDoctor;
    consultantDoctor = aConsultantDoctor;
    if (existingConsultantDoctor != null && !existingConsultantDoctor.equals(aConsultantDoctor))
    {
      existingConsultantDoctor.removeUltimateResponsibility(this);
    }
    consultantDoctor.addUltimateResponsibility(this);
    wasSet = true;
    return wasSet;
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
    Ward placeholderWard = ward;
    this.ward = null;
    if(placeholderWard != null)
    {
      placeholderWard.removePatient(this);
    }
    ArrayList<Doctor> copyOfDoctors = new ArrayList<Doctor>(doctors);
    doctors.clear();
    for(Doctor aDoctor : copyOfDoctors)
    {
      aDoctor.removeTreat(this);
    }
    Team placeholderTeam = team;
    this.team = null;
    if(placeholderTeam != null)
    {
      placeholderTeam.removePatient(this);
    }
    ConsultantDoctor placeholderConsultantDoctor = consultantDoctor;
    this.consultantDoctor = null;
    if(placeholderConsultantDoctor != null)
    {
      placeholderConsultantDoctor.removeUltimateResponsibility(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "id" + ":" + getId()+ "," +
            "age" + ":" + getAge()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "gender" + "=" + (getGender() != null ? !getGender().equals(this)  ? getGender().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "accepted" + "=" + (getAccepted() != null ? !getAccepted().equals(this)  ? getAccepted().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "sickness" + "=" + (getSickness() != null ? !getSickness().equals(this)  ? getSickness().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "ward = "+(getWard()!=null?Integer.toHexString(System.identityHashCode(getWard())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "team = "+(getTeam()!=null?Integer.toHexString(System.identityHashCode(getTeam())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "consultantDoctor = "+(getConsultantDoctor()!=null?Integer.toHexString(System.identityHashCode(getConsultantDoctor())):"null");
  }
}