package com.jpa.gil.service;

import com.jpa.gil.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestService extends JpaRepository<TestEntity, Long> {

//	List<TestEntity> findAllTest();
}
