package electoral;

public class ElectoralList {

    private ElectoralParty[] electoralParties;

    public ElectoralList(ElectoralParty[] electoralParties) {
        this.electoralParties = electoralParties;
    }

    public ElectoralParty getPartyByIndex(int i) {
        return this.electoralParties[i];
    }

    public ElectoralParty[] getParties()
    {
        return electoralParties;
    }

}
