package com.jiyoung.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiyoung.guestbook.domain.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer> {

}
