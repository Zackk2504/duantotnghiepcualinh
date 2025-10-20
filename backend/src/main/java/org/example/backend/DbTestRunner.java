package org.example.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DbTestRunner implements CommandLineRunner {

    private final JdbcTemplate jdbcTemplate;

    // Constructor injection
    public DbTestRunner(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello world");
        try {
            Integer count = jdbcTemplate.queryForObject(
                    "SELECT COUNT(*) FROM users", Integer.class
            );
            System.out.println("Users table count: " + count);
        } catch (Exception e) {
            System.out.println("Error querying users table: " + e.getMessage());
        }
    }
}

