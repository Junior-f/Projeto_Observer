
package provan3;

/**
 *
 * @author junin
 */
public class ConcreteSubjectt extends Subject{
    
    private  String state;
    
    
    public String getState(){
        return state;
    }
    
    public void setState(String state){
        this.state = state;
        notifyObservers();
    }
    
}
