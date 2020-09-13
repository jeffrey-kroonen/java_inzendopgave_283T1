import electoral.ElectoralList;
import electoral.ElectoralParty;
import electoral.ElectoralPartyMember;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class Election {

    private ElectoralList electoralList;

    private Integer[][] electionOutcome;

    public Election() {
        ElectoralParty ep1 = new ElectoralParty("PVV");
        ElectoralPartyMember ep1_epm1 = new ElectoralPartyMember("Geert Wilders");
        ep1.addElectoralPartyMember(ep1_epm1);

        ElectoralPartyMember ep1_epm2 = new ElectoralPartyMember("Roy van Aalst");
        ep1.addElectoralPartyMember(ep1_epm2);

        ElectoralPartyMember ep1_epm3 = new ElectoralPartyMember("Fleur Agema");
        ep1.addElectoralPartyMember(ep1_epm3);

        ElectoralPartyMember ep1_epm4 = new ElectoralPartyMember("Harm Beertema");
        ep1.addElectoralPartyMember(ep1_epm4);

        ElectoralPartyMember ep1_epm5 = new ElectoralPartyMember("Martin Bosma");
        ep1.addElectoralPartyMember(ep1_epm5);

        ElectoralParty ep2 = new ElectoralParty("PVDA");
        ElectoralPartyMember ep2_epm1 = new ElectoralPartyMember("Lodewijk Asscher");
        ep2.addElectoralPartyMember(ep2_epm1);

        ElectoralPartyMember ep2_epm2 = new ElectoralPartyMember("Lilianne Ploumen");
        ep2.addElectoralPartyMember(ep2_epm2);

        ElectoralPartyMember ep2_epm3 = new ElectoralPartyMember("Khadija Arib");
        ep2.addElectoralPartyMember(ep2_epm3);

        ElectoralPartyMember ep2_epm4 = new ElectoralPartyMember("Gijs van Dijk");
        ep2.addElectoralPartyMember(ep2_epm4);

        ElectoralPartyMember ep2_epm5 = new ElectoralPartyMember("Kirsten van den Hul");
        ep2.addElectoralPartyMember(ep2_epm5);

        ElectoralParty ep3 = new ElectoralParty("SP");
        ElectoralPartyMember ep3_epm1 = new ElectoralPartyMember("Lilian Marijnissen");
        ep3.addElectoralPartyMember(ep3_epm1);

        ElectoralPartyMember ep3_epm2 = new ElectoralPartyMember("Jasper van Dijk");
        ep3.addElectoralPartyMember(ep3_epm2);

        ElectoralPartyMember ep3_epm3 = new ElectoralPartyMember("Ronald van Raak");
        ep3.addElectoralPartyMember(ep3_epm3);

        ElectoralPartyMember ep3_epm4 = new ElectoralPartyMember("Renske Leijten");
        ep3.addElectoralPartyMember(ep3_epm4);

        ElectoralPartyMember ep3_epm5 = new ElectoralPartyMember("Sadet Karabulut");
        ep3.addElectoralPartyMember(ep3_epm5);

        /**
         * Add electoral parties to election list.
         */
        ElectoralParty[] epl = new ElectoralParty[3];
        epl[0] = ep1;
        epl[1] = ep2;
        epl[2] = ep3;

        this.electoralList = new ElectoralList(epl);

        this.randomElection();
    }

    public void randomElection() {
        this.electionOutcome = new Integer[50][3];

        for (int i = 0; i < 50; i++) {

            Random rand = new Random();
            int electionParty = rand.nextInt(3);
            int electionPartyMember = rand.nextInt(5);

            this.addElectionVote(i, electionParty, electionPartyMember);
        }
    }

    private void calculateVotes() {
        for (Integer[] i : this.electionOutcome) {

            ElectoralParty ep = this.electoralList.getPartyByIndex(i[1]);
            ep.increaseAmoutOfVotes();

            ElectoralPartyMember epm = ep.getPartyMemberByIndex(i[2]);
            epm.increaseAmoutOfVotes();

        }
    }

    public void showElection() {

        this.calculateVotes();

        ElectoralParty[] electoralParties = this.electoralList.getParties();

        for (int i = 0; i < electoralParties.length; i++) {
           System.out.println(electoralParties[i].getName());

           for (ElectoralPartyMember electoralPartyMember : electoralParties[i].getPartyMembers()) {
               System.out.println(electoralPartyMember.getName() + " " + electoralPartyMember.getAmountOfVotes());
           }

            System.out.println("Totaal aantal stemmen: " + electoralParties[i].getAmountOfVotes());
            System.out.println();

        }
    }

    public void addElectionVote(int i, int electionParty, int electionPartyMember) {
        this.electionOutcome[i][0] = i;
        this.electionOutcome[i][1] = electionParty;
        this.electionOutcome[i][2] = electionPartyMember;
    }

}
