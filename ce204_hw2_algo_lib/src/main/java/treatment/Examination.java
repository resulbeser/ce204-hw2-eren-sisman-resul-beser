/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package treatment;
import java.util.*;

// line 16 "../treatment.ump"
public class Examination
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Examination Associations
  private Patient patient;
  private Doctor doctor;
  private List<Diagnosis> diagnosis;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Examination(Patient aPatient, Doctor aDoctor)
  {
    boolean didAddPatient = setPatient(aPatient);
    if (!didAddPatient)
    {
      throw new RuntimeException("Unable to create examination due to patient. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    boolean didAddDoctor = setDoctor(aDoctor);
    if (!didAddDoctor)
    {
      throw new RuntimeException("Unable to create examination due to doctor. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
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
  /* Code from template association_GetOne */
  public Doctor getDoctor()
  {
    return doctor;
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
      existingPatient.removeExamination(this);
    }
    patient.addExamination(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToMany */
  public boolean setDoctor(Doctor aDoctor)
  {
    boolean wasSet = false;
    if (aDoctor == null)
    {
      return wasSet;
    }

    Doctor existingDoctor = doctor;
    doctor = aDoctor;
    if (existingDoctor != null && !existingDoctor.equals(aDoctor))
    {
      existingDoctor.removeExamination(this);
    }
    doctor.addExamination(this);
    wasSet = true;
    return wasSet;
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
    if (aDiagnosi.indexOfExamination(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDiagnosi.addExamination(this);
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
    if (aDiagnosi.indexOfExamination(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDiagnosi.removeExamination(this);
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
      placeholderPatient.removeExamination(this);
    }
    Doctor placeholderDoctor = doctor;
    this.doctor = null;
    if(placeholderDoctor != null)
    {
      placeholderDoctor.removeExamination(this);
    }
    ArrayList<Diagnosis> copyOfDiagnosis = new ArrayList<Diagnosis>(diagnosis);
    diagnosis.clear();
    for(Diagnosis aDiagnosi : copyOfDiagnosis)
    {
      aDiagnosi.removeExamination(this);
    }
  }

}