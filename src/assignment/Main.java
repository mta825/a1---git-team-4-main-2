package assignment;

public class Main {

    public static void main(String[] args) {
        new NamePrinter().printNames();
    }
}

/* Adding this comment as the fourth person in the group
 * As there is nothing else meaningful to add, I haven't added any code.
 */
class NamePrinter {
    /**
     * Prints the names of the group members separated by dashes.
     */
    public void printNames() {
        String separator = "-";

        String[] names = {
                "Jerome Francis",
                "Nathan Adam",
                "Huy Nguyen",
                "Mason Cushing"
        };

        System.out.println(String.join(separator, names));
    }
}
