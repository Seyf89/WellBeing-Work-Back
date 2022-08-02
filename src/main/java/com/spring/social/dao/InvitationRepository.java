package com.spring.social.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.social.model.Invitation;



public interface InvitationRepository extends CrudRepository<Invitation,Long> {
    @Override
    long count();
}
