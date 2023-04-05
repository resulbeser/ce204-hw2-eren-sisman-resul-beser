/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package organization;
import java.sql.Date;
import java.util.*;

// line 13 "../organization.ump"
public abstract class Person
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Person Attributes
  private String givenName;
  private String middleName;
  private String familyName;
  private FullName name;
  private Gender gender;
  private Phone phone;
  private String title;
  private Date birthDate;
  private Address homeAddress;
  private String cityName;
  private String districtName;
  private String streetName;
  private String buildingName;

  //Person Associations
  private List<Hospital> hospitals;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Person(String aGivenName, String aMiddleName, String aFamilyName, Gender aGender, Phone aPhone, String aTitle, Date aBirthDate, String aCityName, String aDistrictName, String aStreetName, String aBuildingName)
  {
    givenName = aGivenName;
    middleName = aMiddleName;
    familyName = aFamilyName;
    name = new FullName (givenName, middleName, familyName);
    gender = aGender;
    phone = aPhone;
    title = aTitle;
    birthDate = aBirthDate;
    homeAddress = new Address (cityName, districtName, streetName, buildingName);
    cityName = aCityName;
    districtName = aDistrictName;
    streetName = aStreetName;
    buildingName = aBuildingName;
    hospitals = new ArrayList<Hospital>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setGivenName(String aGivenName)
  {
    boolean wasSet = false;
    givenName = aGivenName;
    wasSet = true;
    return wasSet;
  }

  public boolean setMiddleName(String aMiddleName)
  {
    boolean wasSet = false;
    middleName = aMiddleName;
    wasSet = true;
    return wasSet;
  }

  public boolean setFamilyName(String aFamilyName)
  {
    boolean wasSet = false;
    familyName = aFamilyName;
    wasSet = true;
    return wasSet;
  }

  public boolean setName(FullName aName)
  {
    boolean wasSet = false;
    name = aName;
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

  public boolean setPhone(Phone aPhone)
  {
    boolean wasSet = false;
    phone = aPhone;
    wasSet = true;
    return wasSet;
  }

  public boolean setTitle(String aTitle)
  {
    boolean wasSet = false;
    title = aTitle;
    wasSet = true;
    return wasSet;
  }

  public boolean setBirthDate(Date aBirthDate)
  {
    boolean wasSet = false;
    birthDate = aBirthDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setHomeAddress(Address aHomeAddress)
  {
    boolean wasSet = false;
    homeAddress = aHomeAddress;
    wasSet = true;
    return wasSet;
  }

  public boolean setCityName(String aCityName)
  {
    boolean wasSet = false;
    cityName = aCityName;
    wasSet = true;
    return wasSet;
  }

  public boolean setDistrictName(String aDistrictName)
  {
    boolean wasSet = false;
    districtName = aDistrictName;
    wasSet = true;
    return wasSet;
  }

  public boolean setStreetName(String aStreetName)
  {
    boolean wasSet = false;
    streetName = aStreetName;
    wasSet = true;
    return wasSet;
  }

  public boolean setBuildingName(String aBuildingName)
  {
    boolean wasSet = false;
    buildingName = aBuildingName;
    wasSet = true;
    return wasSet;
  }

  public String getGivenName()
  {
    return givenName;
  }

  public String getMiddleName()
  {
    return middleName;
  }

  public String getFamilyName()
  {
    return familyName;
  }

  public FullName getName()
  {
    return name;
  }

  public Gender getGender()
  {
    return gender;
  }

  public Phone getPhone()
  {
    return phone;
  }

  public String getTitle()
  {
    return title;
  }

  public Date getBirthDate()
  {
    return birthDate;
  }

  public Address getHomeAddress()
  {
    return homeAddress;
  }

  public String getCityName()
  {
    return cityName;
  }

  public String getDistrictName()
  {
    return districtName;
  }

  public String getStreetName()
  {
    return streetName;
  }

  public String getBuildingName()
  {
    return buildingName;
  }
  /* Code from template association_GetMany */
  public Hospital getHospital(int index)
  {
    Hospital aHospital = hospitals.get(index);
    return aHospital;
  }

  public List<Hospital> getHospitals()
  {
    List<Hospital> newHospitals = Collections.unmodifiableList(hospitals);
    return newHospitals;
  }

  public int numberOfHospitals()
  {
    int number = hospitals.size();
    return number;
  }

  public boolean hasHospitals()
  {
    boolean has = hospitals.size() > 0;
    return has;
  }

  public int indexOfHospital(Hospital aHospital)
  {
    int index = hospitals.indexOf(aHospital);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfHospitals()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addHospital(Hospital aHospital)
  {
    boolean wasAdded = false;
    if (hospitals.contains(aHospital)) { return false; }
    hospitals.add(aHospital);
    if (aHospital.indexOfPerson(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aHospital.addPerson(this);
      if (!wasAdded)
      {
        hospitals.remove(aHospital);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeHospital(Hospital aHospital)
  {
    boolean wasRemoved = false;
    if (!hospitals.contains(aHospital))
    {
      return wasRemoved;
    }

    int oldIndex = hospitals.indexOf(aHospital);
    hospitals.remove(oldIndex);
    if (aHospital.indexOfPerson(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aHospital.removePerson(this);
      if (!wasRemoved)
      {
        hospitals.add(oldIndex,aHospital);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addHospitalAt(Hospital aHospital, int index)
  {  
    boolean wasAdded = false;
    if(addHospital(aHospital))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfHospitals()) { index = numberOfHospitals() - 1; }
      hospitals.remove(aHospital);
      hospitals.add(index, aHospital);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveHospitalAt(Hospital aHospital, int index)
  {
    boolean wasAdded = false;
    if(hospitals.contains(aHospital))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfHospitals()) { index = numberOfHospitals() - 1; }
      hospitals.remove(aHospital);
      hospitals.add(index, aHospital);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addHospitalAt(aHospital, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Hospital> copyOfHospitals = new ArrayList<Hospital>(hospitals);
    hospitals.clear();
    for(Hospital aHospital : copyOfHospitals)
    {
      aHospital.removePerson(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "givenName" + ":" + getGivenName()+ "," +
            "middleName" + ":" + getMiddleName()+ "," +
            "familyName" + ":" + getFamilyName()+ "," +
            "title" + ":" + getTitle()+ "," +
            "cityName" + ":" + getCityName()+ "," +
            "districtName" + ":" + getDistrictName()+ "," +
            "streetName" + ":" + getStreetName()+ "," +
            "buildingName" + ":" + getBuildingName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "name" + "=" + (getName() != null ? !getName().equals(this)  ? getName().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "gender" + "=" + (getGender() != null ? !getGender().equals(this)  ? getGender().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "phone" + "=" + (getPhone() != null ? !getPhone().equals(this)  ? getPhone().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "birthDate" + "=" + (getBirthDate() != null ? !getBirthDate().equals(this)  ? getBirthDate().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "homeAddress" + "=" + (getHomeAddress() != null ? !getHomeAddress().equals(this)  ? getHomeAddress().toString().replaceAll("  ","    ") : "this" : "null");
  }
}