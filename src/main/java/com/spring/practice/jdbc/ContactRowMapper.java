package com.spring.practice.jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ContactRowMapper implements RowMapper<Contact> {
    @Override
    public Contact mapRow(ResultSet resultSet, int i) throws SQLException {

        Contact contact = new Contact();
        contact.setId(resultSet.getInt("id"));
        contact.setName(resultSet.getString("name"));
        contact.setEmail_id(resultSet.getString("email_id"));
        contact.setAddress(resultSet.getString("address"));
        contact.setName(resultSet.getString("telephone"));
        return contact;
    }
}
