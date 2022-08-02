package com.spring.social.service;

import java.util.List;

import com.spring.social.model.Invitation;



public interface IInvitationService {

	List<Invitation> retrieveAllInvitations();

	void ajouterInvitation(Invitation I);

	void deleteInvitation (Long id);


	Invitation updateInvitation(Invitation I, long invitationId);


	
}
