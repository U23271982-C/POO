package contenido.Week02.AdditionalExercise;

public class Beneficiaria {
    private double total;
    private Member[] members;
    private int numMembers = 6;

    public Beneficiaria(int numMembers){
        this.numMembers = numMembers;

        members = new Member[numMembers];

        members[0] = new Member(1234, "Namal", 1000);
        members[1] = new Member(5872, "Saman", 1500);
        members[2] = new Member(8432, "Kasun", 500);
        members[3] = new Member(5361, "Namal", 2000);
        members[4] = new Member(3243, "Seneka", 1300);
        members[5] = new Member(4419, "Kalpa", 4000);
    }

    public void setMembers(Member[] members) {
        this.members = members;
    }

    public void CalcularTotal(){
        for (Member member : members) {
            this.total += member.getMount();
        }
    }

    public String ShowMember(int id) {
            for (Member member : members) {
                if (id == member.getId()){
                    return String.format
                            ("%d - %s s/.%.2f",member.getId(), member.getName(), member.getMount());
                }
            }
            return "No se encontró el usuario";
    }
    public String ShowMember(String nameMember){
        int counterMembers = 0;
        StringBuilder sb = new StringBuilder();
        String line = "%d| %d - %s s/.%.2f\n";
        String lineFinal = "%s--------------------\nTotal Members: %d";
        for (Member member : members) {
            if (nameMember.equalsIgnoreCase(member.getName())){
                sb.append(String.format(line, counterMembers, member.getId(), member.getName(),member.getMount()));
                counterMembers++;
            }
        }
        return String.format(lineFinal,sb.toString(),counterMembers);
    }
}
