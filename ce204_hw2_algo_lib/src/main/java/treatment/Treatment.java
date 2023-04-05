/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package treatment;
import java.util.*;

// line 35 "../treatment.ump"
public abstract class Treatment
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Treatment Associations
  private Patient patient;
  private List<Doctor> doctors;
  private List<Diagnosis> diagnosis;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Treatment(Patient aPatient)
  {
    boolean didAddPatient = setPatient(aPatient);
    if (!didAddPatient)
    {
      throw new RuntimeException("Unable to create treatment due to patient. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    doctors = new ArrayList<Doctor>();
    diagnosis = new ArrayList<Diagnosis>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public Patient getPatient()
  {
    return patient;
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
  /* Code from template association_GetMany */
  public Diagnosis getDiagnosi(int index)
  {
    Diagnosis aDiagnosi = diagnosis.get(index);
    return aDiagnosi;
  }

  public List<Diagnosis> getDiagnosis()
  {
    List<Diagnosis> newDiagnosis = Collections.unmodifiableList(diagnosis);
    return newDiagnosis;
  }

  public int numberOfDiagnosis()
  {
    int number = diagnosis.size();
    return number;
  }

  public boolean hasDiagnosis()
  {
    boolean has = diagnosis.size() > 0;
    return has;
  }

  public int indexOfDiagnosi(Diagnosis aDiagnosi)
  {
    int index = diagnosis.indexOf(aDiagnosi);
    return index;
  }
  /* Code from template association_SetOneToMany */
  public boolean setPatient(Patient aPatient)
  {
    boolean wasSet = false;
    if (aPatient == null)
    {
      return wasSet;
    }

    Patient existingPatient = patient;
    patient = aPatient;
    if (existingPatient != null && !existingPatient.equals(aPatient))
    {
      existingPatient.removeTreatment(this);
    }
    patient.addTreatment(this);
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
    if (aDoctor.indexOfTreatment(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDoctor.addTreatment(this);
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
    if (aDoctor.indexOfTreatment(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDoctor.removeTreatment(this);
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
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfDiagnosis()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addDiagnosi(Diagnosis aDiagnosi)
  {
    boolean wasAdded = false;
    if (diagnosis.contains(aDiagnosi)) { return false; }
    diagnosis.add(aDiagnosi);
    if (aDiagnosi.indexOfResultIn(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDiagnosi.addResultIn(this);
      if (!wasAdded)
      {
        diagnosis.remove(aDiagnosi);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeDiagnosi(Diagnosis aDiagnosi)
  {
    boolean wasRemoved = false;
    if (!diagnosis.contains(aDiagnosi))
    {
      return wasRemoved;
    }

    int oldIndex = diagnosis.indexOf(aDiagnosi);
    diagnosis.remove(oldIndex);
    if (aDiagnosi.indexOfResultIn(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDiagnosi.removeResultIn(this);
      if (!wasRemoved)
      {
        diagnosis.add(oldIndex,aDiagnosi);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addDiagnosiAt(Diagnosis aDiagnosi, int index)
  {  
    boolean wasAdded = false;
    if(addDiagnosi(aDiagnosi))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDiagnosis()) { index = numberOfDiagnosis() - 1; }
      diagnosis.remove(aDiagnosi);
      diagnosis.add(index, aDiagnosi);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDiagnosiAt(Diagnosis aDiagnosi, int index)
  {
    boolean wasAdded = false;
    if(diagnosis.contains(aDiagnosi))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDiagnosis()) { index = numberOfDiagnosis() - 1; }
      diagnosis.remove(aDiagnosi);
      diagnosis.add(index, aDiagnosi);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDiagnosiAt(aDiagnosi, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    Patient placeholderPatient = patient;
    this.patient = null;
    if(placeholderPatient != null)
    {
      placeholderPatient.removeTreatment(this);
    }
    ArrayList<Doctor> copyOfDoctors = new ArrayList<Doctor>(doctors);
    doctors.clear();
    for(Doctor aDoctor : copyOfDoctors)
    {
      aDoctor.removeTreatment(this);
    }
    ArrayList<Diagnosis> copyOfDiagnosis = new ArrayList<Diagnosis>(diagnosis);
    diagnosis.clear();
    for(Diagnosis aDiagnosi : copyOfDiagnosis)
    {
      aDiagnosi.removeResultIn(this);
    }
  }

}