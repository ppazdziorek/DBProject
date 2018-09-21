package com.pazdziorek.myProject.dataModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Component
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FIN_DATA")
public class FinancialData {

    @Id
    @Column(name = "ID")
    public Long id;
    @Column(name = "CATEGORY")
    public String category;
    @Column(name = "DATE")
    public String date;
}
