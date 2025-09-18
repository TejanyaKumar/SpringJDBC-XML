# Spring JDBC XML Project

This is a simple Java project demonstrating **Spring JDBC with XML-based configuration**.  
The project connects to a MySQL database and performs basic CRUD operations using `JdbcTemplate`.

---

## 📂 Project Structure
SpringJDBCXML/
│── src/
│ ├── main/java/com/Employee.java # POJO class
│ ├── main/java/com/Test.java # Test class with JDBC operations
│ └── main/resources/beans.xml # Spring configuration file
│── pom.xml # Maven dependencies
---

## ⚙️ Features
- Spring **XML-based configuration**  
- `JdbcTemplate` integration  
- Basic CRUD operations (Insert, Update, Delete, Select)  
- MySQL database connectivity  

---

## 🛠️ Technologies Used
- Java 17+  
- Spring Framework 6.x  
- Spring JDBC  
- MySQL  
- Maven  

---

## ▶️ How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/TejanyaKumar/SpringJDBC-XML.git
Import as Maven Project in Eclipse/IntelliJ.

Update your MySQL database credentials in beans.xml:

<property name="url" value="jdbc:mysql://localhost:3306/yourdbname" />
<property name="username" value="root" />
<property name="password" value="yourpassword" />


Create the table in MySQL:

CREATE TABLE employees (
    empid INT PRIMARY KEY,
    email VARCHAR(100),
    salary DOUBLE
);


Run Test.java → It will perform queries and print results.

📌 Example Queries (in Test.java)
// Insert
template.update("insert into employees values(?,?,?)", 800, "suraj.sukla@gmail.com", 33000);

// Update
template.update("update employees set email=? where empid=?", "sooraj.rathi@gmail.com", 800);

// Delete
template.update("delete from employees where empid=?", 800);

// Select
Employee employee = template.queryForObject(
    "select * from employees where empid=200",
    new RowMapper<Employee>() {
        @Override
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3));
        }
    }
);
System.out.println(employee);
