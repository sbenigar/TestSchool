/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package dom.simple;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.ActionSemantics;
import org.apache.isis.applib.annotation.ActionSemantics.Of;
import org.apache.isis.applib.annotation.Bookmarkable;
import org.apache.isis.applib.annotation.Hidden;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Named;
import org.apache.isis.applib.annotation.Programmatic;

public class Alumnos {


    // //////////////////////////////////////
    // Identification in the UI
    // //////////////////////////////////////

    public String getId() {
        return "alumno";
    }

    public String iconName() {
        return "SimpleObject";
    }

    // //////////////////////////////////////
    // List (action)
    // //////////////////////////////////////
    
    @Bookmarkable
    @ActionSemantics(Of.SAFE)
    @MemberOrder(sequence = "1")
    public List<Alumno> listAll() {
        return container.allInstances(Alumno.class);
    }


    // //////////////////////////////////////
    // Create (action)
    // //////////////////////////////////////
    
    @MemberOrder(sequence = "2")
    public Alumno create(
            final @Named("Nombre") String nombre,
            final @Named("Apellido") String apellido,
            final @Named("DNI") int dni,
            final @Named("Calle") String calle,
            final @Named("Numero") int numero) {
        final Alumno obj = container.newTransientInstance(Alumno.class);
        final Direccion dire = new Direccion();
       
        dire.setCalle(calle);
        dire.setNumero(numero);
        obj.setName(nombre);
        obj.setApellido(apellido);
        obj.setDni(dni);
        obj.setDireccion(dire);
        obj.setLegajo(new Legajo("empty") );
        container.persistIfNotAlready(obj);
        return obj;
    }

    // //////////////////////////////////////
    // Injected services
    // //////////////////////////////////////

    @javax.inject.Inject 
    DomainObjectContainer container;

}
