
public static void main(String[] args) {
    int secondLargest=0;
    int Largest=0;
   //int salary;
   //Scanner sc= new Scanner(System.in);
   int [] salary= {239080,313842,2155367,21781};
   System.out.println("enter the salary");
    for(int currentSalary:salary){
        if(currentSalary>Largest){
            secondLargest=Largest;
            Largest=currentSalary;
        }
        else if (currentSalary>secondLargest&&currentSalary!=Largest ){
            secondLargest=currentSalary;

        }
        System.out.println(secondLargest);
    }
}