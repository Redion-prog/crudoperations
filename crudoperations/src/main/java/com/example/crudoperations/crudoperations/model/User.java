package com.example.crudoperations.crudoperations.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

//loombok eshte  librari qe   shmang shkrimin e  kodit te  perseritur
//perseritur (boiler plate code ),duke krijuar  automatikisht
//getters and  setters ,konstruktor ,metoda to String
@Data//gjenereon getters dhe setters  ,metoden toString ,equals,hashCode
@AllArgsConstructor//gjeneron konstruktor me  te gjitha  fushat
@NoArgsConstructor//konstruktor bosh
@Slf4j
public class User {
    private Long id;
    private String name;
    private String email;


}

