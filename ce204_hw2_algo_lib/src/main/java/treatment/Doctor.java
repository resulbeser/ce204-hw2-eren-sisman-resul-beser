/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package treatment;
import java.util.*;

// line 8 "../treatment.ump"
public class Doctor
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Doctor Associations
  private List<Patient> patients;
  private List<Examination> examinations;
  private List<Prescription> write;
  private List<Treatment> treatments;
  private List<Diagnosis> make;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Doctor()
  {
    patients = new ArrayList<Patient>();
    examinations = new ArrayList<Examination>();
    write = new ArrayList<Prescription>();
    treatments = new ArrayList<Treatment>();
    make = new ArrayList<Diagnosis>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Patient getPatient(int index)
  {
    Patient aPatient = patients.get(index);
    return aPatient;
  }

  public List<Patient> getPatients()
  {
    List<Patient> newPatients = Collections.unmodifiableList(patients);
    return newPatients;
  }

  public int numberOfPatients()
  {
    int number = patients.size();
    return number;
  }

  public boolean hasPatients()
  {
    boolean has = patients.size() > 0;
    return has;
  }

  public int indexOfPatient(Patient aPatient)
  {
    int index = patients.indexOf(aPatient);
    return index;
  }
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
  /* Code from template association_GetMany */
  public Prescription getWrite(int index)
  {
    Prescription aWrite = write.get(index);
    return aWrite;
  }

  public List<Prescription> getWrite()
  {
    List<Prescription> newWrite = Collections.unmodifiableList(write);
    return newWrite;
  }

  public int numberOfWrite()
  {
    int number = write.size();
    return number;
  }

  public boolean hasWrite()
  {
    boolean has = write.size() > 0;
    return has;
  }

  public int indexOfWrite(Prescription aWrite)
  {
    int index = write.indexOf(aWrite);
    return index;
  }
  /* Code from template association_GetMany */
  public Treatment getTreatment(int index)
  {
    Treatment aTreatment = treatments.get(index);
    return aTreatment;
  }

  public List<Treatment> getTreatments()
  {
    List<Treatment> newTreatments = Collections.unmodifiableList(treatments);
    return newTreatments;
  }

  public int numberOfTreatments()
  {
    int number = treatments.size();
    return number;
  }

  public boolean hasTreatments()
  {
    boolean has = treatments.size() > 0;
    return has;
  }

  public int indexOfTreatment(Treatment aTreatment)
  {
    int index = treatments.indexOf(aTreatment);
    return index;
  }
  /* Code from template association_GetMany */
  public Diagnosis getMake(int index)
  {
    Diagnosis aMake = make.get(index);
    return aMake;
  }

  public List<Diagnosis> getMake()
  {
    List<Diagnosis> newMake = Collections.unmodifiableList(make);
    return newMake;
  }

  public int numberOfMake()
  {
    int number = make.size();
    return number;
  }

  public boolean hasMake()
  {
    boolean has = make.size() > 0;
    return has;
  }

  public int indexOfMake(Diagnosis aMake)
  {
    int index = make.indexOf(aMake);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPatients()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addPatient(Patient aPatient)
  {
    boolean wasAdded = false;
    if (patients.contains(aPatient)) { return false; }
    patients.add(aPatient);
    if (aPatient.indexOfDoctor(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aPatient.addDoctor(this);
      if (!wasAdded)
      {
        patients.remove(aPatient);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removePatient(Patient aPatient)
  {
    boolean wasRemoved = false;
    if (!patients.contains(aPatient))
    {
      return wasRemoved;
    }

    int oldIndex = patients.indexOf(aPatient);
    patients.remove(oldIndex);
    if (aPatient.indexOfDoctor(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aPatient.removeDoctor(this);
      if (!wasRemoved)
      {
        patients.add(oldIndex,aPatient);
      }
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
      if(index > numberOfPatients()) { index = numberOfPatients() - 1; }
      patients.remove(aPatient);
      patients.add(index, aPatient);
      wasAdded = true;
    }
    return wasAdded;
  }

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
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfExaminations()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Examination addExamination(Patient aPatient)
  {
    return new Examination(aPatient, this);
  }

  public boolean addExamination(Examination aExamination)
  {
    boolean wasAdded = false;
    if (examinations.contains(aExamination)) { return false; }
    Doctor existingDoctor = aExamination.getDoctor();
    boolean isNewDoctor = existingDoctor != null && !this.equals(existingDoctor);
    if (isNewDoctor)
    {
      aExamination.setDoctor(this);
    }
    else
    {
      examinations.add(aExamination);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeExamination(Examination aExamination)
  {
    boolean wasRemoved = false;
    //Unable to remove aExamination, as it must always have a doctor
    if (!this.equals(aExamination.getDoctor()))
    {
      examinations.remove(aExamination);
      wasRemoved = true;
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
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfWrite()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addWrite(Prescription aWrite)
  {
    boolean wasAdded = false;
    if (write.contains(aWrite)) { return false; }
    write.add(aWrite);
    if (aWrite.indexOfDoctor(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aWrite.addDoctor(this);
      if (!wasAdded)
      {
        write.remove(aWrite);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeWrite(Prescription aWrite)
  {
    boolean wasRemoved = false;
    if (!write.contains(aWrite))
    {
      return wasRemoved;
    }

    int oldIndex = write.indexOf(aWrite);
    write.remove(oldIndex);
    if (aWrite.indexOfDoctor(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aWrite.removeDoctor(this);
      if (!wasRemoved)
      {
        write.add(oldIndex,aWrite);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addWriteAt(Prescription aWrite, int index)
  {  
    boolean wasAdded = false;
    if(addWrite(aWrite))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWrite()) { index = numberOfWrite() - 1; }
      write.remove(aWrite);
      write.add(index, aWrite);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveWriteAt(Prescription aWrite, int index)
  {
    boolean wasAdded = false;
    if(write.contains(aWrite))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWrite()) { index = numberOfWrite() - 1; }
      write.remove(aWrite);
      write.add(index, aWrite);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addWriteAt(aWrite, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfTreatments()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addTreatment(Treatment aTreatment)
  {
    boolean wasAdded = false;
    if (treatments.contains(aTreatment)) { return false; }
    treatments.add(aTreatment);
    if (aTreatment.indexOfDoctor(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aTreatment.addDoctor(this);
      if (!wasAdded)
      {
        treatments.remove(aTreatment);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeTreatment(Treatment aTreatment)
  {
    boolean wasRemoved = false;
    if (!treatments.contains(aTreatment))
    {
      return wasRemoved;
    }

    int oldIndex = treatments.indexOf(aTreatment);
    treatments.remove(oldIndex);
    if (aTreatment.indexOfDoctor(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aTreatment.removeDoctor(this);
      if (!wasRemoved)
      {
        treatments.add(oldIndex,aTreatment);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addTreatmentAt(Treatment aTreatment, int index)
  {  
    boolean wasAdded = false;
    if(addTreatment(aTreatment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTreatments()) { index = numberOfTreatments() - 1; }
      treatments.remove(aTreatment);
      treatments.add(index, aTreatment);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTreatmentAt(Treatment aTreatment, int index)
  {
    boolean wasAdded = false;
    if(treatments.contains(aTreatment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTreatments()) { index = numberOfTreatments() - 1; }
      treatments.remove(aTreatment);
      treatments.add(index, aTreatment);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTreatmentAt(aTreatment, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMake()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addMake(Diagnosis aMake)
  {
    boolean wasAdded = false;
    if (make.contains(aMake)) { return false; }
    make.add(aMake);
    if (aMake.indexOfDoctor(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aMake.addDoctor(this);
      if (!wasAdded)
      {
        make.remove(aMake);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeMake(Diagnosis aMake)
  {
    boolean wasRemoved = false;
    if (!make.contains(aMake))
    {
      return wasRemoved;
    }

    int oldIndex = make.indexOf(aMake);
    make.remove(oldIndex);
    if (aMake.indexOfDoctor(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aMake.removeDoctor(this);
      if (!wasRemoved)
      {
        make.add(oldIndex,aMake);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addMakeAt(Diagnosis aMake, int index)
  {  
    boolean wasAdded = false;
    if(addMake(aMake))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMake()) { index = numberOfMake() - 1; }
      make.remove(aMake);
      make.add(index, aMake);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMakeAt(Diagnosis aMake, int index)
  {
    boolean wasAdded = false;
    if(make.contains(aMake))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMake()) { index = numberOfMake() - 1; }
      make.remove(aMake);
      make.add(index, aMake);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMakeAt(aMake, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Patient> copyOfPatients = new ArrayList<Patient>(patients);
    patients.clear();
    for(Patient aPatient : copyOfPatients)
    {
      aPatient.removeDoctor(this);
    }
    for(int i=examinations.size(); i > 0; i--)
    {
      Examination aExamination = examinations.get(i - 1);
      aExamination.delete();
    }
    ArrayList<Prescription> copyOfWrite = new ArrayList<Prescription>(write);
    write.clear();
    for(Prescription aWrite : copyOfWrite)
    {
      aWrite.removeDoctor(this);
    }
    ArrayList<Treatment> copyOfTreatments = new ArrayList<Treatment>(treatments);
    treatments.clear();
    for(Treatment aTreatment : copyOfTreatments)
    {
      aTreatment.removeDoctor(this);
    }
    ArrayList<Diagnosis> copyOfMake = new ArrayList<Diagnosis>(make);
    make.clear();
    for(Diagnosis aMake : copyOfMake)
    {
      aMake.removeDoctor(this);
    }
  }

}