/**Note:
 * Straight forward pattern. Method varies depending on changing state. 
 */
package makebono.designpattern.behavioralpattern.statusofobject.statepattern;

import makebono.designpattern.tools.entities.AppleJuice;
import makebono.designpattern.tools.entities.OrangeJuice;
import makebono.designpattern.tools.entities.intefaces.Juice;

/** 
 * @ClassName: JuiceSwitchingVendor 
 * @Description: State pattern. A juice vendor with 2 states, one for orange and one for apple.
 * @author makebono
 * @date 2017年12月6日 下午2:46:11 
 *  
 */
public class JuiceSwitchingVendor {
    public String state = "";

    public void changeState(final String state) {
        this.state = state;
    }

    public Juice buy() {
        if (this.state.equals("OrangeJuice")) {
            return Switch.orangeState();
        } else if (this.state.equals("AppleJuice")) {
            return Switch.appleState();
        } else {
            System.out.println("State not exists or no state set yet! But here's an orange juice!");
            return Switch.orangeState();
        }
    }
}

class Switch {
    public static Juice orangeState() {
        return new OrangeJuice();
    }

    public static Juice appleState() {
        return new AppleJuice();
    }
}