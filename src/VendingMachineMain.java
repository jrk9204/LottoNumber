public class VendingMachineMain {
    public static void main(String[] args){
        VendingMachine vm1 = new VendingMachine();

        VendingMachine vm2 = new VendingMachine();
        
        String getReturnVal = vm1.machine(1000);

        System.out.println(getReturnVal);

    }
}
