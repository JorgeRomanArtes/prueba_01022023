/*
 * Copyright 2023 alumnoT.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.entities;

import java.io.Serializable;
import java.util.Random;
import static org.japo.java.entities.Camion.KM_REVISION;
import org.japo.java.interfaces.IVehiculo;

/**
 *
 * @author alumnoT
 */
public abstract class Vehiculo implements IVehiculo, Serializable {

    // Abstracto es que no puede instanciar
    // Abstracto para metodos y clases
    

private static final int DEF_CONTADOR;    
 public static final int KM_MARGEN = 50;       

// Se evalua despues de las llaves
static{
    
    Random rnd = new Random();
    
    DEF_CONTADOR = rnd.nextInt(KM_MARGEN);
    
}


 private int contador;   

    public Vehiculo() {
        
        contador = DEF_CONTADOR;
    }

    public Vehiculo(int contador) {
        
        if(validarContador(contador)){
            
           this.contador = contador; 
        } else{
            
            this.contador = DEF_CONTADOR;
        }
        
    }

   

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        
         if(validarContador(contador)){
            
           this.contador = contador; 
      
    }
    
     
    }

    @Override
    public String toString() {
       
        return String.format("" +
                "Tipo ......: %s%n " + "Revisiones .....:%d%n",
                this.getClass().getSimpleName(), 
                contador);
        
    }

    @Override
    public boolean equals(Object obj) {
   
        //Semaforo
        
        boolean testOK;
    Object o = null;
        
        //
        
        if(o == null){
            
            testOK = false;
        } else if(!(o instanceof Vehiculo)){
            
            testOK = false;
            
        } else{
            
            Vehiculo v = (Vehiculo) o;
            testOK = this.contador == v.contador;
        }
        
        
return testOK;        
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.contador;
        return hash;
    }
   
    
     private boolean validarContador(int contador) {
        
        return contador >= DEF_CONTADOR;
    }
    
    
    
public abstract boolean avisarRevision();
    

}
