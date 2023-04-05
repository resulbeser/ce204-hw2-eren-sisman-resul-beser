/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package wards_and_teams;

// line 70 "../wards_and_teams.ump"
public class Address
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Address Attributes
  private String cityName;
  private String districtName;
  private String streetName;
  private String buildingName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Address(String aCityName, String aDistrictName, String aStreetName, String aBuildingName)
  {
    cityName = aCityName;
    districtName = aDistrictName;
    streetName = aStreetName;
    buildingName = aBuildingName;
  }

  //------------------------
  // INTERFACE
  //------------------------

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

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "cityName" + ":" + getCityName()+ "," +
            "districtName" + ":" + getDistrictName()+ "," +
            "streetName" + ":" + getStreetName()+ "," +
            "buildingName" + ":" + getBuildingName()+ "]";
  }
}