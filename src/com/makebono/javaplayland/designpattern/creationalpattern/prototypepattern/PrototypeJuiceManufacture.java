/**Note:
 * Prototype pattern clone a prototype for new objects. 
 */
package com.makebono.javaplayland.designpattern.creationalpattern.prototypepattern;

import java.io.Serializable;

import com.makebono.javaplayland.tools.entities.interfaces.Juice;
import com.makebono.javaplayland.tools.entities.interfaces.PrototypeJuice;;

/** 
 * @ClassName: PrototypeJuiceManufacture 
 * @Description: RX-78 JP project.
 * @author makebono
 * @date 2017年12月5日 下午2:27:45 
 *  
 */
public class PrototypeJuiceManufacture implements Cloneable, Serializable {
    private static final long serialVersionUID = 8677040810989908245L;

    private final PrototypeJuice pj01;

    public PrototypeJuiceManufacture(final PrototypeJuice pj01) {
        this.pj01 = pj01;
    }

    public Juice produceJuice() throws CloneNotSupportedException {
        return (Juice) pj01.clone();
    }
}
