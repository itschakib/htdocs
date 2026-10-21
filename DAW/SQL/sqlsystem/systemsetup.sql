-- ==============================
-- Switch to the pluggable database (VERY IMPORTANT!)
-- All normal users must be created inside XEPDB1
-- ==============================
ALTER SESSION SET CONTAINER = XEPDB1;

-- ==============================
-- Drop the user if it exists (safe reset)
-- ==============================
BEGIN
   EXECUTE IMMEDIATE 'DROP USER CHAKIBOX CASCADE';
EXCEPTION
   WHEN OTHERS THEN
      IF SQLCODE != -01918 THEN -- ignore "user does not exist" error
         RAISE;
      END IF;
END;
/

-- ==============================
-- Create the user CHAKIBOX with password 'chakibox'
-- ==============================
CREATE USER CHAKIBOX IDENTIFIED BY chakibox
DEFAULT TABLESPACE USERS
TEMPORARY TABLESPACE TEMP
QUOTA UNLIMITED ON USERS;

-- ==============================
-- Grant standard privileges for study
-- ==============================
GRANT CONNECT, RESOURCE TO CHAKIBOX;

-- ==============================
-- Optional: Grant DBA for full control (for experiments)
-- ==============================
GRANT DBA TO CHAKIBOX;

-- ==============================
-- Unlock the user just in case
-- ==============================
ALTER USER CHAKIBOX ACCOUNT UNLOCK;
