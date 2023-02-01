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

import java.util.Random;

/**
 *
 * @author alumnoT
 */
public class Camion extends Vehiculo {
        
    
    public static final int KM_REVISION = 5000;

    
//Constructor Predeterminado    
 public Camion() {
        
 }

    
 // Constructor Parametrizado   
public Camion(int contador){
    
    // Super tiene que ser lo primero, no tiene que tener nada delante
    // Super ya esta por defecto sin poner nada
     super(contador);
     
     System.out.println("Hola");
     
     
}    
    
     
    
    
    
    
    
    @Override
    public String toString() {
      
        String info;
        
        if(avisarRevision()){
            
         info =  String.format(""+ "%s%n"+ " Revisiones ..:%d%n"+ "Contador ....:%d",
                 super.toString(), obtenerRevisiones(),
                 KM_REVISION - getContador() % KM_REVISION);   
            
        } else{
        
            
         info =  String.format("%s - %d",
                 super.toString(), obtenerRevisiones());   
    
        }       
     
     return info;
    }
    
 
    
    
    @Override
    public boolean avisarRevision() {
      
        
     return getContador() % KM_REVISION >= KM_REVISION - KM_MARGEN;    
    }

    @Override
    public void mostrarInfo() {
      
        System.out.println(toString());
        
    }

    @Override
    public int obtenerRevisiones() {
       
   return getContador() / KM_REVISION;
    }
    
    
    
    
}
