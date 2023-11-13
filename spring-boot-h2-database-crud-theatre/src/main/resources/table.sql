CREATE TABLE movie (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    language VARCHAR(255),
    genre VARCHAR(255)
);

CREATE TABLE theatre (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    city VARCHAR(255)
);

CREATE TABLE show (
    id INT PRIMARY KEY AUTO_INCREMENT,
    movie_id INT,
    theatre_id INT,
    timing DATETIME,
    FOREIGN KEY (movie_id) REFERENCES movie(id),
    FOREIGN KEY (theatre_id) REFERENCES theatre(id)
);

CREATE TABLE booking (
    id INT PRIMARY KEY AUTO_INCREMENT,
    show_id INT,
    customer_name VARCHAR(255),
    number_of_seats INT,
    FOREIGN KEY (show_id) REFERENCES show(id)
);
