package springsecurity.model;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String password;
    private int age;
    private String fullname;
    private String role;
    private String email;
    @Column(name = "isactive")
    private String isActive;

    public Student() {
    }

    public Student(String name, String password, int age, String fullname, String role, String email, String isActive) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.fullname = fullname;
        this.role = role;
        this.email = email;
        this.isActive = isActive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String isActive() {
        return isActive;
    }

    public void setActive(String active) {
        isActive = active;
    }
}
