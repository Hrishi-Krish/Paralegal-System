package dev.tarento.paralegal.DeptBranch;

import dev.tarento.paralegal.Branch.Branch;
import dev.tarento.paralegal.Department.Department;
import dev.tarento.paralegal.User.User;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DeptBranchMapping {

    @EmbeddedId
    private DeptBranch id;

    @MapsId("userId")
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @MapsId("branchId")
    @ManyToOne
    @JoinColumn(name = "branch_id", referencedColumnName = "id")
    private Branch branch;

    @MapsId("departmentId")
    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    private Department department;

    public DeptBranchMapping() {}
}
