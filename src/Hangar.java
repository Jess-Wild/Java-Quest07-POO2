public class Hangar {
    public static void main(String[] args){
        Car Mustang = new Car("Mustang", 50000);
        Boat BlackPearl = new Boat("Black Pearl", 500000000);

        System.out.println(Mustang.doStuff()); //Je suis Mustang et je fais vroum vroum !
        System.out.println(BlackPearl.doStuff()); //Je suis Black Pearl et je fais glou glou !
    }
}
