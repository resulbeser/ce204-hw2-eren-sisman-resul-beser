package treatment_test;

import static org.junit.Assert.*;
import org.junit.Test;
import treatment.*;


public class TreatmentTest {

	  @Test
	  public void testGetPrescription() {
	    Patient patient = new Patient();
	    Prescription prescription = new Prescription(patient);
	    Therapy therapy = new Therapy(patient, prescription);
	    assertEquals(prescription, therapy.getPrescription());
	  }

	  @Test
	  public void testSetPrescription() {
	    Patient patient = new Patient();
	    Prescription prescription = new Prescription(patient);
	    Therapy therapy = new Therapy(patient, prescription);
	    Prescription newPrescription = new Prescription(patient);
	    assertTrue(therapy.setPrescription(newPrescription));
	    assertEquals(newPrescription, therapy.getPrescription());
	    assertTrue(newPrescription.getTherapies().contains(therapy));
	    assertFalse(prescription.getTherapies().contains(therapy));
	  }

	  @Test
	  public void testGetPatient() {
	    Patient patient = new Patient();
	    Prescription prescription = new Prescription(patient);
	    Therapy therapy = new Therapy(patient, prescription);
	    assertEquals(patient, therapy.getPatient());
	  }

	  @Test
	  public void testSetPatient() {
	    Patient patient = new Patient();
	    Prescription prescription = new Prescription(patient);
	    Therapy therapy = new Therapy(patient, prescription);
	    Patient newPatient = new Patient();
	    assertTrue(therapy.setPatient(newPatient));
	    assertEquals(newPatient, therapy.getPatient());
	    assertTrue(newPatient.getTreatments().contains(therapy));
	    assertFalse(patient.getTreatments().contains(therapy));
	  }

	  @Test
	  public void testGetDoctor() {
	    Patient patient = new Patient();
	    Doctor doctor = new Doctor();
	    Examination examination = new Examination(patient, doctor);
	    assertEquals(doctor, examination.getDoctor());
	  }

	  @Test
	  public void testGetTherapy() {
	    Patient patient = new Patient();
	    Prescription prescription = new Prescription(patient);
	    Therapy therapy1 = new Therapy(patient, prescription);
	    Therapy therapy2 = new Therapy(patient, prescription);
	    prescription.addTherapy(therapy1);
	    prescription.addTherapy(therapy2);
	    assertEquals(therapy1, prescription.getTherapy(0));
	    assertEquals(therapy2, prescription.getTherapy(1));
	  }
	  
}
