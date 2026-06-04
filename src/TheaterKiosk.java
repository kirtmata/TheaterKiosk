void main() {
    //As people pass through an entry kiosk at the theater,
    // they are prompted to enter their age. If they are 21 or older,
    // they get a paper wrist band.
    // Code a logic program that asks the user to enter their age
    // and then if they are 21 or over displays a message that they get a wrist band.
    //Note that the program does nothing if they are not 21 or over…

    int userAge = 0;
    Scanner in = new Scanner(System.in);

    System.out.println("Please enter your age: ");
    if(in.hasNextInt()){
        userAge = in.nextInt();
        if(userAge >= 21){
            System.out.println("You get a wristband.");
        }
    }
}