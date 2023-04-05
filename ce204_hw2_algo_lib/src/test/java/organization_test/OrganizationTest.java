package organization_test;

import static org.junit.Assert.*;
import org.junit.Test;
import organization.Address;
import organization.AdministrativeStaff;
import organization.Department;
import organization.Doctor;
import organization.FrontDeskStaff;
import organization.FullName;
import organization.Gender;
import organization.History;
import organization.Hospital;
import organization.Nurse;
import organization.OperationsStaff;
import organization.Patient;
import organization.Person;
import organization.Phone;
import organization.Receptionist;
import organization.Staff;
import organization.Surgeon;
import organization.SurgicalTechnologist;
import organization.TechnicalStaff;
import organization.Technician;
import organization.Technologist;



public class OrganizationTest {

	@Test
	public void testSetName() {
		boolean wasSet = false;
	    String name = "testName";
	    wasSet = setName(name);
	    assertTrue(wasSet);
	
	}

}
