package electoral;

import java.util.ArrayList;

public class ElectoralParty {

    private String name;

    private int amountOfVotes;

    private ArrayList<ElectoralPartyMember> electoralPartyMembers;

    public ElectoralParty(String name) {
        this.name = name;
        this.electoralPartyMembers = new ArrayList<ElectoralPartyMember>();
    }

    public String getName() {
        return this.name;
    }

    public int getAmountOfVotes() {
        return this.amountOfVotes;
    }

    public void addElectoralPartyMember(ElectoralPartyMember epm) {
        this.electoralPartyMembers.add(epm);
    }

    public ElectoralPartyMember getPartyMemberByIndex(int i) {
        return this.electoralPartyMembers.get(i);
    }

    public ArrayList<ElectoralPartyMember> getPartyMembers() {
        return this.electoralPartyMembers;
    }

    public void increaseAmoutOfVotes() {
        this.amountOfVotes++;
    }

}
