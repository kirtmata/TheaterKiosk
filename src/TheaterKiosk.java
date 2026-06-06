void main() {
    //As people pass through an entry kiosk at the theater,
    // they are prompted to enter their age. If they are 21 or older,
    // they get a paper wrist band.
    // Code a logic program that asks the user to enter their age
    // and then if they are 21 or over displays a message that they get a wrist band.
    //Note that the program does nothing if they are not 21 or over…
// set variable
    int userAge = 0;
// create scanner
    Scanner in = new Scanner(System.in);
//print prompt
    System.out.println("Please enter your age: ");
//check if int and then check the inpute age
   if(in.hasNextInt()){
        userAge = in.nextInt();
        if(userAge >= 21){
// print output
            System.out.println("You get a wristband.");
        }
    }
}