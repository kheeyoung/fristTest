package com.example.fristTest.repository;

import com.example.fristTest.entity.Login;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends CrudRepository<Login,Long> { //저장소 쓰기 읽기등 기능
}
