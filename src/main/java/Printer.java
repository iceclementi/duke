import java.util.Vector;

public class Printer {
    public void printSpaces(int numberOfSpaces) {
        for (int i = 0; i < numberOfSpaces; i++) {
            System.out.print(" ");
        }
    }

    public void printWelcomeMessage() {
        String logo =
            "  __       _______  _______  ________  _______  _______  _______  ________\n" +
            " |\\_\\     |\\___\\__\\|\\ __\\__\\|\\ ______\\|\\______\\|\\___\\__\\|\\______\\|\\ ______\\\n" +
            " | | |    | |  |  || |  |  | \\|__   _|| |  ___|| |  |  || |     | \\|__   _|\n" +
            " | | |    | |  |  || |  |  |   | | |  | | |    | |  |  || |  |  |   | | |\n" +
            " | | |__  | |  |  || |     | __| | |_ | | |___ | |     || |     |   | | |\n" +
            " | | |__\\ | |     || | | | ||\\__\\| |_\\| | |___\\| |  |  || |  |  |   | | |\n" +
            "  \\|_____| \\|_____| \\|_|_|_| \\|______| \\|_____| \\|__|__| \\|__|__|    \\|_|";
        System.out.println("Welcome to\n" + logo);
    }

    public void printLoadMessage() {
        System.out.println("Initializing LumiChat v0.0.1.4...\n");
        System.out.println("LumiChat is now ready.\n");
        System.out.println("  Hey I'm Lumi!");
        System.out.println("  How may I assist you today?\n");
    }

    public void printExitMessage() {
        System.out.println("  Goodbye! Lumi will miss you!");
    }

    public void printInvalidAction() {
        System.out.println("  Sorry, Lumi has trouble understanding those words...");
        System.out.println("  Please try again!");
    }

    public void printAddTaskMessage(Vector<Task> list) {
        System.out.println("  Alright, Lumi has added: " + list.lastElement().getTask() + "!");
        printSpaces(10);
        System.out.println(list.lastElement().getTaskStatus());
        if (list.size() == 1) {
            System.out.println("  You now have " + list.size() + " task in Lumi's list!\n");
        } else {
            System.out.println("  You now have " + list.size() + " tasks in Lumi's list!\n");
        }
    }

    public void printList(Vector<Task> list) {
        System.out.println("  Sure! Lumi prints your list!");

        String listTop =
                "    +---------+\n" +
                "+---| L I S T |--------------------------------------+\n" +
                "|   +---------+                                      |";
        String listLeft = "| ";
        String listRight = " |";
        String listBottom = "+----------------------------------------------------+\n";
        int listLength = 50;

        System.out.println(listTop);

        // Print list items
        for (int i = 0; i < list.size(); i++) {
            String listItem = i+1 + ". " + list.get(i).getTaskStatus();

            System.out.print(listLeft);
            System.out.print(listItem);
            printSpaces(listLength-listItem.length()-1);
            System.out.println(listRight);
        }

        System.out.print(listBottom);

        // Print total number of tasks
        String totalTaskString = "Total: " + list.size() + " tasks";
        System.out.print(listLeft);
        System.out.print(totalTaskString);
        printSpaces(listLength-totalTaskString.length());
        System.out.println(listRight);
        System.out.println(listBottom);
    }
}