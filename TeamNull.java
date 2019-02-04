package Project00;

import java.util.*;
import Project00.Team;
import Project00.Member;
import Project00.SchaperMember;


public class TeamNull extends Team
{
    public TeamNull(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new AdamsMember("Brandon Adams"));
        members.add(new IvesMember("Elijah Ives"));
        members.add(new EstephanMember("Anthony Estephan"));
        // create a new member class for each team member
        // and add it to the team members list
    }
}