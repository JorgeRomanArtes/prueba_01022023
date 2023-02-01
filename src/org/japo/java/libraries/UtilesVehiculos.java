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
package org.japo.java.libraries;

import java.util.Random;

/**
 *
 * @author alumnoT
 */
public final class UtilesVehiculos {

    // ---- Motor datos aleatorios --------------
    
    // Estatic desde los objetos con Random
    
    private static Random rnd = new Random();
    // Con final no se puede instanciar
    // Las librerias no tienen que ser heredables
    // Por eso poner final
    private UtilesVehiculos() {
         
    }
    
    public static final int generarKmInicio(int margen){
        
     // Margen es el de KM_MARGEN de las otras clases
        
        
        return rnd.nextInt(margen);
    }
    
    
    
}
