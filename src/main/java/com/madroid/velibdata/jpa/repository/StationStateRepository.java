package com.madroid.velibdata.jpa.repository;

import com.madroid.velibdata.jpa.model.StationState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StationStateRepository extends JpaRepository<StationState, Long>, JpaSpecificationExecutor<StationState> {
}
