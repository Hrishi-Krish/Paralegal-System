package dev.tarento.paralegal.DeptBranch;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Data
public class DeptBranch implements Serializable {

    private UUID userId;
    private Long departmentId;
    private Long branchId;

    public DeptBranch() {}

}
