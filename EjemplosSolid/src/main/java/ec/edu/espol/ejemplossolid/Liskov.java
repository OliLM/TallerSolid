
package ec.edu.espol.ejemplossolid;


public class Liskov {
    
    public interface AnimalActions{
        void run();
        void fly();
        void swim();
        void dig();
    }
    
    //La interfacz DuckActions nos presenta los métodos necesarios para por ejemplo instanciar una clase Duck, sin obhligarnos a tener métodos innecesarios
    public interface DuckActions{
        void run();
        void fly();
        void swim();
    }
    
    
    
    
    public class Animal implements AnimalActions{
        @Override
        public void run(){
            //El animal Corre
        }
        @Override
        public void fly() {}
        @Override
        public void swim() {}
        @Override
        public void dig() {}
    }
    
    public class Mamifero extends Animal{
        @Override
        public void run(){
            //Logica de que corre usando las 4 patas
        }
    }
    
    public class Ave extends Animal{
        @Override
        public void run(){
            //Logica de que corre usando las 2 patas
        }
    }
    
    class AnimalCorrer{
        public void run(Mamifero animal){
            animal.run();
        }
    }
}
