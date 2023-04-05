/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package wards_and_teams;
import java.util.*;
import java.sql.Date;

// line 61 "../wards_and_teams.ump"
public class ConsultantDoctor extends Doctor
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConsultantDoctor Associations
  private List<Patient> ultimateResponsibility;
  private Team team;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConsultantDoctor()
  {
    super();
    ultimateResponsibility = new ArrayList<Patient>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Patient getUltimateResponsibility(int index)
  {
    Patient aUltimateResponsibility = ultimateResponsibility.get(index);
    return aUltimateResponsibility;
  }

  public List<Patient> getUltimateResponsibility()
  {
    List<Patient> newUltimateResponsibility = Collections.unmodifiableList(ultimateResponsibility);
    return newUltimateResponsibility;
  }

  public int numberOfUltimateResponsibility()
  {
    int number = ultimateResponsibility.size();
    return number;
  }

  public boolean hasUltimateResponsibility()
  {
    boolean has = ultimateResponsibility.size() > 0;
    return has;
  }

  public int indexOfUltimateResponsibility(Patient aUltimateResponsibility)
  {
    int index = ultimateResponsibility.indexOf(aUltimateResponsibility);
    return index;
  }
  /* Code from template association_GetOne */
  public Team getTeam()
  {
    return team;
  }

  public boolean hasTeam()
  {
    boolean has = team != null;
    return has;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUltimateResponsibility()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Patient addUltimateResponsibility(String aId, Gender aGender, int aAge, Date aAccepted, History aSickness, Ward aWard, Team aTeam)
  {
    return new Patient(aId, aGender, aAge, aAccepted, aSickness, aWard, aTeam, this);
  }

  public boolean addUltimateResponsibility(Patient aUltimateResponsibility)
  {
    boolean wasAdded = false;
    if (ultimateResponsibility.contains(aUltimateResponsibility)) { return false; }
    ConsultantDoctor existingConsultantDoctor = aUltimateResponsibility.getConsultantDoctor();
    boolean isNewConsultantDoctor = existingConsultantDoctor != null && !this.equals(existingConsultantDoctor);
    if (isNewConsultantDoctor)
    {
      aUltimateResponsibility.setConsultantDoctor(this);
    }
    else
    {
      ultimateResponsibility.add(aUltimateResponsibility);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeUltimateResponsibility(Patient aUltimateResponsibility)
  {
    boolean wasRemoved = false;
    //Unable to remove aUltimateResponsibility, as it must always have a consultantDoctor
    if (!this.equals(aUltimateResponsibility.getConsultantDoctor()))
    {
      ultimateResponsibility.remove(aUltimateResponsibility);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUltimateResponsibilityAt(Patient aUltimateResponsibility, int index)
  {  
    boolean wasAdded = false;
    if(addUltimateResponsibility(aUltimateResponsibility))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUltimateResponsibility()) { index = numberOfUltimateResponsibility() - 1; }
      ultimateResponsibility.remove(aUltimateResponsibility);
      ultimateResponsibility.add(index, aUltimateResponsibility);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUltimateResponsibilityAt(Patient aUltimateResponsibility, int index)
  {
    boolean wasAdded = false;
    if(ultimateResponsibility.contains(aUltimateResponsibility))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUltimateResponsibility()) { index = numberOfUltimateResponsibility() - 1; }
      ultimateResponsibility.remove(aUltimateResponsibility);
      ultimateResponsibility.add(index, aUltimateResponsibility);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUltimateResponsibilityAt(aUltimateResponsibility, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToOne */
  public boolean setTeam(Team aNewTeam)
  {
    boolean wasSet = false;
    if (team != null && !team.equals(aNewTeam) && equals(team.getTeamLeader()))
    {
      //Unable to setTeam, as existing team would become an orphan
      return wasSet;
    }

    team = aNewTeam;
    ConsultantDoctor anOldTeamLeader = aNewTeam != null ? aNewTeam.getTeamLeader() : null;

    if (!this.equals(anOldTeamLeader))
    {
      if (anOldTeamLeader != null)
      {
        anOldTeamLeader.team = null;
      }
      if (team != null)
      {
        team.setTeamLeader(this);
      }
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    for(int i=ultimateResponsibility.size(); i > 0; i--)
    {
      Patient aUltimateResponsibility = ultimateResponsibility.get(i - 1);
      aUltimateResponsibility.delete();
    }
    Team existingTeam = team;
    team = null;
    if (existingTeam != null)
    {
      existingTeam.delete();
    }
    super.delete();
  }

}