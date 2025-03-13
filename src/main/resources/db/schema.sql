CREATE TABLE companies (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    company_name VARCHAR(255) NOT NULL,
    universal_name_id VARCHAR(255) NOT NULL UNIQUE,
    background_cover_image_url VARCHAR(500),
    linkedin_internal_id VARCHAR(50),
    profile_photo VARCHAR(500),
    industry VARCHAR(255),
    location VARCHAR(255),
    follower_count VARCHAR(100),   
    tagline VARCHAR(255),
    company_size_on_linkedin VARCHAR(100),
    about TEXT,
    website VARCHAR(500),
    industries VARCHAR(255),
    company_size VARCHAR(100),
    headquarters VARCHAR(255),
    type VARCHAR(255),
    founded VARCHAR(50),
    specialties TEXT,
    description JSON            
);

CREATE TABLE company_locations (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    company_id BIGINT NOT NULL,
    is_hq BOOLEAN,
    office_address_line_1 VARCHAR(255),
    office_address_line_2 VARCHAR(255),
    office_locaion_link VARCHAR(500),
    FOREIGN KEY (company_id) REFERENCES companies(id) ON DELETE CASCADE
);

CREATE TABLE company_employees (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    company_id BIGINT NOT NULL,
    employee_photo VARCHAR(500),
    employee_name VARCHAR(255),
    employee_position VARCHAR(255),
    employee_profile_url VARCHAR(500),
    FOREIGN KEY (company_id) REFERENCES companies(id) ON DELETE CASCADE
);

CREATE TABLE company_updates (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    company_id BIGINT NOT NULL,
    update_order INT,           
    text TEXT,
    article_posted_date VARCHAR(100),
    total_likes VARCHAR(50),
    article_title VARCHAR(255),
    article_sub_title VARCHAR(255),
    article_link VARCHAR(500),
    article_image VARCHAR(500),
    FOREIGN KEY (company_id) REFERENCES companies(id) ON DELETE CASCADE
);

