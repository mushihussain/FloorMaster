CREATE TABLE Customer (
    customer_id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    phone VARCHAR(20),
    email VARCHAR(100),
    home_address TEXT,
    office_address TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
CREATE TABLE Appointment (
    appointment_id SERIAL PRIMARY KEY,
    customer_id INT REFERENCES Customer(customer_id),
    type VARCHAR(20) CHECK (type IN ('Measurement', 'Fitting')),
    appointment_date DATE NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
CREATE TABLE Team_Member (
    team_member_id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    phone VARCHAR(20),
    role VARCHAR(20) CHECK (role IN ('Measurement', 'Fitting', 'Admin'))
);
CREATE TABLE Appointment_Assignment (
    assignment_id SERIAL PRIMARY KEY,
    appointment_id INT REFERENCES Appointment(appointment_id),
    team_member_id INT REFERENCES Team_Member(team_member_id)
);
CREATE TABLE Measurement_Detail (
    measurement_id SERIAL PRIMARY KEY,
    appointment_id INT REFERENCES Appointment(appointment_id),
    location_name VARCHAR(100),
    length DECIMAL(10,2),
    width DECIMAL(10,2),
    notes TEXT
);
CREATE TABLE Payment (
    payment_id SERIAL PRIMARY KEY,
    appointment_id INT REFERENCES Appointment(appointment_id),
    total_amount DECIMAL(10,2),
    deposit_paid DECIMAL(10,2),
    balance DECIMAL(10,2) 
    --GENERATED ALWAYS AS (total_amount - deposit_paid) STORED
);
CREATE TABLE Material (
    material_id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    in_stock BOOLEAN DEFAULT TRUE,
    ordered BOOLEAN DEFAULT FALSE,
    supplier VARCHAR(100),
    order_amount DECIMAL(10,2),
    expected_delivery DATE
);
CREATE TABLE Appointment_Material (
    id SERIAL PRIMARY KEY,
    appointment_id INT REFERENCES Appointment(appointment_id),
    material_id INT REFERENCES Material(material_id)
);
CREATE TABLE App_User (
    user_id SERIAL PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password_hash TEXT NOT NULL,
    role VARCHAR(20) CHECK (role IN ('Admin', 'Team', 'Fitter')),
    team_member_id INT REFERENCES Team_Member(team_member_id)
);
