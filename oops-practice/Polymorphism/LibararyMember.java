class LibraryMember {

    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    double calculateFine(int overdueDays) {
        return 0;
    }

    void printDetails() {
        System.out.println(memberName + " - " + memberId);
    }
}

class StudentMember extends LibraryMember {

    StudentMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int days) {
        return days * 2;
    }
}

class FacultyMember extends LibraryMember {

    FacultyMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int days) {
        return days * 1;
    }
}

class GuestMember extends LibraryMember {

    GuestMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int days) {
        return days * 5;
    }
}

public class LibraryMember {

    public static void main(String[] args) {

        LibraryMember[] members = {
                new StudentMember("Adishri", "S101"),
                new FacultyMember("Rakesh", "F201"),
                new GuestMember("Neha", "G301")
        };

        int overdueDays = 4;

        for (LibraryMember m : members) {
            m.printDetails();
            System.out.println("Fine = " + m.calculateFine(overdueDays));
            System.out.println();
        }

        String searchId = "F201";

        for (LibraryMember m : members) {
            if (m.memberId.equals(searchId)) {
                System.out.println("Member Found:");
                m.printDetails();
            }
        }
    }
}