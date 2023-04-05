/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package wards_and_teams;

// line 67 "../wards_and_teams.ump"
public class Phone
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Phone Attributes
  private int phoneNumber;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Phone(int aPhoneNumber)
  {
    phoneNumber = aPhoneNumber;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPhoneNumber(int aPhoneNumber)
  {
    boolean wasSet = false;
    phoneNumber = aPhoneNumber;
    wasSet = true;
    return wasSet;
  }

  public int getPhoneNumber()
  {
    return phoneNumber;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "phoneNumber" + ":" + getPhoneNumber()+ "]";
  }
}