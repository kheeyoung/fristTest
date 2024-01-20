package com.example.fristTest.repository;

import com.example.fristTest.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserInfo,Long> { //저장소 쓰기 읽기등 기능
}
