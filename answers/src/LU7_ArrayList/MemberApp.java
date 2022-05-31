package LU7_ArrayList;
import java.util.ArrayList;

import LU7.Helper;

public class MemberApp {

	public static void main(String[] args) {

		ArrayList<Member> memberList = new ArrayList<Member>();

		memberList.add(new Member("alice", "aBcde123", 20));
		memberList.add(new Member("bob", "aBcde456", 10));
		memberList.add(new Member("charlie", "aBcde789", 25));

		int option = -1;

		while (option != 3) {

			MemberApp.menu();
			option = Helper.readInt("Enter option > ");

			if (option == 1) {

				MemberApp.viewAllMembers(memberList);

			} else if (option == 2) {
				MemberApp.updateMemberPassword(memberList);

			} else if (option == 3) {
				System.out.println("Good bye!");
			}
		}

	}

	public static void menu() {
		Helper.line(30, "=");
		System.out.println("MEMBER MANAGEMENT");
		Helper.line(30, "=");
		System.out.println("1. View all members");
		System.out.println("2. Update member password");
		System.out.println("3. Quit");
	}

	public static void viewAllMembers(ArrayList<Member> memberList) {
		Helper.line(30, "-");
		System.out.println("VIEW ALL MEMBERS");
		Helper.line(30, "-");

		String output = String.format("%-10s %-5s\n", "USER", "POINTS");
		for (int i = 0; i < memberList.size(); i++) {
			output += String.format("%-10s %-5d\n", memberList.get(i).getUsername(), memberList.get(i).getPoints());
		}

		System.out.println(output);

	}

	public static void updateMemberPassword(ArrayList<Member> memberList) {
		Helper.line(30, "-");
		System.out.println("UPDATE MEMBER PASSWORD");
		Helper.line(30, "-");

		String user = Helper.readString("Enter username > ");
		boolean isFound = false;

		for (int i = 0; i < memberList.size(); i++) {
			if (user.equalsIgnoreCase(memberList.get(i).getUsername())) {

				String currentPassword = Helper.readString("Enter current password > ");

				if (currentPassword.equals(memberList.get(i).getPassword())) {
					String newPassword = Helper.readString("Enter new password > ");
					memberList.get(i).setPassword(newPassword);
				} else {
					System.out.println("The password is incorrect.");
				}
				isFound = true;
				break;
			}
		}
		if (isFound == false) {
			System.out.println("This user does not exist.");
		}
	}
}
