public class Car implements vehicle, fourWheeler{

    public void print(){
        vehicle.super.print();
        fourWheeler.super.print();
        vehicle.blowHorn();
    }
}
