package com.research.MarketAnalysis.repository;

import com.research.MarketAnalysis.entity.ReportModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ReportOperation extends JpaRepository<ReportModel, Long> {
}
