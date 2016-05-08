/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.javapp.innerclass;

import java.io.File;
import java.nio.Buffer;

/**
 *
 * @author melayer
 */
public class Outer {

    private int outerVar = 10;
    
    public class InnerPublic extends Outer{

        private int innerVar = 50;
        public InnerPublic() {

Runtime runtime = Runtime.getRuntime();
            outerVar = 10;
        }
        // dependent on Outer object
    }
    
    private class InnerPrivate {
        // not accessible outside the Outer class
    }
    
    public static class InnerStatic {
        
        // independent of Outer object
    }
    
    public void localInnerClass (){
        
        final class LocalInner {
            
        }
    }
}
