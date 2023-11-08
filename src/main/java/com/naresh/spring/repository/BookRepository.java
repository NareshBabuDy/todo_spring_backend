package com.naresh.spring.repository;

import com.naresh.spring.model.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BookRepository  {
    private JdbcTemplate jdbcTemplate;
    static class BookRowMapper implements RowMapper<Book>{



        @Override
        public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Book(rs.getInt("id"),rs.getString("name"),rs.getString("auth"));
        }
    }
    public List<Book> findAll() {
        return jdbcTemplate.query("SELECT * FROM book", new BookRowMapper());
    }
}
