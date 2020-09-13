package electoral;

public class ElectoralPartyMember {

    private String name;

    private int amountOfVotes;

    public ElectoralPartyMember(String name) {
        this.name = name;
        this.amountOfVotes = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getAmountOfVotes() {
        return this.amountOfVotes;
    }

    public void increaseAmoutOfVotes() {
        this.amountOfVotes++;
    }

}
