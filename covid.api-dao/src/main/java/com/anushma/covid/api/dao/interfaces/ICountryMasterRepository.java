package com.anushma.covid.api.dao.interfaces;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.anushma.covid.api.dao.model.CountryMasterEntity;

public interface ICountryMasterRepository extends CrudRepository<CountryMasterEntity, Long> {

	
	@Query("SELECT cm FROM CountryMasterEntity cm WHERE id=:id")
	public CountryMasterEntity getCountryMasterEntityById(@Param("id") Long id);
	
	@Query("SELECT cm FROM CountryMasterEntity cm WHERE code=:code")
	public CountryMasterEntity getCountryMasterEntityByCode(@Param("code") String code);
	
	@Query("SELECT cm FROM CountryMasterEntity cm WHERE name=:name")
	public CountryMasterEntity getCountryMasterEntityByName(@Param("name") String name);
	
	
}
