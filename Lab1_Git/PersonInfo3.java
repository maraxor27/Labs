public class PersonInfo3 {

    public static String firstName = "Sebastien";
    public static String lastName = "Ledoux";
    public static int studentNo = 300095644;
    public static String description = "Likes long walks along the beach xDDDD";

    public static void displayFr() {
        String out = SIConstants.GREETING_FR;
        out += " " + firstName + " " + lastName + '.';
        out += SIConstants.STUDENT_NUMBER_FR + studentNo + '.';
        out += SIConstants.DESCRIPTION_FR + description + '.';
        out += SIConstants.EOL;

        System.out.println(out);
    }


    public static void displayEn() {
        String out = SIConstants.GREETING_EN;
        out += " " + firstName + " " + lastName + '.';
        out += SIConstants.STUDENT_NUMBER_EN + studentNo + '.';
        out += SIConstants.DESCRIPTION_EN + description + '.';
        out += SIConstants.EOL;

        System.out.println(out);
    }
}
