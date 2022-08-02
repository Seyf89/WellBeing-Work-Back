package com.spring.social.service;
import java.util.List;

import com.spring.social.model.Invitation;
import com.spring.social.model.InvitationUser;



public interface IinvitationUser {
	InvitationUser AffecterInvitation(int idU);
	List<InvitationUser> allInvitationAffecter();

	List<Invitation> allEmployeAjouter();
	public String stat(String MetierEmploye) ;	
}
