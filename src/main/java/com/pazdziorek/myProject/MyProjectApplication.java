package com.pazdziorek.myProject;

import com.pazdziorek.myProject.dataModel.FinancialData;
import com.pazdziorek.myProject.domain.dataModel.DataRepository;
import com.pazdziorek.myProject.repository.suppliers.RepositorySupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.pazdziorek"})
public class MyProjectApplication implements CommandLineRunner {

    DataRepository dataRepository;
    FinancialData financialData;

    public MyProjectApplication(DataRepository dataRepository, FinancialData financialData) {
        this.dataRepository = dataRepository;
        this.financialData = financialData;
    }

    public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        RepositorySupplier repositorySupplier = new RepositorySupplier(dataRepository);
        Long id = 1L;
        financialData = new FinancialData(id, "Basic category","21 sep 2018");
        repositorySupplier.addNewEntry(financialData);
    }
}
