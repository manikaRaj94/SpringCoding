package com.spring.practice.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ContactDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public int insertData(Contact contact) {
        String query = "INSERT INTO contact (name, email_id, address, telephone) VALUES (?, ?, ?, ?)";
        int response =
                jdbcTemplate.update(query,contact.getName(),contact.getEmail_id(),contact.getAddress(),contact.getTelephone());
        return response;
    }

    public int updateData(Contact contact) {
        String query = " UPDATE contact set address=? where id=?";
        int response =
                jdbcTemplate.update(query,contact.getAddress(),contact.getId());
        return response;
    }

    //@Transactional
    public int deleteData(Contact contact) {
        String query = " DELETE from contact where id=?";
        int response =
                jdbcTemplate.update(query,contact.getId());
        return response;
    }

    public List<Contact> selectAllData() {
        String query = "SELECT * FROM contact";
        List<Contact> response =
                jdbcTemplate.query(query,new ContactRowMapper());
        return response;
    }

    public Contact selectsingleData(int id) {
        String query = "SELECT * FROM contact WHERE id= ?";
        Contact response =
                jdbcTemplate.queryForObject(query,new ContactRowMapper(),id);
        return response;
    }
}
