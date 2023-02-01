/*
 * Copyright 2022 José A. Pacheco Ondoño - japolabs@gmail.com.
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
package org.japo.java.app;

import org.japo.java.entities.Camion;
import org.japo.java.entities.Moto;
import org.japo.java.entities.Vehiculo;

/**
 *
 * @author José A. Pacheco Ondoño - japolabs@gmail.com
 */
public final class App {

    public final void launchApp() {
     // Cabezcera camiones
        
        System.out.println("Camiones");
        System.out.println("========");
     
        
    // Camion - Predeterminado
        
        Camion c1 = new Camion();
        c1.mostrarInfo();
        // Para modificar cuentakilometros
        c1.setContador(14993);
         c1.mostrarInfo();
        
        
       // Separador
       
        System.out.println("---");
        
        
        // Camion - Parametrizado
        
        Camion c2 = new Camion(9976);
        c1.mostrarInfo();
        // Para modificar cuentakilometros
        c1.setContador(44923);
         c1.mostrarInfo();
        
        
       // Separador
       
        System.out.println("---");
         
         // Cabezcera Moto
        
        System.out.println("Moto");
        System.out.println("========");
        
         // Camion - Predeterminado
        
        Moto m1 = new Moto();
        m1.mostrarInfo();
        // Para modificar cuentakilometros
        m1.setContador(14993);
         m1.mostrarInfo();
        
        
       // Separador
       
        System.out.println("---");
        
        
        // Camion - Parametrizado
        
        Moto m2 = new Moto(9976);
        m2.mostrarInfo();
        // Para modificar cuentakilometros
        m2.setContador(44923);
         m2.mostrarInfo();
        
        
    }

}
