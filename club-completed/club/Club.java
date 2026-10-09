import java.util.ArrayList;
import java.util.Iterator;

/** Store details of club memberships. */
public class Club
{
    // Practice 5, question 1
    private ArrayList<Membership> members;

    public Club()
    {
        members = new ArrayList<>();
    }

    // Practice 5, question 3
    public void join(Membership member)
    {
        members.add(member);
    }

    // Practice 5, question 2
    public int numberOfMembers()
    {
        return members.size();
    }

    // Practice 5, question 4
    public int joinedInMonth(int month)
    {
        if(month < 1 || month > 12) {
            System.out.println("Month must be between 1 and 12.");
            return 0;
        }
        int count = 0;
        for(Membership member : members) {
            if(member.getMonth() == month) {
                count++;
            }
        }
        return count;
    }

    // Practice 5, question 5
    public ArrayList<Membership> purge(int month, int year)
    {
        ArrayList<Membership> removed = new ArrayList<>();
        if(month < 1 || month > 12) {
            System.out.println("Month must be between 1 and 12.");
            return removed;
        }
        Iterator<Membership> iterator = members.iterator();
        while(iterator.hasNext()) {
            Membership member = iterator.next();
            if(member.getMonth() == month && member.getYear() == year) {
                removed.add(member);
                iterator.remove();
            }
        }
        return removed;
    }
}
