package net.dreamlu.scala.repository;

import org.springframework.data.jpa.repository.JpaRepository

import net.dreamlu.scala.model.User

trait UserRepository extends JpaRepository[User,Long]