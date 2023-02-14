class Main{
    public static void main(String[]args){
        System.out.println("Hola Mundo");
        car car= new car();
        car.license="KAO818";
        car.driver="Simón Cárdenas";
        car.passenger=4;
        //System.out.println("Car License "+car.license);
        car.printDataCar();

        car car2= new car();
        car2.license="DJN962";
        car2.driver="Manuela Cardenas";
        car2.passenger=3;
        //System.out.println("Car License "+car2.license);
        car2.printDataCar();
    }
}
