package dev.tarento.paralegal.UserRole;

import dev.tarento.paralegal.Role.Role;
import dev.tarento.paralegal.User.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Role role;

    private LocalDateTime assignedAt;

    @ManyToOne
    @JoinColumn(name = "assigned_by", referencedColumnName = "id")
    private User assignedBy;

    public UserRole() {}
}
