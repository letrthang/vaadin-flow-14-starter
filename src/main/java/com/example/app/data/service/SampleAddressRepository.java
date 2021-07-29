package com.example.app.data.service;

import com.example.app.data.entity.SampleAddress;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleAddressRepository extends JpaRepository<SampleAddress, Integer> {

}