/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package treatment;
import java.util.*;

// line 21 "../treatment.ump"
public class Diagnosis
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Diagnosis Associations
  private List<Examination> examinations;
  private Patient patient;
  private List<Doctor> doctors;
  private List<Treatment> resultIn;
  private List<Prescription> resultsIn;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Diagnosis(Patient aPatient)
  {
    examinations = new ArrayList<Examination>();
    boolean didAddPatient = setPatient(aPatient);
    if (!didAddPatient)
    {
      throw new RuntimeException("Unable to create diagnosi due to patient. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    doctors = new ArrayList<Doctor>();
    resultIn = new ArrayList<Treatment>();
    resultsIn = new ArrayList<Prescription>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Examination getExamination(int index)
  {
    Examination aExamination = examinations.get(index);
    return aExamination;
  }

  public List<Examination> getExaminations()
  {
    List<Examination> newExaminations = Collections.unmodifiableList(examinations);
    return newExaminations;
  }

  public int numberOfExaminations()
  {
    int number = examinations.size();
    return number;
  }

  public boolean hasExaminations()
  {
    boolean has = examinations.size() > 0;
    return has;
  }

  public int indexOfExamination(Examination aExamination)
  {
    int index = examinations.indexOf(aExamination);
    return index;
  }
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
  public Treatment getResultIn(int index)
  {
    Treatment aResultIn = resultIn.get(index);
    return aResultIn;
  }

  public List<Treatment> getResultIn()
  {
    List<Treatment> newResultIn = Collections.unmodifiableList(resultIn);
    return newResultIn;
  }

  public int numberOfResultIn()
  {
    int number = resultIn.size();
    return number;
  }

  public boolean hasResultIn()
  {
    boolean has = resultIn.size() > 0;
    return has;
  }

  public int indexOfResultIn(Treatment aResultIn)
  {
    int index = resultIn.indexOf(aResultIn);
    return index;
  }
  /* Code from template association_GetMany */
  public Prescription getResultsIn(int index)
  {
    Prescription aResultsIn = resultsIn.get(index);
    return aResultsIn;
  }

  public List<Prescription> getResultsIn()
  {
    List<Prescription> newResultsIn = Collections.unmodifiableList(resultsIn);
    return newResultsIn;
  }

  public int numberOfResultsIn()
  {
    int number = resultsIn.size();
    return number;
  }

  public boolean hasResultsIn()
  {
    boolean has = resultsIn.size() > 0;
    return has;
  }

  public int indexOfResultsIn(Prescription aResultsIn)
  {
    int index = resultsIn.indexOf(aResultsIn);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfExaminations()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addExamination(Examination aExamination)
  {
    boolean wasAdded = false;
    if (examinations.contains(aExamination)) { return false; }
    examinations.add(aExamination);
    if (aExamination.indexOfDiagnosi(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aExamination.addDiagnosi(this);
      if (!wasAdded)
      {
        examinations.remove(aExamination);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeExamination(Examination aExamination)
  {
    boolean wasRemoved = false;
    if (!examinations.contains(aExamination))
    {
      return wasRemoved;
    }

    int oldIndex = examinations.indexOf(aExamination);
    examinations.remove(oldIndex);
    if (aExamination.indexOfDiagnosi(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aExamination.removeDiagnosi(this);
      if (!wasRemoved)
      {
        examinations.add(oldIndex,aExamination);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addExaminationAt(Examination aExamination, int index)
  {  
    boolean wasAdded = false;
    if(addExamination(aExamination))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfExaminations()) { index = numberOfExaminations() - 1; }
      examinations.remove(aExamination);
      examinations.add(index, aExamination);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveExaminationAt(Examination aExamination, int index)
  {
    boolean wasAdded = false;
    if(examinations.contains(aExamination))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfExaminations()) { index = numberOfExaminations() - 1; }
      examinations.remove(aExamination);
      examinations.add(index, aExamination);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addExaminationAt(aExamination, index);
    }
    return wasAdded;
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
      existingPatient.removeDiagnosi(this);
    }
    patient.addDiagnosi(this);
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
    if (aDoctor.indexOfMake(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDoctor.addMake(this);
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
    if (aDoctor.indexOfMake(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDoctor.removeMake(this);
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
  public static int minimumNumberOfResultIn()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addResultIn(Treatment aResultIn)
  {
    boolean wasAdded = false;
    if (resultIn.contains(aResultIn)) { return false; }
    resultIn.add(aResultIn);
    if (aResultIn.indexOfDiagnosi(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aResultIn.addDiagnosi(this);
      if (!wasAdded)
      {
        resultIn.remove(aResultIn);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeResultIn(Treatment aResultIn)
  {
    boolean wasRemoved = false;
    if (!resultIn.contains(aResultIn))
    {
      return wasRemoved;
    }

    int oldIndex = resultIn.indexOf(aResultIn);
    resultIn.remove(oldIndex);
    if (aResultIn.indexOfDiagnosi(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aResultIn.removeDiagnosi(this);
      if (!wasRemoved)
      {
        resultIn.add(oldIndex,aResultIn);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addResultInAt(Treatment aResultIn, int index)
  {  
    boolean wasAdded = false;
    if(addResultIn(aResultIn))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfResultIn()) { index = numberOfResultIn() - 1; }
      resultIn.remove(aResultIn);
      resultIn.add(index, aResultIn);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveResultInAt(Treatment aResultIn, int index)
  {
    boolean wasAdded = false;
    if(resultIn.contains(aResultIn))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfResultIn()) { index = numberOfResultIn() - 1; }
      resultIn.remove(aResultIn);
      resultIn.add(index, aResultIn);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addResultInAt(aResultIn, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfResultsIn()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addResultsIn(Prescription aResultsIn)
  {
    boolean wasAdded = false;
    if (resultsIn.contains(aResultsIn)) { return false; }
    resultsIn.add(aResultsIn);
    if (aResultsIn.indexOfDiagnosi(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aResultsIn.addDiagnosi(this);
      if (!wasAdded)
      {
        resultsIn.remove(aResultsIn);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeResultsIn(Prescription aResultsIn)
  {
    boolean wasRemoved = false;
    if (!resultsIn.contains(aResultsIn))
    {
      return wasRemoved;
    }

    int oldIndex = resultsIn.indexOf(aResultsIn);
    resultsIn.remove(oldIndex);
    if (aResultsIn.indexOfDiagnosi(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aResultsIn.removeDiagnosi(this);
      if (!wasRemoved)
      {
        resultsIn.add(oldIndex,aResultsIn);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addResultsInAt(Prescription aResultsIn, int index)
  {  
    boolean wasAdded = false;
    if(addResultsIn(aResultsIn))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfResultsIn()) { index = numberOfResultsIn() - 1; }
      resultsIn.remove(aResultsIn);
      resultsIn.add(index, aResultsIn);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveResultsInAt(Prescription aResultsIn, int index)
  {
    boolean wasAdded = false;
    if(resultsIn.contains(aResultsIn))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfResultsIn()) { index = numberOfResultsIn() - 1; }
      resultsIn.remove(aResultsIn);
      resultsIn.add(index, aResultsIn);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addResultsInAt(aResultsIn, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Examination> copyOfExaminations = new ArrayList<Examination>(examinations);
    examinations.clear();
    for(Examination aExamination : copyOfExaminations)
    {
      aExamination.removeDiagnosi(this);
    }
    Patient placeholderPatient = patient;
    this.patient = null;
    if(placeholderPatient != null)
    {
      placeholderPatient.removeDiagnosi(this);
    }
    ArrayList<Doctor> copyOfDoctors = new ArrayList<Doctor>(doctors);
    doctors.clear();
    for(Doctor aDoctor : copyOfDoctors)
    {
      aDoctor.removeMake(this);
    }
    ArrayList<Treatment> copyOfResultIn = new ArrayList<Treatment>(resultIn);
    resultIn.clear();
    for(Treatment aResultIn : copyOfResultIn)
    {
      aResultIn.removeDiagnosi(this);
    }
    ArrayList<Prescription> copyOfResultsIn = new ArrayList<Prescription>(resultsIn);
    resultsIn.clear();
    for(Prescription aResultsIn : copyOfResultsIn)
    {
      aResultsIn.removeDiagnosi(this);
    }
  }

}