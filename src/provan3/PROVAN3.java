
package provan3;

/**
 *
 * @author junin
 */
public class PROVAN3 {

    public static void main(String[] args) {
        
        ConcreteSubjectt  n = new ConcreteSubjectt();
        
        Observer o1 = new   ConcreteObserver(n);
        Observer o2 = new   ConcreteObserver(n);
        
      
        
        n.setState("Novo Estado 1");
        n.setState("Novo Estado 2");
        
    }
    
}
