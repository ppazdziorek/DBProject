package com.pazdziorek.myProject.repository.suppliers;

import com.pazdziorek.myProject.dataModel.FinancialData;
import com.pazdziorek.myProject.domain.dataModel.DataRepository;
import org.springframework.stereotype.Component;

@Component
public class RepositorySupplier {

    private DataRepository dataRepository;

    public RepositorySupplier(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public void addNewEntry (FinancialData entry){
        dataRepository.save(entry);
    }

    public boolean checkEntryHasId (FinancialData entry){
        return entry.id == null;
    }
}
