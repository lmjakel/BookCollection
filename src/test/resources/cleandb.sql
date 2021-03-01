delete from author;
delete from genre;
delete from user;
delete from book;


INSERT INTO author VALUES (1,'Maas','Sarah J.'),
                          (2,'Clare','Cassandra'),
                          (3,'King','Stephen'),
                          (4, 'Sanderson', 'Brandon'),
                          (5, 'Roberts', 'Nora');

INSERT INTO genre VALUES (1,'Young Adult'),
                          (2,'Science Fiction'),
                          (3,'History'),
                          (4, 'Mystery'),
                          (5, 'Romance');

INSERT INTO user VALUES (1,'LeeAnn','Jakel', 'ljakel', 'password', 'email@something.com'),
                          (2,'Max','Jakel', 'mjakel', 'password', 'email@something.com'),
                          (3,'Lisa','Andritsch', 'lisa', 'password', 'email@something.com'),
                          (4, 'Anthony','Rice', 'ricerocks', 'password', 'email@something.com'),
                          (5, 'Paula','Waite', 'pwaite', 'password', 'email@something.com');

INSERT INTO book VALUES (1, 'A Court Of Thorns and Roses', '978-1408857861', 1, 1, 1),
                        (2, 'The Way of Kings', '978-0765365279', 4, 4, 2),
                        (3, 'Dark Witch', '978-0425259856', 1, 5, 5);

