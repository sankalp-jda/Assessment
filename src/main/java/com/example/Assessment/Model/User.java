    package com.example.Assessment.Model;

    import jakarta.persistence.*;
    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;


    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Data
    @Table(name="Assessment_User")
    public class User {
        @Id
        @GeneratedValue
        @Column(name="user_id")
        private int id;
        @Column(name="username")
        private String username;
        @Column(name="password1")
        private String password1;
        @Column(name="password2")
        private String password2;
        @Column(name="email")
        private String email;
    }
