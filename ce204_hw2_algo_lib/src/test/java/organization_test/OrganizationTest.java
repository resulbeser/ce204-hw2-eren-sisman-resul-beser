package organization_test;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;
import organization.*;




public class OrganizationTest {

    @Test
    public void FullName_testGetGivenName() {
    	FullName name = new FullName("Ahmet", "Selami", "ŞAHİN");
    	assertEquals("Ahmet", name.getGivenName());
    }
    
    @Test
    public void FullName_testGetGivenName_2() {
    	FullName name = new FullName("Mehmet", "Eren", "ERBİL");
    	assertEquals("Mehmet", name.getGivenName());
    }
    @Test
    public void FullName_testGetGivenName_3() {
    	FullName name = new FullName("Sibel", "", "Demir");
    	assertEquals("Sibel", name.getGivenName());
    }
    @Test
    public void FullName_testGetMiddleName() {
    	FullName name = new FullName("Ahmet", "Selami", "ŞAHİN");
    	assertEquals("Selami", name.getMiddleName());
    }
    
    @Test
    public void FullName_testMiddleName_2() {
    	FullName name = new FullName("Mehmet", "Eren", "ERBİL");
    	assertEquals("Eren", name.getMiddleName());
    }
    @Test
    public void FullName_testGetMiddleName_3() {
    	FullName name = new FullName("Sibel", "", "Demir");
    	assertEquals("", name.getMiddleName());
    }
    @Test
    public void FullName_testGetFamilyName() {
    	FullName name = new FullName("Ahmet", "Selami", "ŞAHİN");
    	assertEquals("ŞAHİN", name.getFamilyName());
    }
    
    @Test
    public void FullName_testFamilyName_2() {
    	FullName name = new FullName("Mehmet", "Eren", "ERBİL");
    	assertEquals("ERBİL", name.getFamilyName());
    }
    @Test
    public void FullName_testGetFamilyName_3() {
    	FullName name = new FullName("Sibel", "", "Demir");
    	assertEquals("Demir", name.getFamilyName());
    }
    @Test
    public void FullName_testSetFamilyName_1() {
    	FullName name = new FullName("Mehmet", "Eren", "ERBİL");
        name.setFamilyName("AYDIN");
        assertEquals("AYDIN",name.getFamilyName());
    }
    @Test
    public void FullName_testSetFamilyName_2() {
    	FullName name = new FullName("Sibel", "", "DEMİR");
        name.setFamilyName("ŞİŞMAN");
        assertEquals("ŞİŞMAN",name.getFamilyName());
    }
    @Test
    public void FullName_testSetFamilyName_3() {
    	FullName name = new FullName("Yagiz", "Sedat", "ŞİMŞEK");
        name.setFamilyName("ÇEKİRDEK");
        assertEquals("ÇEKİRDEK",name.getFamilyName());
    }
    @Test
    public void FullName_testSetFullName_1() {
    	FullName name = new FullName("Mehmet", "Eren", "ERBİL");
    	name.setGivenName("Polat");
    	name.setMiddleName("Can");
    	name.setFamilyName("ALEMDAR");
        assertEquals("Polat",name.getGivenName());
        assertEquals("Can",name.getMiddleName());
        assertEquals("ALEMDAR",name.getFamilyName());
    }
    @Test
    public void FullName_testSetFullName_2() {
    	FullName name = new FullName("Ömer", "Can", "Yıldız");
    	name.setGivenName("Mahmut");
    	name.setMiddleName("Erdem");
    	name.setFamilyName("Tuncer");
        assertEquals("Mahmut",name.getGivenName());
        assertEquals("Erdem",name.getMiddleName());
        assertEquals("Tuncer",name.getFamilyName());
    }
    @Test
    public void FullName_testSetFullName_3() {
    	FullName name = new FullName("Ali", "Ahmet", "Atasoy");
    	name.setGivenName("Sencer");
    	name.setMiddleName("Resul");
    	name.setFamilyName("Karahanlı");
        assertEquals("Sencer",name.getGivenName());
        assertEquals("Resul",name.getMiddleName());
        assertEquals("Karahanlı",name.getFamilyName());
    }

