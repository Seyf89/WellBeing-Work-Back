package com.spring.social.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.springframework.format.annotation.DateTimeFormat;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@SuppressWarnings("serial")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Invitation implements Serializable {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	long invitationId;
	
	
	String Employe;
	
	String metier_employe;
	
	String recepteur;
	@Temporal(TemporalType.DATE)
    @DateTimeFormat ( pattern = "aaaa-MM-jj" )
	Date date; 
	String picture;


}
