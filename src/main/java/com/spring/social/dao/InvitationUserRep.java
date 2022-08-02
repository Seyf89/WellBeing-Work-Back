package com.spring.social.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.social.model.InvitationUser;

@Repository
public interface InvitationUserRep  extends JpaRepository<InvitationUser, Long> {

}
