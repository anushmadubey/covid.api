package com.anushma.covid.api.dao.interfaces;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.anushma.covid.api.dao.model.StatusMasterEntity;

public interface IStatusMasterRepository extends CrudRepository<StatusMasterEntity, Long> {

	
	@Query("SELECT sm FROM StatusMasterEntity sm WHERE id=:id AND isActive='1'")
	public StatusMasterEntity getStatusMasterById (@Param("id") Long id);

	@Query("SELECT sm FROM StatusMasterEntity sm WHERE name=:name AND isActive='1'")
	public StatusMasterEntity getStatusMasterByName (@Param("name") String name);
	
	@Query("SELECT sm FROM StatusMasterEntity sm WHERE isActive='1'")
	public StatusMasterEntity getAllStatusMaster ();

	
}
