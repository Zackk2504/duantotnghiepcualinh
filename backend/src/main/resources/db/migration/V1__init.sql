-- db/migration/V1__init.sql
CREATE TABLE users (
                       id SERIAL PRIMARY KEY,
                       username VARCHAR(50) NOT NULL UNIQUE,
                       password VARCHAR(255) NOT NULL,
                       role VARCHAR(20) NOT NULL
);

INSERT INTO users(username, password, role)
VALUES
('alice', '123', 'STUDENT'),
('bob', '123', 'STUDENT');

CREATE TABLE products (
                          id SERIAL PRIMARY KEY,
                          name VARCHAR(100) NOT NULL,
                          price DECIMAL(10,2) NOT NULL,
                          stock INT NOT NULL
);

CREATE TABLE orders (
                        id SERIAL PRIMARY KEY,
                        user_id INT REFERENCES users(id),
                        created_at TIMESTAMP DEFAULT NOW()
);

CREATE TABLE order_items (
                             id SERIAL PRIMARY KEY,
                             order_id INT REFERENCES orders(id),
                             product_id INT REFERENCES products(id),
                             quantity INT NOT NULL
);
