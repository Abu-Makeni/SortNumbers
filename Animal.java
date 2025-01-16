public class Animal{
    public void animalSound(){
        system.out.println("The animal makes a sound.");
    }
}
class pig extends Animal{
    public void animalSound (){
        System.out.println("The pig says :Wee wee");
    }

}
class Main{
    public static void main(String[]args){
        Animal myAnimal =new Animal();
        myAnimal.animalSound();
    }
}