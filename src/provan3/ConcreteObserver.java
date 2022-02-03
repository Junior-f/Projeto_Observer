
package provan3;

/**
 *
 * @author junin
 */
public class ConcreteObserver extends  Observer{
    
    private ConcreteSubjectt cs;
    
    public ConcreteObserver(ConcreteSubjectt cs){
        this.cs = cs;
        cs.attatch(this);
    }
    
    @Override
    public void update(){
        System.out.println("Observer Notificado - Estado = " + cs.getState());
    }
    
}
