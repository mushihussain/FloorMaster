INSERT INTO customer (name, phone, email, home_address, office_address, created_at)
VALUES ('Alice', '1234567890', 'alice@example.com', 'Home A', 'Office A', CURRENT_TIMESTAMP);

INSERT INTO team_member (name, phone, role)
VALUES ('Bob', '1112223333', 'Measurement'),
       ('Charlie', '4445556666', 'Fitting');

INSERT INTO appointment (customer_id, type, appointment_date, created_at)
VALUES (1, 'Measurement', CURRENT_DATE, CURRENT_DATE);