    @Test
    public void Phone_testGetPhoneNumber_1() {
    	Phone obj = new Phone(53146886);
        assertEquals(53146886,obj.getPhoneNumber());
    }
    @Test
    public void Phone_testGetPhoneNumber_2() {
    	Phone obj = new Phone(99846894);
        assertEquals(99846894,obj.getPhoneNumber());
    }
    @Test
    public void Phone_testGetPhoneNumber_3() {
    	Phone obj = new Phone(46259961);
        assertEquals(46259961,obj.getPhoneNumber());
    }
    @Test
    public void Phone_testSetPhoneNumber_1() {
    	Phone obj = new Phone(53146886);
        obj.setPhoneNumber(53346894);
        assertEquals(53346894,obj.getPhoneNumber());
    }
    @Test
    public void Phone_testSetPhoneNumber_2() {
    	Phone obj = new Phone(54146886);
        obj.setPhoneNumber(99846894);
        assertEquals(99846894,obj.getPhoneNumber());
    }
    @Test
    public void Phone_testSetPhoneNumber_3() {
    	Phone obj = new Phone(2336961);
        obj.setPhoneNumber(46259961);
        assertEquals(46259961,obj.getPhoneNumber());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    @Test
    public void Hospital_testGetPhone_1() {
      Phone phone = new Phone(123456789);
      Hospital hospital = new Hospital("Farabi Hastanesi", phone, "Trabzon", "Ortahisar", "Hastane sok.", "No:1");
      assertEquals(phone, hospital.getPhone());
    }
    
    @Test
    public void Hospital_testSetPhone_1() {
        Phone phone = new Phone(5678901);
        phone.setPhoneNumber(46259961);
        Hospital hospital = new Hospital("Imperial Hastanesi", phone , "İstanbul", "Beşiktaş", "Barbaros Bulvarı", "No: 1");
        assertEquals(phone,hospital.getPhone());

    }
    
    @Test
    public void Hospital_testGetName_1() {
    	Phone phone = new Phone(53369161);
      Hospital hospital = new Hospital("Farabi Hastanesi", phone, "Trabzon", "Ortahisar", "Hastane sok.", "No:1");
      assertEquals("Farabi Hastanesi", hospital.getName());
    }
    
    @Test
    public void Hospital_testGetAddress_1() {
      Phone phone = new Phone(53369161);
      Address address = new Address("Trabzon", "Ortahisar", "Hastane Sok.", "No:1");
      Hospital hospital = new Hospital("Farabi Hastanesi", phone, "Trabzon", "Ortahisar", "Hastane sok.", "No:1");
      hospital.setAddress(address);
      assertEquals(address, hospital.getAddress());
    }
    
    @Test
    public void Hospital_testSetAddress_1() {
      Phone phone = new Phone(53369161);
      Address address = new Address("Trabzon", "Ortahisar", "Hastane Sok.", "No:1");
      Hospital hospital = new Hospital("Imperial Hastanesi", phone , "İstanbul", "Beşiktaş", "Barbaros Bulvarı", "No: 1");
      hospital.setAddress(address);
      assertEquals(address, hospital.getAddress());
    }
    
    @Test
    public void Hospital_testSetAddress_2() {
      Phone phone = new Phone(53369161);
      Address address = new Address("İstanbul", "Beşiktaş", "Cudibey Sok.", "No:5");
      Hospital hospital = new Hospital("Farabi Hastanesi", phone, "Trabzon", "Ortahisar", "Hastane sok.", "No:1");
      hospital.setAddress(address);
      assertEquals(address, hospital.getAddress());
    }
    
    @Test
    public void Gender_testSetMale_1() {
      Gender gender = new Gender("Male", "Female");
      gender.setMale("M");
      assertEquals("M", gender.getMale());
    }

    @Test
    public void Gender_testSetFemale_1() {
      Gender gender = new Gender("Male", "Female");
      gender.setFemale("F");
      assertEquals("F", gender.getFemale());
    }

    @Test
    public void Gender_testGetMale_1() {
      Gender gender = new Gender("Male", "Female");
      assertEquals("Male", gender.getMale());
    }

    @Test
    public void Gender_testGetFemale_1() {
      Gender gender = new Gender("Male", "Female");
      assertEquals("Female", gender.getFemale());
    }
    @Test
    public void Gender_testGetFemale_2() {
      Gender gender = new Gender("Man", "Woman");
      assertEquals("Woman", gender.getFemale());
    }
    
    @Test
    public void Department_testGetHospital_1() {
      Hospital hospital = new Hospital("Numune Hast.", new Phone(123456789), "Trabzon", "Ortahisar", "Erdoğdu", "No:5");
      Department department = new Department(hospital);
      assertEquals(hospital, department.getHospital());
    }

    @Test
    public void Department_testSetHospital_1() {
      Hospital hospital1 = new Hospital("Numune Hast.", new Phone(123456789), "Trabzon", "Ortahisar", "Erdoğdu", "No:5");
      Hospital hospital2 = new Hospital("Haçkalı Hast.", new Phone(123456789), "Trabzon", "Akçaabat", "101. Sok.", "No:8");
      Department department = new Department(hospital1);
      department.setHospital(hospital2);
      assertEquals(hospital2, department.getHospital());
    }
    @Test
    public void History_testSetSicknesses_1() {
      History history = new History("Flu");
      history.setSicknesses("Cold");
      assertEquals("Cold", history.getSicknesses());
    }

    @Test
    public void History_testGetSicknesses_1() {
      History history = new History("Flu");
      assertEquals("Flu", history.getSicknesses());
    }
    
    @Test
    public void testSetCityName() {
      Address address = new Address("New York", "Manhattan", "5th Ave", "Empire State Building");
      address.setCityName("Los Angeles");
      assertEquals("Los Angeles", address.getCityName());
    }

    @Test
    public void testSetDistrictName() {
      Address address = new Address("New York", "Manhattan", "5th Ave", "Empire State Building");
      address.setDistrictName("Brooklyn");
      assertEquals("Brooklyn", address.getDistrictName());
    }

    @Test
    public void testSetStreetName() {
      Address address = new Address("New York", "Manhattan", "5th Ave", "Empire State Building");
      address.setStreetName("Broadway");
      assertEquals("Broadway", address.getStreetName());
    }

    @Test
    public void testSetBuildingName() {
      Address address = new Address("New York", "Manhattan", "5th Ave", "Empire State Building");
      address.setBuildingName("Chrysler Building");
      assertEquals("Chrysler Building", address.getBuildingName());
    }

    @Test
    public void testGetCityName() {
      Address address = new Address("New York", "Manhattan", "5th Ave", "Empire State Building");
      assertEquals("New York", address.getCityName());
    }

    @Test
    public void testGetDistrictName() {
      Address address = new Address("New York", "Manhattan", "5th Ave", "Empire State Building");
      assertEquals("Manhattan", address.getDistrictName());
    }

    @Test
    public void testGetStreetName() {
      Address address = new Address("New York", "Manhattan", "5th Ave", "Empire State Building");
      assertEquals("5th Ave", address.getStreetName());
    }

    @Test
    public void testGetBuildingName() {
      Address address = new Address("New York", "Manhattan", "5th Ave", "Empire State Building");
      assertEquals("Empire State Building", address.getBuildingName());
    }
    
}
