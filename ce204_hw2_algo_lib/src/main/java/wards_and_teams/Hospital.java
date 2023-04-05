/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package wards_and_teams;
import java.util.*;

// line 47 "../wards_and_teams.ump"
public class Hospital
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Hospital Attributes
  private String name;
  private Phone phone;
  private String cityName;
  private String districtName;
  private String streetName;
  private String buildingName;
  private Address address;

  //Hospital Associations
  private List<Ward> wards;
  private List<Team> teams;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Hospital(String aName, Phone aPhone, String aCityName, String aDistrictName, String aStreetName, String aBuildingName)
  {
    cachedHashCode = -1;
    canSetName = true;
    name = aName;
    phone = aPhone;
    cityName = aCityName;
    districtName = aDistrictName;
    streetName = aStreetName;
    buildingName = aBuildingName;
    address = new Address (cityName, districtName, streetName, buildingName);
    wards = new ArrayList<Ward>();
    teams = new ArrayList<Team>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    if (!canSetName) { return false; }
    name = aName;
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

  public boolean setAddress(Address aAddress)
  {
    boolean wasSet = false;
    address = aAddress;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public Phone getPhone()
  {
    return phone;
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

  public Address getAddress()
  {
    return address;
  }
  /* Code from template association_GetMany */
  public Ward getWard(int index)
  {
    Ward aWard = wards.get(index);
    return aWard;
  }

  public List<Ward> getWards()
  {
    List<Ward> newWards = Collections.unmodifiableList(wards);
    return newWards;
  }

  public int numberOfWards()
  {
    int number = wards.size();
    return number;
  }

  public boolean hasWards()
  {
    boolean has = wards.size() > 0;
    return has;
  }

  public int indexOfWard(Ward aWard)
  {
    int index = wards.indexOf(aWard);
    return index;
  }
  /* Code from template association_GetMany */
  public Team getTeam(int index)
  {
    Team aTeam = teams.get(index);
    return aTeam;
  }

  public List<Team> getTeams()
  {
    List<Team> newTeams = Collections.unmodifiableList(teams);
    return newTeams;
  }

  public int numberOfTeams()
  {
    int number = teams.size();
    return number;
  }

  public boolean hasTeams()
  {
    boolean has = teams.size() > 0;
    return has;
  }

  public int indexOfTeam(Team aTeam)
  {
    int index = teams.indexOf(aTeam);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfWards()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Ward addWard(String aName, Gender aPatientsGender, int aCapacity)
  {
    return new Ward(aName, aPatientsGender, aCapacity, this);
  }

  public boolean addWard(Ward aWard)
  {
    boolean wasAdded = false;
    if (wards.contains(aWard)) { return false; }
    Hospital existingHospital = aWard.getHospital();
    boolean isNewHospital = existingHospital != null && !this.equals(existingHospital);
    if (isNewHospital)
    {
      aWard.setHospital(this);
    }
    else
    {
      wards.add(aWard);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeWard(Ward aWard)
  {
    boolean wasRemoved = false;
    //Unable to remove aWard, as it must always have a hospital
    if (!this.equals(aWard.getHospital()))
    {
      wards.remove(aWard);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addWardAt(Ward aWard, int index)
  {  
    boolean wasAdded = false;
    if(addWard(aWard))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWards()) { index = numberOfWards() - 1; }
      wards.remove(aWard);
      wards.add(index, aWard);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveWardAt(Ward aWard, int index)
  {
    boolean wasAdded = false;
    if(wards.contains(aWard))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWards()) { index = numberOfWards() - 1; }
      wards.remove(aWard);
      wards.add(index, aWard);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addWardAt(aWard, index);
    }
    return wasAdded;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfTeamsValid()
  {
    boolean isValid = numberOfTeams() >= minimumNumberOfTeams();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfTeams()
  {
    return 1;
  }
  /* Code from template association_AddMandatoryManyToOne */
  public Team addTeam(String aName, ConsultantDoctor aTeamLeader)
  {
    Team aNewTeam = new Team(aName, this, aTeamLeader);
    return aNewTeam;
  }

  public boolean addTeam(Team aTeam)
  {
    boolean wasAdded = false;
    if (teams.contains(aTeam)) { return false; }
    Hospital existingHospital = aTeam.getHospital();
    boolean isNewHospital = existingHospital != null && !this.equals(existingHospital);

    if (isNewHospital && existingHospital.numberOfTeams() <= minimumNumberOfTeams())
    {
      return wasAdded;
    }
    if (isNewHospital)
    {
      aTeam.setHospital(this);
    }
    else
    {
      teams.add(aTeam);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeTeam(Team aTeam)
  {
    boolean wasRemoved = false;
    //Unable to remove aTeam, as it must always have a hospital
    if (this.equals(aTeam.getHospital()))
    {
      return wasRemoved;
    }

    //hospital already at minimum (1)
    if (numberOfTeams() <= minimumNumberOfTeams())
    {
      return wasRemoved;
    }

    teams.remove(aTeam);
    wasRemoved = true;
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addTeamAt(Team aTeam, int index)
  {  
    boolean wasAdded = false;
    if(addTeam(aTeam))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTeams()) { index = numberOfTeams() - 1; }
      teams.remove(aTeam);
      teams.add(index, aTeam);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTeamAt(Team aTeam, int index)
  {
    boolean wasAdded = false;
    if(teams.contains(aTeam))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTeams()) { index = numberOfTeams() - 1; }
      teams.remove(aTeam);
      teams.add(index, aTeam);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTeamAt(aTeam, index);
    }
    return wasAdded;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    Hospital compareTo = (Hospital)obj;
  
    if (getName() == null && compareTo.getName() != null)
    {
      return false;
    }
    else if (getName() != null && !getName().equals(compareTo.getName()))
    {
      return false;
    }

    return true;
  }

  public int hashCode()
  {
    if (cachedHashCode != -1)
    {
      return cachedHashCode;
    }
    cachedHashCode = 17;
    if (getName() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getName().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetName = false;
    return cachedHashCode;
  }

  public void delete()
  {
    while (wards.size() > 0)
    {
      Ward aWard = wards.get(wards.size() - 1);
      aWard.delete();
      wards.remove(aWard);
    }
    
    while (teams.size() > 0)
    {
      Team aTeam = teams.get(teams.size() - 1);
      aTeam.delete();
      teams.remove(aTeam);
    }
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "cityName" + ":" + getCityName()+ "," +
            "districtName" + ":" + getDistrictName()+ "," +
            "streetName" + ":" + getStreetName()+ "," +
            "buildingName" + ":" + getBuildingName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "phone" + "=" + (getPhone() != null ? !getPhone().equals(this)  ? getPhone().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "address" + "=" + (getAddress() != null ? !getAddress().equals(this)  ? getAddress().toString().replaceAll("  ","    ") : "this" : "null");
  }
}