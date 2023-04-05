package organization_test;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;
import organization.*;




public class OrganizationTest {

	String aName;
	Phone aPhone;
	String aCityName; 
	String aDistrictName; 
	String aStreetName;
	String aBuildingName;
	
	String aGivenName,aMiddleName,aFamilyName,aTitle,aBirthDate;
	Gender aGender;
	Date aJoined;
	Department aDepartment;
	
    //Hospital obj = new Hospital(aName, aPhone, aCityName, aDistrictName, aStreetName, aBuildingName);
    

    @Test
    public void testGetName() {
    	FullName name = new FullName("Ahmet", "Selami", "ŞAHİN");
    	assertEquals("Ahmet", name.getGivenName());
    }
    
	
    //AdministrativeStaff obj2 = new AdministrativeStaff( aGivenName, aMiddleName,  aFamilyName,  aGender,  aPhone,  aTitle,  aBirthDate, aCityName, aDistrictName, aStreetName, aBuildingName,  aJoined,  aDepartment); 
}
