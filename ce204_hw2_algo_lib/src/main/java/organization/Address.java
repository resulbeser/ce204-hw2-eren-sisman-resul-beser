/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package organization;

// line 41 "../umple_project.ump"
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
  
  /**
   * @brief Constructor for the Address class.
   *
   * This constructor initializes an Address object with the provided city name,
   * district name, street name, and building name.
   *
   * @param aCityName The city name for the address.
   * @param aDistrictName The district name for the address.
   * @param aStreetName The street name for the address.
   * @param aBuildingName The building name for the address.
   *
   **/
  
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
  
  /**
   * @brief Sets the name of the city.
   *
   * @param aCityName The name of the city to be set.
   * @return {@code true} if the city name was set successfully, {@code false} otherwise.
   **/
  public boolean setCityName(String aCityName)
  {
    boolean wasSet = false;
    cityName = aCityName;
    wasSet = true;
    return wasSet;
  }
  /**
   * @brief Sets the name of the district.
   *
   * This function sets the name of the district with the provided parameter.
   * 
   * @paramaDistrictName The name of the district to be set.
   * @return True if the district name was set successfully, false otherwise.
   */
  public boolean setDistrictName(String aDistrictName)
  {
    boolean wasSet = false;
    districtName = aDistrictName;
    wasSet = true;
    return wasSet;
  }

  /**
   * @brief Sets the name of the street.
   *
   * This function sets the name of the street with the provided parameter.
   * 
   * @param aStreetName The name of the street to be set.
   * @return True if the street name was set successfully, false otherwise.
   */
  
  public boolean setStreetName(String aStreetName)
  {
    boolean wasSet = false;
    streetName = aStreetName;
    wasSet = true;
    return wasSet;
  }
  /**
   * @brief Sets the name of the building.
   *
   * This function sets the name of the building with the provided parameter.
   * 
   * @param aBuildingName The name of the building to be set.
   * @return True if the building name was set successfully, false otherwise.
   */ 
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

  /**
   * @brief Override of the toString() method to provide a formatted string representation of the object.
   * 
   * This method returns a string representation of the object, including its superclass's toString() output
   * as well as additional information about the city name, district name, street name, and building name.
   * The output is formatted as a string with key-value pairs enclosed in square brackets.
   * 
   * @return A string representation of the object.
   * 
   * @see Object#toString()
   * 
   **/
  
  public String toString()
  {
    return super.toString() + "["+
            "cityName" + ":" + getCityName()+ "," +
            "districtName" + ":" + getDistrictName()+ "," +
            "streetName" + ":" + getStreetName()+ "," +
            "buildingName" + ":" + getBuildingName()+ "]";
  }
}