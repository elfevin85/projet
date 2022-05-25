package com.example.projet2.view;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchViewModel {

    private String query = "";
    private String name = " ";
    private int id;
    private Date date;

    public String getQuery() {
        return query;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }
}