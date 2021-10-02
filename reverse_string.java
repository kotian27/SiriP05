public static void main(String[] args) {
    String str = "", rev = "";  // Create empty variables to hold the input and output
    Scanner in = new Scanner(System.in); // Create an object to read from StdIn

    while(!str.contains("exit"))   // Read from StdIn as long as user does not input "exit"
    {
        str = "";
        rev = "";
        System.out.println("Enter a string to be reversed: ");
        str = in.nextLine(); // Save the user's input as "str"

        int length = str.length(); // Get the length of the input
        for (int i = length - 1; i >= 0; i--) // Iterate over each character of the input,         
          rev = rev + str.charAt(i); 

        System.out.println(rev); // Output the result
    }
}
