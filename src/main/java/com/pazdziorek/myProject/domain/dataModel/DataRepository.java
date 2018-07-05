package com.pazdziorek.myProject.domain.dataModel;

import com.pazdziorek.myProject.dataModel.FinancialData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends CrudRepository<FinancialData,Long>{
}
