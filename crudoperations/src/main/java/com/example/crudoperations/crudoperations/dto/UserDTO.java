package com.example.crudoperations.crudoperations.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//nje klas dto ose  ndryshe data transfer object eshte nje objekt i thjeshte qe  perdoret per te transferuar te dhena
//midis backend dhe front end
//ofron siguri te larte
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    //kur merr nje objekt user  perdor user dto per input ose output qe mos te  shfaqet id dhe password

    private String name ;
    private String email;

}
