/**Note:
 * Interpreter pattern, interpret something into something else. In this case, it reads a juice object and return its
 * name in natural English format.
 * 
 * For example:
 *     input: makebono.designpattern.tools.entities.AppleJuice
 *     expected output: Apple Juice
 */
package com.makebono.javaplayland.designpattern.behavioralpattern.agentinmiddle.interpreterpattern;

import com.makebono.javaplayland.tools.entities.interfaces.Juice;

/** 
 * @ClassName: JuiceInterpreter 
 * @Description: Interpreter pattern
 * @author makebono
 * @date 2017年12月6日 下午3:52:58 
 *  
 */
public class JuiceClassInterpreter {
    public String interpret(final Juice juice) {
        final String type = juice.getClass().getSimpleName();
        final int space = type.indexOf('J');
        return type.substring(0, space) + " " + type.substring(space);
    }
}
