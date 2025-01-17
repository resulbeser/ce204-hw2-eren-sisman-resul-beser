package wards_and_teams_test;

import static org.junit.Assert.*;
import org.junit.Test;


import wards_and_teams.*;

public class WardsAndTeamsTest {

	@Test
	  public void Address_testSetCityName_1() {
	    Address address = new Address("New York", "Manhattan", "5th Ave", "Empire State Building");
	    address.setCityName("Los Angeles");
	    assertEquals("Los Angeles", address.getCityName());
	  }

	  @Test
	  public void Address_testSetDistrictName() {
	    Address address = new Address("New York", "Manhattan", "5th Ave", "Empire State Building");
	    address.setDistrictName("Brooklyn");
	    assertEquals("Brooklyn", address.getDistrictName());
	  }

	  @Test
	  public void Address_testSetStreetName() {
	    Address address = new Address("New York", "Manhattan", "5th Ave", "Empire State Building");
	    address.setStreetName("Broadway");
	    assertEquals("Broadway", address.getStreetName());
	  }

	  @Test
	  public void Address_testSetBuildingName() {
	    Address address = new Address("New York", "Manhattan", "5th Ave", "Empire State Building");
	    address.setBuildingName("Chrysler Building");
	    assertEquals("Chrysler Building", address.getBuildingName());
	  }

	  @Test
	  public void Address_testGetCityName() {
	    Address address = new Address("New York", "Manhattan", "5th Ave", "Empire State Building");
	    assertEquals("New York", address.getCityName());
	  }

	  @Test
	  public void Address_testGetDistrictName() {
	    Address address = new Address("New York", "Manhattan", "5th Ave", "Empire State Building");
	    assertEquals("Manhattan", address.getDistrictName());
	  }

	  @Test
	  public void Address_testGetStreetName() {
	    Address address = new Address("New York", "Manhattan", "5th Ave", "Empire State Building");
	    assertEquals("5th Ave", address.getStreetName());
	  }

	  @Test
	  public void Address_testGetBuildingName() {
	    Address address = new Address("New York", "Manhattan", "5th Ave", "Empire State Building");
	    assertEquals("Empire State Building", address.getBuildingName());
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
	    public void testConstructor() {
	      JuniorDoctor juniorDoctor = new JuniorDoctor();
	      assertNotNull(juniorDoctor);
	    }    


}
